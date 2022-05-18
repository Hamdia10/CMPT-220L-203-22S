package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        BST x = new BST();
        TreeNodes root = x.createNewTreeNode(0);
        root.left = x.createNewTreeNode(1);
        root.right = x.createNewTreeNode(2);
        root.left.left = x.createNewTreeNode(3);
        root.left.right = x.createNewTreeNode(4);
        root.left.right.left = x.createNewTreeNode(5);
        root.left.right.right = x.createNewTreeNode(6);
        root.right.right = x.createNewTreeNode(7);
        root.right.right.left = x.createNewTreeNode(8);







        System.out.println("");
        System.out.println("\nInorder traversal");
        x.inOrder(root);
        System.out.println("\nPreorder traversal ");
        x.preOrder(root);
        System.out.println("\nPostorder traversal");
        x.postOrder(root);
        System.out.println("\nLevelorder traversal/ breath first search");

        System.out.println("");
        x.breathFirstSearch(root);
        System.out.println("");

        System.out.println("Search: ");
        System.out.println(x.Search(root, 0));
        System.out.println(x.Search(root, 23));







        System.out.println("");
       


        x.MinMaxValue(root);
        System.out.println("Maximum value: ");
        System.out.println(x.maximum);
        System.out.println("Minimunm value: ");
        System.out.println(x.minimum);

        System.out.println("");
        System.out.println("");
        System.out.println("");









        System.out.println("\nIn-0rder traversal :");
        x.inOrder(root);
        System.out.println("\nPost-0rder traversal :");
        x.postOrder(root);
        System.out.println("\n Pre-0rder traversal :");
        x.preOrder(root);
        System.out.println("");

        System.out.println("The height of the tree is: ");
       
        System.out.println(x.getHeight(root));
        System.out.println("");

        System.out.println("Remove:");
        root = x.remove(x.createNewTreeNode(0));


       
        
        






























    }
}
