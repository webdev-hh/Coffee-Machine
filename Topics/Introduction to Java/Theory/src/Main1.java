import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.toLowerCase().contains("j"));
    }
}