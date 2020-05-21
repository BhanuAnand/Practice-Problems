import java.util.*;

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

public class BFSBinaryTree{

    public static void main(String[] args){
        BinaryTree tree = createBinaryTree();
        printBFS(tree);
    }
    
    public static BinaryTree createBinaryTree(){
        BinaryTree tree = new BinaryTree();
    	tree.root = new Node(1);
    	tree.root.left = new Node(2);
    	tree.root.right = new Node(3);
    	tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    	return tree;
    }
    
    public static void printBFS(BinaryTree tree){
    	Queue<Node> queue = new LinkedList<Node>();
	    queue.add(tree.root);

	    while(!queue.isEmpty()){
    		Node tempNode = queue.poll();
    		System.out.print(tempNode.data+" ");
    
    		if(tempNode.left!=null){
    			queue.add(tempNode.left);
    		}
    		
            if(tempNode.right!=null){
            	queue.add(tempNode.right);
            }
	    }
	    
    }
}

