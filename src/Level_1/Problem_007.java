package Level_1;

public class Problem_007 {
    //checks whether an int is prime or not.
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0, number = 2; i < 10001; number++){
            if (isPrime(number)){
                i++;
                System.out.println("The prime number #" + i + " is " + number);
            }
        }
    }
}
