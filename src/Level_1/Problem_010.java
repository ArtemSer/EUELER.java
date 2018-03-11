/*
 * Description: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Mission:     Find the sum of all the primes below two million.
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
package Level_1;

public class Problem_010 {
    //checks whether an int is prime or not.
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int endNumber = 10;
        Long result = 1L;
        for (int i = 1; i < endNumber; i++, i++)
            if (isPrime(i)) result += i;
        System.out.println("Result: " + result);
    }
}
