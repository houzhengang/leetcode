package 剑指;

public class fib10 {
    public static int fib(int n) {
        int[] f = new int[n+1];
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else {
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < n+1; i++) {
                f[i] = f[i - 1] + f[i - 2];
                if(f[i]>1000000007){
                    f[i]= f[i]%1000000007;}
            }
            return f[n];
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(75));

    }
}
