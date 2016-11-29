import java.util.Arrays;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class ArrayProblems {
    public static void main(String[] args) {

//        getMax();
        separateParity();
    }

    private static void separateParity() {
        int[] intArray = {9, 7, 14, 2, 5};
        int[] evenArray = new int[intArray.length];
        int[] oddArray = new int[intArray.length];
        int indexOdd = 0, indexEven = 0;
        for(int elem : intArray) {
            if(elem % 2 == 0) {
                evenArray[indexEven] = elem;
                indexEven++;
            } else {
                oddArray[indexOdd] = elem;
                indexOdd++;
            }
        }
        System.out.println("Even");
        for(int even : evenArray) {
            System.out.println(even);
        }
        System.out.println("Odd");
        for(int odd : oddArray) {
            System.out.println(odd);
        }
    }

    private static void getMax() {
        int[] intArray = {9, 7, 14, 2, 5};
        int max = intArray[0];

        for(int i=1; i< intArray.length; i++) {
            if(max < intArray[i]) {
                max = intArray[i];
            }
        }
        System.out.println(max);
    }
}