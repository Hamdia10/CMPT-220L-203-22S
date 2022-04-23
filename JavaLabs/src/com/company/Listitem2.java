package com.company;

public class Listitem2 {


        public int val;
        Listitem2 nextIns = null;



    // listitem2() {
        // }

        Listitem2(int newNum) {
            val = newNum;


        }
        //public void inOrder (Listitem2 PreviousIns){
          //  System.out.println(PreviousIns.Number + " ");
           // inOrder(PreviousIns.PreviousIns);
       // }
        public void returnOrder (Listitem2 root) {
            Listitem2 cur = root;
            while (cur.nextIns != null ){
                System.out.println(cur.val);
                cur = cur.nextIns;


            }
            System.out.println(cur.val);





        }
        public void add( int newNum, Listitem2 root) {
            int add = 0;
            Listitem2 cur = root;
            while (cur.nextIns != null) {
                cur = cur.nextIns;

            }
            cur.nextIns = new Listitem2(newNum);
            System.out.println("Number added to list :" + newNum);



        }
        public boolean delete(int index,Listitem2 root ){
            int i=0;
            Listitem2 cur = root;
            Listitem2 prev = root;
            while( cur.nextIns != null){
                if (i == index){
                    prev.nextIns = cur.nextIns;
                    return true;
                }
                i ++;
                prev = cur;
                cur = cur.nextIns;
            }
            return false;
        }




 


}
