import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int count = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % n == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}