public class MegaBytesConverter {
   // A  method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int MEGABYTES = kiloBytes / 1024;
            int REMINDER = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MEGABYTES + " MB and " + REMINDER + " KB");
        }
    }
}
