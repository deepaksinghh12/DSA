// public class SinglyLinkedList {
//   public Node head;
//   public Node tail;
//   public int size;

//   // Node class definition
//   public static class Node {
//     public int value;
//     public Node next;

//     public Node() {
//       // Default constructor
//     }

//     public Node(int value) {
//       this.value = value;
//       this.next = null;
//     }
//   }
 
//   public Node insertSinglyLinkedList(int nodeValue) {
//     head = new Node();
//     Node node = new Node();
//     node.next = null;
//     node.value = nodeValue;
//     head = node;
//     tail = node;
//     size = 1;
//     return head;
//   }
 
//   // Insert Method SinglyLinkedList
//   public void push(int nodeValue) {
//     if (head == null) {
//       insertSinglyLinkedList(nodeValue);
//       return;
//     } else {
//       Node node = new Node();
//       node.value = nodeValue;
//       node.next = null;
//       tail.next = node;
//       tail = node;
//       size++;
//     }
 
    
//   }
 
  
 
// }






















