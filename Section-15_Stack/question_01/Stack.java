public class Stack{
    int [] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1; // Stack is initially empty
        System.out.println("The stack is created with size of:" + size);
    }
    //isEmpty method to check if the stack is empty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }
    //isFull method to check if the stack is full
    public boolean isFull(){
        if(topOfStack == arr.length - 1){
            return true;
        
        } else {
            return false;
        }
    }
    //more methods to come soon
}