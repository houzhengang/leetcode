package 剑指;

public class numWays10_2 {
    public int numWays(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int[] res = new int[n+1];
            res[0]= 0;
            res[1]=1;
            res[2]=2;
            for(int i=3;i<n+1;i++){
                res[i] = res[i-2]+res[i-1];
            }
            return res[n+1];
        }

    }



    public static void main(String[] args) {

    }
}
