package challenge6;

public class challenge6 {
    public static void main(String[] args) {
        System.out.println("hasEqualSum() = " + hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int one, int two, int three){
        return one + two == three;
    }
}
