

public class cond {
  public static void main(String[] args) {
    
  

  int number = 10;

  if (number > 5) {
      System.out.println("Number is greater than 5");
  }

  int number2 = 4;
if (number > 5) {
    System.out.println("Number is greater than 5");
} else {
    System.out.println("Number is less than or equal to 5");
}


int number3 = 10;
if (number > 15) {
    System.out.println("Number is greater than 15");
} else if (number > 5) {
    System.out.println("Number is greater than 5 but less than or equal to 15");
} else {
    System.out.println("Number is 5 or less");
}


int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");
}

  
  }
  
}
