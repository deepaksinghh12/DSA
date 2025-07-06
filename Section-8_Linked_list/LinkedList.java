public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }
    public void insert(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Inserted: " + data);
    }
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
