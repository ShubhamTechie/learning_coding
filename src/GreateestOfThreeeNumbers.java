import java.util.Scanner;

public class GreateestOfThreeeNumbers {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter num 1 : ");
        int num1 = input.nextInt();
        System.out.println("enter num 2 : ");
        int num2 = input.nextInt();
        System.out.println("enter num 3 : ");
        int num3 = input.nextInt();


        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1  + " num1 is the greatest number");
        } else if (num2 >= num3) {
            System.out.println(num2  + " num2 is the greatest number");

        }else {

            System.out.println(" num3 is the greatest number");
        }


    }
}
