import java.util.Scanner;

public class Numcheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        double num = input.nextDouble();

        if(num == 0 ){
            System.out.print("The number is zero");
        }

        else if(num < 0 ){
            System.out.print("The number is negative");
        }
        
        else if(num > 0 ){
            System.out.print("The number is positive");
        }

        else{
            System.out.print("You did not enter a number");
        }
    }
}