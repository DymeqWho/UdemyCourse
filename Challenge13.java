package challenge13;

public class Challenge13 {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 20020));
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year <= 9999) {
            boolean isBy4 = year % 4 == 0;
            boolean isBy100 = year % 100 == 0;
            boolean isBy400 = year % 400 == 0;
            if (isBy4 || isBy100) {
                if (isBy100) {
                    return isBy400;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        if (month == 1) {
            return 31;
        }
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else if (month == 2 && !isLeapYear(year)) {
            return 28;
        }
        if (month == 3) {
            return 31;
        }
        if (month == 4) {
            return 30;
        }
        if (month == 5) {
            return 31;
        }
        if (month == 6) {
            return 30;
        }
        if (month == 7) {
            return 31;
        }
        if (month == 8) {
            return 31;
        }
        if (month == 9) {
            return 30;
        }
        if (month == 10) {
            return 31;
        }
        if (month == 11) {
            return 30;
        }
        if (month == 12) {
            return 31;
        }
        return -1;
    }
}
