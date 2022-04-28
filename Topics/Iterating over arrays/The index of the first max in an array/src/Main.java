import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        int maxValue = 0;
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
            if (i == 0) {
                maxValue = a[0];
            } else if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        scanner.close();
        int j = 0;
        for (int value : a) {
            if (value == maxValue) {
                System.out.println(j);
                break;
            }
            j++;
        }
    }
}