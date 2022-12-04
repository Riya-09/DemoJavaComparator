import java.util.Comparator;

public class ComparatorImplementation implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        //increasing order
        //o1:1
        //o2:2
        //no swap return -1;

        //if it had been
        //o1:2
        //o1:1
        //swap as to get in increasing order
        //return 1;

        if(o1%10>o2%10){
            return -1;
        }

        return 1;
    }

}
