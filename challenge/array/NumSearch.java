import java.util.Scanner;

public class NumSearch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in array: ");
        int num = input.nextInt();          //declaration of the array
        double[] arr = new double[num];

        int i=0;        //input
        while(i<num){
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i] = input.nextDouble();
            i++;
        }


        //  System.out.print("elements in the array: ");        //OUTPUT

        // int j=0;
        // while(j<num){
        //     System.out.print(arr[j] + " ");
            
        //     j++;
        // 

        
    }

    public static void countOccurence(int[] numArr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter element to count its occurence:");
        int search = input.nextInt();
        int count= 0;
        int k =0;
        while(k < numArr.length){
            if(numArr[k] == search){
                 count++;
                  
            }
             k++; 

            
        }
        System.out.print("it appears " + count + " times");
    }
}