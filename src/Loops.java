import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {




//        int num=500;  // initialization
//        while (num >=200){  //condition
//
//            System.out.println(num); // actual work
//
//            num--;


            Scanner input = new Scanner(System.in);

            int i=0;
            while (i<=10){
            int num =input.nextInt();
                System.out.println(num);
                i++;
        }
    }
}
