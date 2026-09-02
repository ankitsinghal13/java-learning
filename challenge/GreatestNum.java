import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter  tje numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.print(a + " is the greatest number");
        }

        else if ( b>a && b>c){
            System.out.print(b + " is the greatest number");
        }

        else {
            System.out.print(c + " is the greatest number");
        }
    }
}