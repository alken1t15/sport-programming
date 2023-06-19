import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        int temp = 1;
        int count = 0;
        while (true){
            if(number % temp  == 0){
                count++;
                if (count==2){
                    break;
                }
            }
            temp+=1;
        }
        long size = number / temp;
        if(temp==997){
            long finalNumber = number * (temp-1L);
            System.out.println(finalNumber);
            return;
        }
        if (temp==size){
            System.out.println(0);
        }
        else {
            System.out.println(size + size);
        }
    }
}