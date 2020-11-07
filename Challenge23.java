package challenge23;

import java.util.ArrayList;
import java.util.List;

public class Challenge23 {
    public static void main(String[] args) {
        System.out.println("getDigitCount(0) = " + getDigitCount(0));
        System.out.println("getDigitCount(123) = " + getDigitCount(123));
        System.out.println("getDigitCount(-12) = " + getDigitCount(-12));
        System.out.println("getDigitCount(5200) = " + getDigitCount(5200));
        System.out.println("reverse(1015) = " + reverse(1015));
        numberToWords(-123);
        numberToWords(10);
        numberToWords(2368);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        List<Integer> listOfInt = new ArrayList<>();
        int firstDigit;
        int restOfNum = number;
        for (int i = 0; i < getDigitCount(number); i++) {
            firstDigit = restOfNum % 10;
            restOfNum = restOfNum / 10;
            listOfInt.add(firstDigit);
        }
        for (int i = 0; i < listOfInt.size(); i++) {
            firstDigit = listOfInt.get(listOfInt.size() -i -1);
            switch (firstDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        String numberS = number + "";
        return numberS.toCharArray().length;
    }

    public static int reverse(int number) {
        int numberOrigin = number;
        if (number < 0) {
            number *= -1;
        }
        List<Integer> listOfInt = new ArrayList<>();
        int firstDigit;
        int restOfNum = number;
        for (int i = 0; i < getDigitCount(number); i++) {
            firstDigit = restOfNum % 10;
            restOfNum = restOfNum / 10;
            listOfInt.add(firstDigit);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < listOfInt.size(); i++) {
            String numberS = listOfInt.get(i).toString();
            stringBuilder.append(numberS);
        }
        int reversedNumber = Integer.parseInt(stringBuilder.toString());
        if (numberOrigin < 0) {
            reversedNumber *= -1;
        }
        return reversedNumber;
    }
}

