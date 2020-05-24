import java.util.*;
public class QueueUsingStack1 {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void enqueue(int data){
		s1.push(data);
	}

	public int dequeue(){
		int res = 0;
		if(!s2.isEmpty()){
			res = s2.peek();
			s2.pop();
		}else{
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			res = s2.peek();
			s2.pop();
		}
		return res;
	}

	public static void main(String[] args){
		QueueUsingStack1 q = new QueueUsingStack1();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.print(q.dequeue());
	}
  
}
