import java.util.Scanner;

public class Arithmatic{
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int addition = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("------- Operations ------");
        System.out.println("addition :" + addition);
        System.out.println("sub :" + sub);
        System.out.println("mul :" + mul);
        System.out.println("div :" + div);
        System.out.println("mod :" + mod);
        



    }
}