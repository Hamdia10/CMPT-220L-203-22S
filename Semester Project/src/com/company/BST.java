package com.company;

public class BST  {
    

    

    public TreeNodes insert(TreeNodes node, int number){
        if (node == null) {
            return newTreeNode(number);
        
        }
        if (number < node.leaves) {
                 node.left = this.insert(node.left, number);
                 System.out.println("Left - " + number );
            }
            else if (number > node.leaves) {
                node.right = this.insert(node.right, number);
                System.out.println("Right - " + number );
            }
            if (node.leaves ==  number ){
                 node.left = this.insert(node.left, number);
                 System.out.println("Left - " + number );
            }  
            
            
            
            
            
           
            
            return node;
        }
        

    

    public TreeNodes newTreeNode(int t) {
        TreeNodes x = new TreeNodes();
        x.leaves = t;
        x.right = null;
        x.left = null;
        
        return x;

    }
    
     
        

    

}
