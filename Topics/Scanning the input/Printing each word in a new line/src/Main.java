import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numOfWords = 5;
        String[] wordArray = new String[numOfWords];
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = scanner.next();
        }
        scanner.close();
        for (String j : wordArray) {
            System.out.println(j);
        }
    }
}