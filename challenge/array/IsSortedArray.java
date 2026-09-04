import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        
        int[] numArr = ArrayUtility.inputArray();

        boolean isSortedInc = isIncreasingArray(numArr);
        boolean isSortedDec = isDecreasingArray(numArr);

        if ( isSortedDec || isSortedInc){
            System.out.print("The array is sorted.");
        }
        else{
            System.out.print("The array is not sorted.");
        }

    
    }

    public static boolean isIncreasingArray(int[] numArr){
            int i =1;
            while(i < numArr.length){
                if(numArr[i] < numArr[i-1]){
                    return false;
                }

                i++;
            }
            return true;
        }

         public static boolean isDecreasingArray(int[] numArr){
            int i =1;
            while(i < numArr.length){
                if(numArr[i] > numArr[i-1]){
                    return false;
                }

                i++;
            }
            return true;
        }
}
