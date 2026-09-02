import java.util.Scanner;

public class SumOfDigits {
    public static void main ( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = input.nextInt();
        int sum = 0, last;
        while(num != 0){
            last = num % 10;
            sum = sum + last;
            num = num / 10;

        }
        System.out.print(sum);
    }
}