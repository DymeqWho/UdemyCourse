package challenge18;

public class Challenge18 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 10 && a <= 99) && (b >= 10 && b < 100)) {
            int firstDigitA = a%10;
            int secondDigitA = a/10;
            int firstDigitB = b%10;
            int secondDigitB = b/10;
            return firstDigitA == firstDigitB || firstDigitA == secondDigitB
                    || firstDigitB == secondDigitA || secondDigitA == secondDigitB;
        }
        return false;
    }
}
