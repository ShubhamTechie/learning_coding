import java.util.Enumeration;
import java.util.Scanner;

public class Patterns {


    public static void main(String[] args) {


        System.out.println("enter your number");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

//        printRectangle(num );
//        invertwdRectabgle(num);
        leftRectabgle(num);
    }


    public static void printRectangle(int num) {

        int i = 0;


        while (i < num) {
            System.out.print("*");

            int j = 0;
            while (j < i) {
                System.out.print(" *");
                j++;

            }
            System.out.println();
            i++;
        }


    }

    public static void invertwdRectabgle(int num) {


        int rows = num;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }


    }

    public static void leftRectabgle(int num) {


        int rows = num;
        while (rows > 0) {

            int j=0;
            while (j < rows-1){

                System.out.print("  ");
                j++;
            }


            int i = 0;

            while (i <= num - rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
}
