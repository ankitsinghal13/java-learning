import java.util.Scanner;

public class minandmax{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in array: ");
        int num = scan.nextInt();
        int arr[] = new int[num];

        int i =0 ;
        while (i < arr.length){
            System.out.print("Enter the element no " + (i+1) + ": ");
            arr[i] = scan.nextInt();
            i++;

        }

        int min = arr[0];
        int j=0;
        while( j < arr.length){
            if(min > arr[j]){
                min = arr[j];
            }
            j++;
        }

         int max = arr[0];
        int k=0;
        while( k < arr.length){
            if(max < arr[k]){
                max = arr[k];
            }

            k++;
        }


     System.out.println("min is:" + min);  
     System.out.println("max is:" + max);  
    }
}