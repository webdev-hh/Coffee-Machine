import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            number += 2;
        } else {
            number += 1;
        }
        System.out.println(number);
    }
}