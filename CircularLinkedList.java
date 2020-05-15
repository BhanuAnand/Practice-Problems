public class CircularLinkedList {
  Node head;
  
  static class Node {
    int data;
    Node next;
    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static void main(String[] args){
    Node head = new Node(4);
    Node nodeB = new Node(2);
    Node nodeC = new Node(3);
    Node nodeD = new Node(10);
    Node nodeE = new Node(2);

    head.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;
    nodeD.next = nodeE;
    
    System.out.println(isCircular(head));
    
    nodeE.next = head;
    
    System.out.println(isCircular(head));
  }

  static boolean isCircular(Node head){
    Node h = head;
    while(head.next != h){
        if(head.next == null){
            return false;
        }
        head=head.next;
    }
    return true;
  }

}
