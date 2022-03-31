//import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        listitem l = new listitem(0, null);
        listitem l2 = new listitem(2, l);
        listitem l3 = new listitem(4, l2);
        listitem l4 = new listitem(6, l3);
        listitem l5 = new listitem(8, l4);
        System.out.println(l4.Number);

        // System.out.println(l.randomNumber);
        // System.out.println(l.irrationalSequence);
        // l.addOn();
        // l.division();
        // l.minus();
        // l.multiply();
        // l.modulus();

        // LinkedList<Integer> linear = new LinkedList<Integer>();
        // linear.add(3);
        // linear.add(7);
        // linear.add(11);
        // linear.add(15);
        // linear.add(19);
        // linear.add(23);
        // linear.add(27);
        // linear.add(31);
        // linear.add(35);
        // linear.add(39);
        // System.out.println(linear);

    }

}
