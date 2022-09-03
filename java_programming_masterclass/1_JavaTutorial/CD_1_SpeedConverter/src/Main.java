
public class Main {
    public static void main(String[] args) {
        // Test toMilesPerHour method
//        long MILES =  SpeedConverter.toMilesPerHour(10.5);
//        System.out.println(MILES);

        // Test printConversion method
        SpeedConverter.printConversion(10.5);
        SpeedConverter.printConversion(1.5); // 1.5 km/h = 1 mi/h
        SpeedConverter.printConversion(10.25); // 10.25 km/h = 6 mi/h
        SpeedConverter.printConversion(-5.6); // Invalid Value
        SpeedConverter.printConversion(25.42); // 25.42 km/h = 16 mi/h
        SpeedConverter.printConversion(75.114); // 75.114 km/h = 47 mi/h
    }
}
