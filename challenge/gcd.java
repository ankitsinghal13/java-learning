import java.util.Scanner;

public class gcd{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a:");
        int a = input.nextInt();

        System.out.print("enter b:");
        int b = input.nextInt();
        int small;
        if(a<b){
            small = a;
        }
        else {
            small = b;
        }
        int gcd = 0;
        while (small > 0){
            if( a % small ==0 && b % small == 0){
                gcd = small;
                break;
            }
            small--;
        }

        System.out.print(gcd);
    }
}