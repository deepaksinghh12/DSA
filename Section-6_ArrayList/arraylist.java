import java.util.ArrayList;
import java.util.Iterator;
class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(30);
        numbers.add(1);
        numbers.add(2);
        numbers.add(15);
        numbers.add(1,6);
        System.out.println(numbers.get(1));
        System.out.println(numbers.size());

        for (int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        // Time complexity:O(N)
        // Space complexity:O(1)

        for (Integer letter:numbers){
            System.out.println(letter);
        }
        // Time complexity:O(N)
        // Space complexity:O(1)

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // Time complexity:O(N) .
        // Space complexity:O(1)

        for( Integer letter:numbers){
            if (letter == 1){
                System.out.println(letter);
            }
        }
    }
}