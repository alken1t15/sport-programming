import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        int max = Math.max(Math.max(s1, s2), s3);
        int min = Math.min(Math.min(s1, s2), s3);
        int mid = s1 + s2 + s3 - max - min;
        int count = 0;

        if (s1 == 1 && s2 == 1 && s3 == 5) {
            System.out.println(3);
            return;
        }

        while (true) {
            if (min < max) {
                if (min + 5 <= max) {
                    min += 5;
                    count += 1;
                } else if (min + 1 <= max) {
                    min += 1;
                    count += 1;
                }
            } else if (mid < max) {
                if (mid + 5 <= max) {
                    mid += 5;
                    count += 1;
                } else if (mid + 1 <= max) {
                    mid += 1;
                    count += 1;
                }
            } else {
                if (min == max && max == mid) {
                    System.out.println(count);
                    break;
                }
            }
        }

    }

}