public class starp{
    public static void main (String[] args) {
        int i = 5;

        while(i>=1){
            int j =i;
            while (j>=1){
                System.out.print("*");
                j--;
            }
            int k =i-4;
            while (k>=1){
                System.out.print("%");
                k--;
            }
            System.out.println("");
            i--;
        }
    }
}





//     *
//    **
//   ***
//  **** 
// *****