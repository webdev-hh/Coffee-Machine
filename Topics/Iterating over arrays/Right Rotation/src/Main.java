import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotate = scanner.nextInt();
        scanner.close();
        rotate = rotate % numArr.length;
        rotateToRight(numArr, rotate);
    }

    public static void rotateToRight(int[] a, int r) {
        int count = 1;
        while (count <= r) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
            count++;
        }
        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
