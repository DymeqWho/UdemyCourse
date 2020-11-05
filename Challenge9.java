package challenge9;

public class Challenge9 {
    public static void main(String[] args) {

        printYearsAndDays(-525600L);
        printYearsAndDays(1051200L);
        printYearsAndDays(561600L);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 60 / 24;
            long years = days / 365;
            if (days % 365 == 0) {
                days = 0;
            } else if (days % 365 != 0) {
                days = days % 365;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
