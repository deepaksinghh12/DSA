import java.util.ArrayList;
class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(30);
        numbers.add(1);
        numbers.add(2);
        numbers.add(15);
        numbers.add(1,6);
        System.out.println(numbers.get(1));
    }
}