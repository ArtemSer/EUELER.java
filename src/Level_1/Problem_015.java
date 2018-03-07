package Level_1;
/*
 * Description: Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 *              there are exactly 6 routes to the bottom right corner.
 * Mission:     How many such routes are there through a 20×20 grid?
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
import java.math.BigInteger;
public class Problem_015 {
    public static void main(String[] args) {
        int gridSize = 20;
        //Binomial coefficient (K objects can be chosen from among N objects)
        System.out.println("Result: " + binomialCoef(gridSize * 2, gridSize).toString());
    }
    private static BigInteger binomialCoef(int n, int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < k; i++)
            result = result.multiply(BigInteger.valueOf(n - i));
        return result.divide(factorialOf(k));
    }

    //calculate factorial of integer number
    private static BigInteger factorialOf(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}