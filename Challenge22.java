package challenge22;

public class Challenge22 {
    public static void main(String[] args) {
        System.out.println("isPerfectNumber() = " + isPerfectNumber(33550336));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                    sum += i;
                }
            }
            return sum == number;
        }
        return false;
    }
}
