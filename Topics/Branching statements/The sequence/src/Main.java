import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int count = 0;
        boolean next = true;
        for (int i = 1; next; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                count++;
                if (count == n) {
                    next = false;
                    break;
                }
            }
        }

    }
}