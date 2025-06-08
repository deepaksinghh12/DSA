public class pattern {
    public static void main(String[] args) {
        pattern3(5); 
        pattern4(5);
        pattern5(5);
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
