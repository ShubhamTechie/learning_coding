public class SortedArray {


    public static void main(String[] args) {


        System.out.println("welcome to the sorted array checker");

        int[] myArr =ArrayUtility.inputArray();

        boolean inc =isIncreasing(myArr);
        boolean dec = isDecreasing(myArr);
        if (inc || dec){
            System.out.println("your array is sorted");
        }else {
            System.out.println("your array not is sorted");
        }

    }


    public static boolean isDecreasing(int[] myArr){

        int i=1;
        while (i < myArr.length){
            if (myArr[i] > myArr[i-1]){
                return false;
            }
            i++;
        }


        return true;
    }

    public static boolean isIncreasing(int[] myArr){

        int i=1;
        while (i < myArr.length){
            if (myArr[i] < myArr[i-1]){
                return false;
            }
            i++;
        }


        return true;
    }
}
