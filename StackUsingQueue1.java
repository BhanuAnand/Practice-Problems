import java.util.*;

public class StackUsingQueue1 {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public void push(int data){
		q2.add(data);
		while(!q1.isEmpty()){
			q2.add(q1.peek());
			q1.remove();
		}
		Queue<Integer> q;
		q = q1;
		q1 = q2;
		q2 = q;
	}

	public int pop(){
		if(q1.isEmpty()){
			return -1;
		}
		int res = q1.peek();
		return res;
	}

	public static void main(String[] args){
		StackUsingQueue1 s = new StackUsingQueue1();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
	}

}
