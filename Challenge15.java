package challenge15;

import java.util.Arrays;

public class Challenge15 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        String numberS = number + "";
        char[] numberArry;
        numberArry = numberS.toCharArray();
        char[] backwordsNumberArry = new char[numberS.length()];
        for (int i = 0; i < numberArry.length; i++) {
            backwordsNumberArry[numberArry.length - i - 1] = numberArry[i];
        }
      //  System.out.println("Arrays.toString(numberArry) = " + Arrays.toString(numberArry));
      //  System.out.println("Arrays.toString(backwordsNumberArry) = " + Arrays.toString(backwordsNumberArry));
        return Arrays.equals(backwordsNumberArry, numberArry);
    }
}
