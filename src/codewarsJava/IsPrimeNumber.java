package codewarsJava;

public class IsPrimeNumber {

    public static Boolean isPrime(int num) {
        if (num ==1){
            return true;
        }
        else {
            int max = (int) (Math.sqrt(num)); //Taking square root to reduce the iteration in for-loop
            int tester = 0;
            for (int n = 1; n <= max; n++) {
                if (num % n == 0) {
                    tester = tester + 1;
                }
            }
            return tester == 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(IsPrimeNumber.isPrime(4));
    }

}


