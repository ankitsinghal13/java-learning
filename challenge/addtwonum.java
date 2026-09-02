import java.util.Scanner;

public class addtwonum {
    public static void main(String[] args) {
        System.out.print("Enter two numbers :");
        Scanner input = new Scanner(System.in);
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        int sum = int1 + int2;
        System.out.print("The sum is : " + sum);
    }
}