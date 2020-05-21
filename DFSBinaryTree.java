class BinaryTree{
	Node root;
	BinaryTree() {
		root = null;
	}
}

class Node{
    int data;
    Node left, right;
    Node(int data){
    	this.data = data;
    	left = right = null;
    }
}

public class DFSBinaryTree{

    public static void main(String[] args){
        BinaryTree tree = createBinaryTree();
        printPreOrderBinaryTree(tree.root);
        System.out.println("");
        printPostOrderBinaryTree(tree.root);
        System.out.println("");
        printInOrderBinaryTree(tree.root);
    }
    
    public static BinaryTree createBinaryTree(){
    	BinaryTree tree = new BinaryTree();
    	tree.root = new Node(1);
    	tree.root.left = new Node(2);
    	tree.root.right = new Node(3);
    	tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
    	return tree;
    }
    
    public static void printPreOrderBinaryTree(Node root){    	
    	if(root==null){
    		return;
    	}
    	System.out.print(root.data+" ");
    	printPreOrderBinaryTree(root.left);
        printPreOrderBinaryTree(root.right);
    }
    
    public static void printPostOrderBinaryTree(Node root){    	
    	if(root==null){
    		return;
    	}
    	printPostOrderBinaryTree(root.left);
        printPostOrderBinaryTree(root.right);
        System.out.print(root.data+" ");
    }
    
    public static void printInOrderBinaryTree(Node root){    	
    	if(root==null){
    		return;
    	}
    	printInOrderBinaryTree(root.left);
    	System.out.print(root.data+" ");
        printInOrderBinaryTree(root.right);
    }
}



