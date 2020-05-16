class ListNode{
  int val;
  ListNode next;

  ListNode(int val){
    this.val = val;
    this.next = null;
  }
}
    
class LinkedList {
  ListNode head;
	
	LinkedList(){
	    head = null;
	}
}

public class LinkedListAddNum{
    
    public static void main(String[] args){
    	LinkedList list1 = new LinkedList();
    	list1.head = new ListNode(2);
    	list1.head.next = new ListNode(4);
    	list1.head.next.next = new ListNode(3);
    
    	LinkedList list2 = new LinkedList();
    	list2.head = new ListNode(5);
    	list2.head.next = new ListNode(6);
    	list2.head.next.next = new ListNode(4);
    	
    	int num1 = 0; int num2 = 0;
    	
    	while(list1.head.next!=null){
    		num1 = num1*10 + list1.head.val;
    		list1.head = list1.head.next;
    	}
    	num1 = num1*10 + list1.head.val;
    	
        while(list2.head.next!=null){
    		num2 = num2*10 + list2.head.val;
    		list2.head = list2.head.next;
    	}
    	num2 = num2*10 + list2.head.val;
    	
    	int result = num1+num2;
    	
    	// create output list
    	LinkedList list3 = new LinkedList();
    	
    	/* create first node for the output list to have its reference 
    	    which is used to reset the head to the first node after forming the whole list */
    	ListNode firstNode = new ListNode(result%10);
    	list3.head = firstNode;
    	result=result/10;
        
        // create remaining nodes and provide linking between them
    	while(result>0){
    	   	list3.head.next = new ListNode(result%10);
    	   	list3.head = list3.head.next;
    	   	result = result/10;
    	}
    	list3.head.next = null;
    	
    	// reset the head to the first node
    	list3.head = firstNode;
    	
    	// printing the reverse of sum of the two integers given in two likedlists
    	while(list3.head!=null){
    	    System.out.println(list3.head.val);
    	    list3.head = list3.head.next;
    	}
    
    }

}
