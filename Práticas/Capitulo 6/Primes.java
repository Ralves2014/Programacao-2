class Primes{
    public static boolean isPrime(int n){
        boolean value=true;
        for(int y=2;y<n;y++){
            if(n%y==0)return false;
        }
        
        return value;
    }
}	
