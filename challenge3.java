package challenge3;

public class challenge3 {
    public static void main(String[] args) {
        System.out.println("shouldWakeUp= " + shouldWakeUp(true, 22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return barking && (hourOfDay == 23 || hourOfDay < 8 && hourOfDay >= 0);
    }
}
