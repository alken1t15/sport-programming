import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int temp = 1;
        int count = 0;
        while (true){
            if(number % temp  == 0){
//                count++;
                System.out.println(temp);
//                if (count==2){
//                    break;
//                }
            }
            temp+=1;
        }
//        long size = number / temp;
//        long pow = (long) Math.pow(size,2);
//        long temp3 = pow-number;
//        System.out.println(temp3);
    }
}