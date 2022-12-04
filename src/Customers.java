import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Customers {
    String Name;
    int Age;

    public Customers(String Name, Integer Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }


    public Integer getAge() {
        return Age;
    }


    @Override
    public String toString() {
        return "Customer{"
                + "Name=" + Name + ", Age=" + Age + '}';
    }

    static class CustomerSortingComparator
            implements Comparator<Customers> {

        @Override
        public int compare(Customers customer1,
                           Customers customer2) {


            int NameCompare = customer1.getName().compareTo(customer2.getName());
            int AgeCompare = customer1.getAge().compareTo(customer2.getAge());


            return (NameCompare == 0) ? AgeCompare : NameCompare;
        }
    }

    public static void main(String[] args) {


        ArrayList<Customers> al = new ArrayList<>();


        Customers obj1 = new Customers("Rohan", 27);
        Customers obj2 = new Customers("Sneha", 23);
        Customers obj3 = new Customers("Mohit", 47);
        Customers obj4 = new Customers("Jay", 22);
        Customers obj5 = new Customers("Arya", 29);
        Customers obj6 = new Customers("Aarav", 39);


        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        // before Sorting arraylist: iterate using Iterator
        Iterator<Customers> custIterator = al.iterator();

        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }

        // sorting using Collections.sort(al, comparator);
        Collections.sort(al,
                new CustomerSortingComparator());

        // after Sorting arraylist: iterate using enhanced
        // for-loop
        System.out.println("\n\nAfter Sorting:\n");
        for (Customers customer : al) {
            System.out.println(customer);
        }
    }
}
