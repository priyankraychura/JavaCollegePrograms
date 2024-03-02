public class PR57_GeneratePrimes {
    public static void main(String[] args) {
        int n = 10;

        generatefirstPrimes(n);
    }

    public static void generatefirstPrimes(int n){
        int count = 0;
        int num = 2;

        System.out.println("First " + n + "prime numbers: ");

        while(count<n){
            if(isPrime(num)){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for (int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
