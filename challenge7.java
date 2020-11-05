package challenge7;

public class challenge7 {
    public static void main(String[] args) {
        System.out.println("hasTeen() = " + hasTeen(0, 0, 20));
        System.out.println("isTeen() = " + isTeen(19));
    }

    public static boolean hasTeen(int first, int second, int third) {
        return ((first > 12 && first < 20) || (second < 20 && second > 12) || (third > 12 && third < 20));
    }

    public static boolean isTeen(int isTeen) {
        return (isTeen > 12 && isTeen < 20);
    }
}

