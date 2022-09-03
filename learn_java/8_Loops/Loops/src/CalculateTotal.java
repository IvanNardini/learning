import java.util.ArrayList;

public class CalculateTotal {
    public static void main(String[] args){
        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double totalf=0;

        for(int i=0; i<expenses.size(); i++){
            double elm = expenses.get(i);
            totalf += elm;
        }
        System.out.println(totalf);

        double totalw=0;

        int i=0;
        while(i < expenses.size()){
            totalw += expenses.get(i);
            i++;
        }
        System.out.println(totalw);
    }
}
