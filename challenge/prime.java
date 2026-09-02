import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter THE number :");
        int n = input.nextInt();

        
        
        boolean isPrime = true;

        int i =2;
        while ( i < n) {
            if( n % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }

        if(n <=1){
            System.out.print("its not prime");
        }
        
        else if(isPrime == true){
            System.out.print("its prime");
        }
        else {
            System.out.print("its not prime number");
        }
        }

    }
