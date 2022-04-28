import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String grade;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i <= n; i++) {
            grade = scanner.nextLine();
            switch (grade) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
                case "D":
                    d++;
                    break;
                default:
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}