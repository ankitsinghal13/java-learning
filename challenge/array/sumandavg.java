// sum and average of all elements in an  array.



import java.util.Scanner;

public class sumandavg{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in array: ");
        int num = input.nextInt();          //declaration of the array
        int[] arr = new int[num];

        int i=0;        //input
        while(i<num){
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i] = input.nextInt();
            i++;
        }

        int sum = 0;
        int k=0;
        while(k<num){
            sum += arr[k];
            
            k++;
        }
        int avg = sum/num;

        System.out.print("elements in the array: ");        //OUTPUT

        int j=0;
        while(j<num){
            System.out.print(arr[j] + " ");
            
            j++;
        }


        System.out.println();
        System.out.println("the sum is: " + sum);
        System.out.println("the average is: " + avg);

    }
}