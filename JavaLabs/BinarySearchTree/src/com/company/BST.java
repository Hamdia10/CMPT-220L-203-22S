package com.company;



public class BST {
    public  treeNodes insert(treeNodes node, int number ){
        if (node == null){
            return newTreeNode(number);
        }
        if (number < node.leaves ){
            node.right = insert(node.right, number);
        }
        else if (number > node.leaves ){
            node.left = insert(node.left, number);
        }
        return node;
    }
    public treeNodes newTreeNode(int t){
        treeNodes x = new treeNodes();
        x.leaves = t;
        x.right = null;
        x.left = null;
        return x;


    }
}
