public class ReverseString{
    public static void main(String[] args) {
        String original = "Cyntexa";
        String Reversed = "";

        for(int i = original.length()-1 ; i>=0 ; i--){
            Reversed += original.charAt(i);
        }
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + Reversed);
    }
}