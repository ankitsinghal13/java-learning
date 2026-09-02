public class starPattern {
    public static void main (String[] args ) {
        star();
        System.out.print("\n\n");
        revstar();

    }

    public static void star(){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }

     public static void revstar(){
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}