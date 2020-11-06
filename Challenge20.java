package challenge20;

public class Challenge20 {
    public static void main(String[] args) {
        System.out.println("getGreatestCommonDivisior() = " + getGreatestCommonDivisor(30, 311));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int i;
            if (first > second) {
                i = first;
            } else {
                i = second;
            }
            for (int j = i; j >= 1; j--) {
                if (first % j == 0 && second % j == 0) {
                    return j;
                }
            }
        }
        return -1;
    }
}
