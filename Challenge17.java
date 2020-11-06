package challenge17;

public class Challenge17 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-1264));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int firstDigit;
        int restOfNum = number;
        char[] numberArr = (number + "").toCharArray();
        for (int i = 0; i < numberArr.length; i++) {
            firstDigit = restOfNum % 10;
            restOfNum = restOfNum / 10;
            if (firstDigit % 2 == 0) {
                sum += firstDigit;
            }
        }
        return sum;
    }
}
