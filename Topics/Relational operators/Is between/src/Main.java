import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        boolean answer = (a >= b || a >= c) && (a <= c || a <= b);
        System.out.println(answer);
    }
}