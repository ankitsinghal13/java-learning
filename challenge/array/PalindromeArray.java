import java.util.Scanner;
import java.util.Arrays;

public class PalindromeArray{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numArr = ArrayUtility.inputArray();

        int[] newArr = new int[numArr.length];

        

        int i = (numArr.length - 1);
        int j =0;
        while ( i  >= 0 && j<=(numArr.length-1)){
            newArr[j] = numArr[i];
            i--;
            j++;
        }
        System.out.println("old array:");
        ArrayUtility.printArray(numArr);
        System.out.println();
        System.out.println("new array:");
        ArrayUtility.printArray(newArr);

        if (Arrays.equals(numArr,newArr)){
            System.out.print("Array is a palindrome.");
        }
        else{
            System.out.print("Array is not a palindrome.");
        }
    }  
}