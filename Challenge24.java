package challenge24;

public class Challenge24 {
    public static void main(String[] args) {
        System.out.println("canPack(1,0,4) = " + canPack(1, 0, 4));
        System.out.println("canPack(1,0,5) = " + canPack(1, 0, 5));
        System.out.println("canPack(0,5,4) = " + canPack(0, 5, 4));
        System.out.println("canPack(2,2,11) = " + canPack(2, 2, 11));
        System.out.println("canPack(-3,2,12) = " + canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = bigCount * 5;
        int goalModuloFive = goal % 5;
        if (goal <= (sum + smallCount) && goal > 0) {
            return goalModuloFive - smallCount <= 0;
        }
        return false;
    }
}

