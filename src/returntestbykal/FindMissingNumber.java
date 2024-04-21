package returntestbykal;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] numbers = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10,12};   //10 is missing
        int N = 12;
        int idealSum = (N * (N + 1)) / 2;
        int sum = Arrays.stream(numbers).sum();
        int missingNumber = idealSum - sum;  //SOP( prints here);
        System.out.println("missingNumber ::" + missingNumber);
    }
}
