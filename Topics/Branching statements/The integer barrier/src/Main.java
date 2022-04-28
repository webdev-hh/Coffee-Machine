import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        final int max = 1000;
        do {
            int n = scanner.nextInt();
            sum += n;
            if (sum >= max) {
                System.out.println(sum - max);
                break;
            } else if (n == 0) {
                System.out.println(sum);
                break;
            }
        } while (scanner.hasNextInt());
    }
}