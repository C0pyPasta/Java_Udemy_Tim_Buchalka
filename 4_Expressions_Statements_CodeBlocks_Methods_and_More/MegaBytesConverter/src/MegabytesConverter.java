public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long megaByte;
            long remainder;
            megaByte = kiloBytes / 1024;
            remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainder + " KB");
        }
    }
}
