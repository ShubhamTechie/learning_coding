import java.util.Scanner;

public class SimpleInterest {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter value of : p  = ");
        double p = sc.nextInt();
        System.out.println("enter value of : r  = ");
        double r = sc.nextDouble();
        System.out.println("enter value of : t  = ");
        double t = sc.nextDouble();

//        double simpleInterest = ((p * r * t) * 0.01);
//
//        System.out.println("simple interest : =  " + simpleInterest);

        double compoundInterst = p * Math.pow((1 + (r * 0.01)), t);

        System.out.println("compound interest : =  " + compoundInterst);


    }
}
