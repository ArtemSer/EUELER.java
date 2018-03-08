package Level_1;

import java.math.BigInteger;

/*
 * Description: 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * Mission:     What is the sum of the digits of the number 2^1000?
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
class Problem_016 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        long result=0;
        char powMassive[];
        BigInteger two = new BigInteger(String.valueOf('2'));
        powMassive = two.pow(1000).toString().toCharArray();
        for (char character : powMassive) result += character - '0';

        System.out.println("Result: " + result);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time spended: " + (timeEnd - timeBegin) + "ms");

    }

}