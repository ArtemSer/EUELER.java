package Level_1;
/*
 * Description: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * Mission:     What is the 10 001st prime number?
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
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
