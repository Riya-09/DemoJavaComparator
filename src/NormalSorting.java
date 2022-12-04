import java.util.ArrayList;
import java.util.Collections;


public class NormalSorting {
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(30);
        values.add(69);
        values.add(57);
        values.add(29);
        values.add(82);

        ComparatorImplementation integerComparator = new ComparatorImplementation();
        Collections.sort(values,integerComparator);

        for(int val : values){
            System.out.println(val);
        }

    }
}
