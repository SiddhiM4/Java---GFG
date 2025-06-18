class CheckPrime {
    public static boolean prime(int n) {
        // Write your code here
        boolean isPrime=true;
        if(n <= 1)
            return isPrime = false;
        for(int i = 2; i < n;i++){
            if(n%i==0){
                return isPrime=false;
            }
        }
        return isPrime;
    }
}