public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.display(); // Display empty list

        myLinkedList.insert(10); // Insert first element        
        myLinkedList.insert(20); // Insert second element
        myLinkedList.insert(30); // Insert third element
        myLinkedList.insert(40); // Insert fourth element
        myLinkedList.insert(50); // Insert fifth element

        myLinkedList.display(); // Display the list after insertions
    }
}
