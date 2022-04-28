import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = scanner.nextInt();
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(num[j]);
        }
    }
}
