import java.util.ArrayList;

public class Lunch {
//    Remove elements while loop
//    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
//        int i = 0;
//        while (i < lunchBox.size()) {
//            if (lunchBox.get(i) == "ant") {
//                lunchBox.remove(lunchBox.get(i));
//            } else{
//                i++;
//            }
//        }
//        return lunchBox;
//    }

    // Remove elements for loop
    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {

        for (int i = 0; i < lunchBox.size(); i++) {
            if (lunchBox.get(i) == "ant") {
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }
        
        return lunchBox;
    }


    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);
    }
}
