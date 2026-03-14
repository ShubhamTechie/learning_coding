import java.util.Scanner;

public class FunctionMethods {

    public static void main(String[] args) {

//         greeting();
//
//        paternTrianglr();

       int first =  readNumber();
       int second = readNumber();


        int sum = first + second;
        System.out.println(sum);
    }


    public static void greeting(){

        System.out.println(" good morining");
    }



    public static void paternTrianglr(){

        int rows= 0;

        while(rows<5){
            System.out.print("*");

            int j =0;
            while ( j<rows){
                System.out.print(" *");
                j++;
            }

            System.out.println();
            rows++;
        }
    }
    public static int readNumber(){

        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        return num;

    }



}
