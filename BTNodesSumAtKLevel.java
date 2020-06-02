import java.util.*;

public class BTNodesSumAtKLevel{
	Node root;
	BTNodesSumAtKLevel(){
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

	public static void sumAtKLevel(Node node, int K){
	    int level = 0, flag = 0, sum = 0;
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty()){
			int size = q.size();
			while(size != 0){
				Node tempNode = q.poll();
				if(level == K){
					sum+= tempNode.data;
					size--;
					flag = 1;
				}else{
					if(tempNode.left != null){
						q.add(tempNode.left);
                    }
                    if(tempNode.right != null){
                    	q.add(tempNode.right);
                    }                                                           
					size--;
				}
			}
			level++;
			if(flag == 1){
				break;
			}
		}
		System.out.print(sum);
	}
	
	public static void main(String[] args){
		    BTNodesSumAtKLevel tree = new BTNodesSumAtKLevel();
		    tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);                                                                         
		    sumAtKLevel(tree.root,2);
	}

}
