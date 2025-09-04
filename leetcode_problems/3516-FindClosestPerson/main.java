public class main {
    public static void main(String[] args) {
        Solution sol=new Solution();    

        System.out.println(sol.findclosest(3,8,5));
        System.out.println(sol.findclosest(2,4,3));
        System.out.println(sol.findclosest(7,9,1));
    }
}

class Solution{
    public int findclosest(int x,int y,int z){
        int distanceX=Math.abs(x-z);
        int distanceY=Math.abs(y-z);

        if( distanceX==distanceY)
        {
            return 0;
        }
        else if( distanceX<distanceY ){
            return 1;
        }
        else if( distanceX>distanceY )
        {
            return 2;
        }
        // Default return statement to satisfy all code paths
        return -1;
    }
}
