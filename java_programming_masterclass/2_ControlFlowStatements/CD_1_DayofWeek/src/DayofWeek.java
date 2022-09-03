public class DayofWeek {
//    Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//    The method should not return any value (hint: void)
//    Using a switch statement print Sunday, Monday, ... , Saturday if the int parameter day is 0, 1,..., 6 respectively, otherwise it should print Invalid day.
    public static void printDayOfTheWeek(int day){

        int SWITCH_VARIABLE = day;

        switch (SWITCH_VARIABLE){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void IF_printDayOfTheWeek(int day) {

        int IF_VARIABLE = day;

        if (IF_VARIABLE == 0) {
            System.out.println("Sunday");
        } else if (IF_VARIABLE == 1) {
            System.out.println("Monday");
        } else if (IF_VARIABLE == 2) {
            System.out.println("Tuesday");
        } else if (IF_VARIABLE == 3) {
            System.out.println("Wednesday");
        } else if (IF_VARIABLE == 4) {
            System.out.println("Thursday");
        } else if (IF_VARIABLE == 5) {
            System.out.println("Friday");
        } else if (IF_VARIABLE == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
