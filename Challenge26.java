package challenge26;

public class Challenge26 {
    public static void main(String[] args) {
        printSquareStar(11);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int r = 1; r <= number; r++) {
                for (int c = 1; c <= number; c++) {
                    if (r == 1 || r == number || c == 1 || c == number || c == r || c == number - r + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
