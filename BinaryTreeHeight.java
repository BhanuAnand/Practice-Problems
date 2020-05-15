
public class BinaryTreeHeight {
    
	Node root;
	BinaryTree(){
		root = null;
	}
	
	class Node {
    	int data;
    	Node left, right;
    	Node(int d){
    		data = d;
    		left = right = null;
    	}
    }

	public static int getHeight(Node root){
		if(root == null){
			return 0;
		} else {
			int lheight = getHeight(root.left);
			int rheight = getHeight(root.right);
			if(lheight>rheight){
				return (lheight+1);
			} else {
				return (rheight+1);
			}
	    }
	}

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Height of binary tree is "+ getHeight(tree.root)); 
    }

}

		

