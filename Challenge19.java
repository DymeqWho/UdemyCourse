package challenge19;

public class Challenge19 {
    public static void main(String[] args) {
        System.out.println("hasSameLastDigit() = " + hasSameLastDigit(41,22,71));
        System.out.println("hasSameLastDigit() = " + hasSameLastDigit(23,32,42));
        System.out.println("hasSameLastDigit() = " + hasSameLastDigit(99,99,99));
        System.out.println("isValid() = " + isValid(10));
        System.out.println("isValid() = " + isValid(468));
        System.out.println("isValid() = " + isValid(1051));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if((a > 9 && a <1001) && (b > 9 && b <1001) && (c > 9 && c <1001)){
            int digitA = a%10;
            int digitB = b%10;
            int digitC = c%10;
            return digitA == digitC || digitA == digitB || digitB == digitC;
        }return false;
    }
    public static boolean isValid(int a){
        return ((a > 9 && a <1001));
    }
}
