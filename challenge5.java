package challenge5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class challenge5 {
    public static void main(String[] args) {
        System.out.println("areEqualByThreeDecimalPlaces() = " + areEqualByThreeDecimalPlaces(13.1256, 3.125));
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        BigDecimal roundFirst = BigDecimal.valueOf(first);
        roundFirst = roundFirst.setScale(3, RoundingMode.DOWN);
        BigDecimal roundSecond = BigDecimal.valueOf(second);
        roundSecond = roundSecond.setScale(3,RoundingMode.DOWN);

        return roundFirst.equals(roundSecond);
    }
}
