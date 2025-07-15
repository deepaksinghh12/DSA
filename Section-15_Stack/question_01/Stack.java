public class Stack{
    int [] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1; // Stack is initially empty
        System.out.println("The stack is created with size of:" + size);
    }
}