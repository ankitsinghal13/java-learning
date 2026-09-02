import java.util.Scanner;

public class Factorial {
    public static void main (String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num = input.nextInt();
        long fact = 1;


        while(num >=1){
            fact = fact * num;
            num--;
        }

        System.out.print("factorial is : " + fact);
    }
}