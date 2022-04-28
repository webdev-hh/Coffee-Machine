import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heigthBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int[] bridgeHeigth = new int[numberOfBridges];
        int counter = 0;
        for (int i = 0; i < numberOfBridges; i++) {
            bridgeHeigth[i] = scanner.nextInt();
            counter++;
            if (bridgeHeigth[i] <= heigthBus) {
                System.out.println("Will crash on bridge " + counter);
                break;
            }
        }
        if (counter == numberOfBridges) {
            System.out.println("Will not crash");
        }

    }
}
