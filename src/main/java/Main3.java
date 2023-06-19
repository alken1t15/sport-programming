import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < b; i++) {
            temp2 += d;
        }

        for (int i = 0; i < a; i++) {
            temp1 += c;
        }

        System.out.println(Math.min(temp1, temp2));


    }
}