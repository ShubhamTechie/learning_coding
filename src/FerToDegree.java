import java.util.Scanner;

public class FerToDegree {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);


        System.out.println("welcome to tempreature convertor");


        System.out.println("enter your trmpl in fer");


        float feh = sc.nextFloat();
       float cel = (feh - 32)  * 5 / 9 ;

        System.out.println("your trewmp is   "   + cel +  "c");


    }
}
