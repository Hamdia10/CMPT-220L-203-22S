package com.company;

public class Main {




    public static void main(String[] args) {

        Listitem2 l = new Listitem2(0);
//        Listitem2 l2 = new Listitem2(2);
//        Listitem2 l3 = new Listitem2(4);
//        Listitem2 l4 = new Listitem2(6);
//        Listitem2 l5 = new Listitem2(8);


        
        //l.inOrder(l5);
       // l.returnOrder(l5);
        l.add(7, l );
        l.add(3, l );
        l.add(5, l );
        l.returnOrder(l);
        l.delete(1,l);
        System.out.println();
        l.returnOrder(l);


    }
}
