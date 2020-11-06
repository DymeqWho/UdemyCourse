package challenge16;

public class Challenge16 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        String numberS = number + "";
        char[] numbersArr = numberS.toCharArray();
        String firstDigit = numbersArr[0] + "";
        String lastDigit = numbersArr[numbersArr.length - 1] + "";
        int sum = Integer.parseInt(firstDigit) + Integer.parseInt(lastDigit);
        return sum;
    }
}
