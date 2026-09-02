import java.util.Scanner;

public class lcm {
    public static void main ( String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = input.nextInt();

        System.out.print("Enter number b: ");
        int b = input.nextInt();

        while(a % b !=0){
            a += a;
        }
        int lcm = a;
        System.out.print(lcm);
    }
}