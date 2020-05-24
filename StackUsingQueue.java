import java.util.*;

public class StackUsingQueue {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public void push(int data){
		q1.add(data);
	}

	public int pop(){
		if(q1.isEmpty()){
			return -1;
		}
		while(q1.size()!=1){
			q2.add(q1.peek());
			q1.remove();
		}
		int res = q1.peek();
		Queue<Integer> q = q1;
		q1=q2;
        q2=q;
		return res;
	}

	public static void main(String[] args){
		StackUsingQueue s = new StackUsingQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
	}

}
