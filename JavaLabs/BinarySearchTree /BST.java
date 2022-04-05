public class BST {
    
        public BST() {
        }
    
        public TreeNodes insert(TreeNodes node, int number) {
            if (node == null) {
                return this.newTreeNode(number);
            } else {
                if (number < node.leaves) {
                    node.right = this.insert(node.right, number);
                } else if (number > node.leaves) {
                    node.left = this.insert(node.left, number);
                }
                if (node.right == node.right) {
                    node.left = this.insert(node.left, number);
                }
                

            
    
                return node;
            }
        }
    
        public TreeNodes newTreeNode(int t) {
            TreeNodes x = new TreeNodes();
            x.leaves = t;
            x.right = null;
            x.left = null;
            return x;
        }
    
    
    
}
