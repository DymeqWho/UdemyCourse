package challenge27;

import java.util.Scanner;

public class Challenge27 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        int i = 1;
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                num = scanner.nextInt();
                sum += num;
                i++;
            } else {
                long avg = Math.round((double) sum / (i - 1));
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
        scanner.close();
    }
}