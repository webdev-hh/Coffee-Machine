import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int number;
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            number = scanner.nextInt();
            sum += number;
        }
        scanner.close();
        System.out.println(sum);
    }
}