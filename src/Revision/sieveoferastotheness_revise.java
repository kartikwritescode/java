package Revision;

public class sieveoferastotheness_revise {
    public static void main(String[] args) {
        int num = 20;
        prime(num);

    }

    private static void prime(int n) {

        boolean[] isPrime = new boolean[n+1];
        isPrime[0] = false;
        isPrime[1] = false;

//      initially let all the values in the array as primes
        for (int c = 2; c < isPrime.length; c++){
            isPrime[c]=true;
        }

//        int c = 2;

//        edge case
        if(n<=1){
            System.out.println("Not isPrime");
            return;
        }
//        seive logic
        for (int i = 2; i*i<=n ; i++) {
            if(isPrime[i]){
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }

            }

        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i+" ");
            }
        }

    }

}
