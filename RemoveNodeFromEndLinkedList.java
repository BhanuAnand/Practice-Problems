public class RemoveNodeFromEndLinkedList {
	Node head;
	LinkedList() {
		head = null;
	}
	
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static LinkedList createLinkedList(){
		
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        return list;

	}

	public static void printLinkedList(LinkedList list){
	    Node head = list.head;
		while(head != null){
			System.out.print(head.data);
			head = head.next;
		}
	}

	public static LinkedList removeNthNode(LinkedList list, int n){
		Node first = list.head;
		Node second = list.head;

		for(int i=0; i<n; i++){
			second = second.next;
		}

		while(second.next != null){
			first = first.next;
			second = second.next;
		}
		
		first.next = first.next.next;
		return list;
	}
	
	public static void main(String[] args){
		
		LinkedList list = createLinkedList();
		list = removeNthNode(list,3);
        printLinkedList(list);		
	
	}
	
}


