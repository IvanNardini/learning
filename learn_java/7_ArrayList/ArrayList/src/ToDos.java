import java.util.ArrayList;

public class ToDos {
    public static void main(String[] args){

        // Me
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Learning Java";
        String toDo2 = "Do On-Boarding";
        String toDo3 = "Learning for customer";
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // size method
        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());
        if (sherlocksToDos.size() > poirotsToDos.size()){
            System.out.println("Sherlock");
        } else{
            System.out.println("Poirots");
        }

        // get method
        System.out.println("Sherlock's third to-do:");
        System.out.println(sherlocksToDos.get(2));
        System.out.println("\nPoirot's second to-do:");
        System.out.println(poirotsToDos.get(1));

        // set method
        sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
        poirotsToDos.set(3, "listen to Captain Hastings for amusement");

        // remove method
        //sherlocksToDos.remove(0);
        //sherlocksToDos.remove(0);
        poirotsToDos.remove(0);

        // indexOf
        int idSolve = sherlocksToDos.indexOf("solve the case");

        //print
        System.out.println("Sherlock's to-do list:");
        System.out.println(sherlocksToDos.toString() + "\n");

        System.out.println("Poirot's to-do list:");
        System.out.println(poirotsToDos.toString());

        System.out.println(idSolve - 0);

    }
}
