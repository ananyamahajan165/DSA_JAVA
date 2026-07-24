import java.util.Arrays;

public class PrimeArrangements {
        int mod = 1000000007;
        int N = 1000;
        int prime[] = new int[N]; 
        public void sieve(){ 
            Arrays.fill(prime,1);
            prime[0]=0;
            prime[1]=0;
            for(int i=2;i*i<N;i++){
                if(prime[i]==1){
                    for(int j=i*i;j<N;j+=i){
                        prime[j]=0;
                    }
                }
            }
        }
    public int numPrimeArrangements(int n) {
        sieve();
        int countprime=0;
        for(int i=2;i<=n;i++){
            if(prime[i]==1){
                countprime++;
            }
        }
        int countnonprime = n - countprime;

        long primefact = 1;
        for(int i=1;i<=countprime;i++){
            primefact = (primefact*i)%mod;
        }

        long nonprimefact = 1;
        for(int i=1;i<=countnonprime;i++){
            nonprimefact = (nonprimefact*i)%mod;
        }

        return (int)((primefact*nonprimefact)%mod);
    }
}
