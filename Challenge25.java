package challenge25;

public class Challenge25 {
    public static void main(String[] args) {
        System.out.println("getLargestPrime1(27) = " + getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        int numberToConsideration;
        if (number >= 2) {
            for (int i = (number - 1); i >= 2; i--) {
                if (number % i == 0) {
                    numberToConsideration = i;
                    number = numberToConsideration;
                }
            }
            return number;
        }
        return -1;
    }
}
