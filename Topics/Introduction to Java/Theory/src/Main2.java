import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        scanner.close();
        int z = 0;
        for (int i = 0; i < size; i++) {
            if(intArray[i] == n)
                z ++;
        }
        System.out.println(z);
    }
}
