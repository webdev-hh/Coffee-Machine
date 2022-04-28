import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int maxValue = 0;
        do {
            n = scanner.nextInt();
            if (maxValue < n) {
                maxValue = n;
            }
        } while (n != 0);
        System.out.println(maxValue);
    }
}