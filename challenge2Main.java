package challenge2;

public class challenge2Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes >= 0){
        int YY = kiloBytes / 1024; //MB
        int ZZ = kiloBytes % 1024; //remaining kilobytes
        System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");}
        else{
            System.out.println("Invalid Value");
        }
    }
}
