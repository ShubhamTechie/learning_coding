import java.util.Scanner;

public class User_inputs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" please enter your name :   shub");

        String s = sc.nextLine();

        System.out.println("good morning " + s);
        System.out.println("enter your age");

        int age = sc.nextInt();
        System.out.println(age);


        System.out.println("Details");
        System.out.println("Name  :" + s + "  Age  : " + age);
        /* user input
         * Scanner s = new Scanner(System.in);
         *
         *
         * String name = nextInt();
         * nextInt();
         *
         *nextDouble
         *
         *
         *
         *
         *
         *
         *
         *
         *  */


    }
}
