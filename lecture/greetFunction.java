public class greetFunction{
    public static void main(String[] args) {
        System.out.print(
            "this is before function\n"
        );
        greetUser();

        System.out.print(
            "this is after function"
        );


    }

    public static void greetUser(){
        System.out.print("HELLO user welcomne to java\n");
    }
}