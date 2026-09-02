import java.util.Scanner;


public class ProdFloat {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two float numbes :");

        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println(
            "product of these numbers are :"
        );

        System.out.println(" " + a*b);

    }
}