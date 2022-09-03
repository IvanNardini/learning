public class ExceptHandling {
    public static void main(String[] args){
        int width = 0;
        int lenght = 40;

        try{
            int ratio = lenght / width;
        } catch(ArithmeticException e){
            System.err.println("ArithmeticException "+ e.getMessage());
        }
    }
}
