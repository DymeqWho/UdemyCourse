package challenge4;

public class challenge4 {
    public static void main(String[] args) {
        System.out.println("isLeapYear() = " + isLeapYear(1896));
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
}