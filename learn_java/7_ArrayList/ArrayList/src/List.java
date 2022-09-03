import java.util.ArrayList;

public class List {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add(args[0]);
        list.add(args[1]);
        System.out.println(list.toString());

        int size = list.size();
        System.out.println(size); //2
        System.out.println(list.get(1)); //jolly
        list.set(1, "set");
        System.out.println(list.toString()); //test, set
        list.remove(1);
        System.out.println(list.toString()); //test
        System.out.println(list.indexOf(args[0])); //0
    }
}
