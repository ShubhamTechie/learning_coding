import java.util.Scanner;

public class TrangleArea {


    public static void main(String[] args) {

        System.out.println("welcome to the calculator");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter base   =   ");
        double base = sc.nextDouble();
        System.out.println("enter height  =  ");
        double height = sc.nextDouble();

        double area = 0.5 * (base * height);

        System.out.println("area of triangle is   =  " + area );
    }
}
