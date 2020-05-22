class QNode{
	int data;
	QNode next;
	QNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class QueueUsingLinkedList{

	QNode front;
	QNode rear;

	QueueUsingLinkedList(){
		this.rear = this.front = null;
}

	public void enqueue(int data){
		QNode temp = new QNode(data);
		if(this.rear==null){
			this.front=this.rear=temp;
            return;
		}
		this.rear.next = temp;
		this.rear = temp;
 
	}

	public void dequeue(){
		if(this.front == null){
			return;
		}
		this.front = this.front.next;
		if(this.front == null){
			this.rear = null;
		}
	}

	public static void main(String[] args){
		QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println(q.front.data);
        System.out.println(q.rear.data);                                                                
	}

}
