import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] intArray = new int[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }
        int searchedNumber = scanner.nextInt();
        scanner.close();
        for (int number : intArray) {
            if (number == searchedNumber) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}