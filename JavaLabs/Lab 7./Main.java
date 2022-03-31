public class Main {
    public static void main(String[] args) {
        listitem l = new listitem(0, null);
        listitem l2 = new listitem(2, l);
        listitem l3 = new listitem(4, l2);
        listitem l4 = new listitem(6, l3);
        listitem l5 = new listitem(8, l4);
        System.out.println(l4.Number);
    }
}
