import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        scanner.close();
        System.out.println(input1.replace(" ", "").equals(input2.replace(" ", "")));
    }
}