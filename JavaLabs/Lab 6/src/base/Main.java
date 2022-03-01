package base;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] oddnumbers = { 1, 3, 5,7,9,11,13,15,17,19};
        System.out.println("These are odd numbers of the first 20 numbers:");
        for (int i = 0; i < oddnumbers.length; i++){
            System.out.println(oddnumbers[i]);
            System.out.println("\nPrinting out list with for each loop:");
            for (int number: oddnumbers) {
                System.out.println(number);
            }
}


        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> emptyNumbers = new ArrayList();
        ArrayList<Integer> emptyNumbers2 = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
        ArrayList<Integer> eveNumbers2 = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
        int demo = 6;
        System.out.println("Printing out first even numbers of 20:");
        for (int i = 0; i < evenNumbers.size(); i++){
            System.out.println(evenNumbers.get(i));
        }
        System.out.println("\nPrinting out first even numbers of 20:");
        for (int number: eveNumbers2) {
            System.out.println(number);
        }

        // Create an LinkedList, Populate it, and Print it out
        LinkedList<String> bookBag= new LinkedList<String>();
        bookBag.add("Text books");
        bookBag.add("Highligther pens");
        bookBag.add("Hair tie");
        bookBag.add("Lip balm");
        bookBag.add("Hand cream");
        bookBag.add("Sanitizer");
        bookBag.add("Manga");
        bookBag.add("Pencils");
        bookBag.add("Pens");
        bookBag.add("Laptop");
        System.out.println(bookBag);

        // Create an Queue, Populate it, and Print it out
        Queue<String> students = new LinkedList<String>();
        students.add("Sheldon");
        students.add("Emelda");
        students.add("Ricciardo");
        students.add("Kimi");
        students.add("Ravi");
        System.out.println(students);

        // Create an Stack, Populate it, and Print it out
        Stack<String> planeParts = new Stack<String>();
        planeParts.push("Wing");
        planeParts.push("Winglet");
        planeParts.push("Jet Engine");
        planeParts.push("Cock pit");
        planeParts.push("Flaps");
        planeParts.push("Spoiler");
        planeParts.push("Fuselage");
        planeParts.push("Aileron");
        planeParts.push("Rudder");
        planeParts.push("Vertical Stabilizer");
        System.out.println(planeParts);
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant oakTree = new Plant (true, true, 34.9, true, true );
        Plant roseBush = new Plant (true, true, 8.7, true, true );
        System.out.print(oakTree.hasLeaves);
        System.out.println(oakTree.hasRoots);
        System.out.println(oakTree.height);
        System.out.println(oakTree.hasStem);
        System.out.println(oakTree.hasBranches);
    }
}
