import java.util.*;

public class TreeSideView{
	Node root;
	TreeSideView(){
		this.root = null;
	}
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}

	public static void sideView(Node node){
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty()){
			Node tempNode = q.poll();
			System.out.print(tempNode.data);
			if(tempNode.left != null){
			    if(tempNode.left.left == null && tempNode.left.right == null){
			        if(tempNode.right != null && (tempNode.right.left != null || tempNode.right.right != null)){
			            System.out.print(tempNode.left.data);
			            if(tempNode.right.left != null){
			                 q.add(tempNode.right.left);
			            }else if(tempNode.right.right != null){
			                 q.add(tempNode.right.right);
			            }
			        }else{
			            q.add(tempNode.left);
			        }
			    }else{
			        q.add(tempNode.left);
			    }
			}else if(tempNode.right != null){
				q.add(tempNode.right);
			}
		}
	}
	
	public static void main(String[] args){
		    TreeSideView tree = new TreeSideView();
		    tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);
		    sideView(tree.root);
	}

}
