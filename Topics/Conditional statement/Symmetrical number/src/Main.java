import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int a = number / 1000;
        int b = (number - a * 1000) / 100;
        int c = ((number - a * 1000 - b * 100) / 10);
        int d = number - a * 1000 - b * 100 - c * 10;
        if (a == d && b == c) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}