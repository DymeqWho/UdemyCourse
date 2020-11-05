package challenge1;

public class challenge1Main {
    public static void main(String[] args) {

        System.out.println("toMilesPerHour = " + toMilesPerHour(95.75));
        System.out.println("toMilesPerHour = " + toMilesPerHour(100.4));
        printConversion(0);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double value = Math.round(kilometersPerHour * 0.622);
        long value1 = (long) value;
        if (value1 >= 0) {
            return value1;
        }else{
        System.out.print("invalid value ");}
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour >= 0 ){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else{
            System.out.println("Invalid Value");
        }
    }
}
