import java.util.Scanner;

public class Table{
    public static void main(String[] args) {

        int num = readNum();

        printTable(num);
        
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to print its table : ");
        int num = input.nextInt();
        return num;
    }

    public static void printTable(int num){
        int i=1;
        while(i<=20){
            System.out.println( num + " X " + i + " = " + (num*i));
            i++;
        }
    }
}


/*
3 x1 = 3
3 x2 = 6
3 x3 = 9
3 x4 = 12
3 x5 = 15
3 x6 = 18
3 x7 = 21
3 x8 = 24
3 x9 = 27
3 x10 = 30
*/