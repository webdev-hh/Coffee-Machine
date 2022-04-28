import java.util.Scanner;
    class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int l = scanner.nextInt();
            int h = scanner.nextInt();
            scanner.close();
            int sum = 0;
            for (int i = l; i <= h; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

    }