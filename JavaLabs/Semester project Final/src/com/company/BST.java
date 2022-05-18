package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BST {

    public TreeNodes root;


    public TreeNodes createNewTreeNode(int data) {
        TreeNodes newTreeNode = new TreeNodes();
        newTreeNode.left = null;
        newTreeNode.right = null;
        newTreeNode.leaves = data;
        return newTreeNode;


    }


    //This function help identify the maximum and minimum value in the tree
    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;

    public void MinMaxValue(TreeNodes node) {
        //Conditional checks if node is null
        if (node == null) {
            return;
        }
        //Once this is true, it continues to the next conditional which assigns the data in leaves to the node and checks if it is greater than the  maximum value.
        //Once  comparison is done, and the conditonal is true, the maximum value is assined to or sores the data node.leaves

        if (node.leaves > maximum) {
            maximum = node.leaves;
        }
        //This is the same for this conditional.

        else if (node.leaves < minimum) {
            minimum = node.leaves;
        }
        //The MinMaxValue method is then used to hold the left node and right node thereby gives the minimum value
        // Once the method is called the minimum value and max value are returned.

        MinMaxValue(node.left);
        MinMaxValue(node.right);
    }
    //This function removes a node from a tree.
    public  TreeNodes remove(TreeNodes root){
        //This checks if the root is null, once this is true it returns null else this code does not go further.

        if  (root == null) {
            return null;

        }
        //Then  the left node is assigned to the method remove(node.left)
        root.left = remove(root.left);
        //This is the same for this line of code
        root.right = remove(root.right);
        //This prints out the nodes after either the left node or rihht nodfe has been deleted
        System.out.println(root.leaves);
        
        return root;

    }
    public TreeNodes add(TreeNodes node, int num) {
        if (node == null) {
            return null;


        }
        if ( num < node.leaves ){
            node.left = add(node.left, num);
            System.out.println(node.leaves);
        }
        if ( num > node.leaves ){
            node.right = add(node.right, num);
            System.out.println(node.leaves);
        }

        node =null;
        return node;

    }



















    //This  function organises the elements in thr tree prre-order that is


    public void preOrder( TreeNodes node) {
        //This verifies if the conditional is true, once verified it continuses the code bellow it
        if (node == null) {
            return;

        }
        //First it prints out the root node , then the left node , then the right.
        System.out.print(node.leaves + " ");
        preOrder(node.left);
        preOrder(node.right);





    }



      ///Depth first Search\\


    public void inOrder( TreeNodes node) {
        //Verifies if conditional is true, once true continues to the next batch of code below then runs once it is called.
        if (node == null) {
            return;

        }
        //First it prints out the left node , then the root node  and then the right.

        inOrder(node.left);
        System.out.print(node.leaves + " ");
        inOrder(node.right);





    }

    public void postOrder(TreeNodes node) {
        //Verifies if conditional is true, once true continues to the next batch of code below then runs once it is called.
        if (node == null) {
            return;

        }
        //First it prints out the left node , then the right  node  and then the root node in this order.

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.leaves + " ");
    }

    //Breath first Search\\

    public void breathFirstSearch(TreeNodes root) {
        //A queue is created and the TreeNodes class is made a linkedlist
        Queue<TreeNodes> queue = new LinkedList<TreeNodes>();
        queue.add(root);
        //The root node is added to the linkedlist since it does not exist in the TreeNodes class
        //A while loop is created on the condition that the queue/linked list is empty thereby once it is filled the while loop woiuld stop/ if it is occupied in the first place the while loop will no run because the condition was not true.
        while (!queue.isEmpty()) {
            //A temporary node is created that stores the method q.leaves
            TreeNodes temp = queue.remove();
            //It is then assigned to the leaves/data and printed out the space helps with the order
            System.out.print(temp.leaves + " ");
            //This conditional checks if the condition is true if so the temp.left is added the the queue/linked list

            if (temp.left != null) {
                queue.add(temp.left);
            }
            //This is the same for this conditional


            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    void printPre0rder(TreeNodes node){

        if (node == null){
            return;
        }
        System.out.println(node.leaves + " ");
        preOrder(node.left);
        preOrder(node.right);

    }

    

    void printInOrder(TreeNodes node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.leaves + " ");
        inOrder(node.right);


    }
    void printPostOrder(TreeNodes node){
        if (node == null){
            return;
        }

        postOrder(node.right);
        postOrder(node.left);
        System.out.println(node.leaves + " ");



    }









    //This node gets the  height of the tree using the math library
    public int getHeight(TreeNodes  node ) {
        //The conditional checks if the node is null once this is true it returns 0 and then  returns the height of the tree with the help of a math library method

        if  (node == null) {
            return 0;

        }
        return Math.max(getHeight(node.right),getHeight(node.left) +1);



    }
    //The search funchion checks of a value exists in a node or not so when this fuction is called you can enter any value to see if it exists in the tree or not.
    public boolean Search(TreeNodes node, int number){
        //It check if the node is null then returns false once this conditional is true
     if (node == null){
      return false;
     }
     //It then continues boolean variable found that is currently false
     boolean found = false;
     //The conditional verifies if the node.leaves stored in the left node is the number given
     if ( node.leaves == number) {
         if ( number < node.leaves){
             node = node.left;
         }
         //It does the same here too
         else if (number > node.leaves){
             node = node.right;
             //This conditional checks if the given number is not in the node.leaves this is true, it returns false
             if (number != node.leaves){
                 return false;
             }
         }
         //If it is in node.leaves however, it returns found = true
         else{
             found = true;
         }
         //Then returns true
         return true;
     }
     //Then returns found in order for the value storted in found to change from false to true.
     return found;
    }



    //public void depthFirstSearch(TreeNodes node) {


       // int height = getHeight(node);

       // for(int i = 0; i <= height; i++) {
          // printDepthTraversals(node, i + 1);
           // System.out.println();
        //}
    //}




   // public void printDepthTraversals(TreeNodes node, int nodeLevel) {
       // if  (node == null) {
            //return ;

      //  }

       // if(nodeLevel == 1) {
           // System.out.print(node.leaves + " ");
           // return;
        //}

      //  printDepthTraversals(node.left, nodeLevel - 1);
        //printDepthTraversals(node.right, nodeLevel - 1);
     // }






















    }










































