public class Operations {
    public static void main(String[] args){
        int a = 6;
        int b = 3;

        boolean exOne = !(a == 7 && (b>= a || a != a)); //!(false || (false)) -> true
        System.out.println(exOne);

        boolean exTwo = a == b || !(b > 3); // false || true -> true
        System.out.println(exTwo);

        boolean exThree = !(b <= a && b != a + b); // !(true && true) -> false
        System.out.println(exThree);
    }
}
