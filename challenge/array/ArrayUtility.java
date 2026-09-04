import java.util.Scanner;

public class ArrayUtility {
     public static int[] inputArray(){
            Scanner input = new Scanner(System.in);
        
            System.out.print("Enter the number of elements you want in array: ");
            int size = input.nextInt();

            int[] numArr = new int[size];
            System.out.print("Enter the elements in array.\n");

            int i=0;
            while(i < size){
                System.out.print("Enter the element no. " + (i+1) + ": ");
                numArr[i] = input.nextInt();
                i++;

            }

            return numArr;
        }

        public static void printArray(int[] numArr){
            int i=0;
            while (i < numArr.length){
                System.out.print(numArr[i] + " ");
                i++;
            }
        }

         public static int countOccurence(int[] numArr){
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
        return count;
    }
}