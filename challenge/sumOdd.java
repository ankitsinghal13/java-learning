// sum all odd numbers from 1 to a number N.



import java.util.Scanner;

public class sumOdd {

    public static void main ( String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number uptill which you want the sum of all odd numbers : ");

        int num = input.nextInt();

        int sum = calSum(num);
        
        System.out.print("The sun is " + sum);
    }

    public static int calSum(int num){

        int i = 1 ,  sum = 0;
        while ( i <= num){
            if(num % 2 ==1 ){
                sum = sum + i;
                i++;
            }
        }
         return sum;
    }
}



