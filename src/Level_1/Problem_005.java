/*
 * Description: 2520 is the smallest number that can be divided by each
 *              of the numbers from 1 to 10 without any remainder.
 * Mission:     What is the smallest positive number that is evenly
 *              divisible by all of the numbers from 1 to 20?
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
package Level_1;

public class Problem_005 {
    private static boolean checkDividing(int number) {
        int score = 0;
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            } else score++;
        }
        return score == 20;
    }

    public static void main(String[] args) {
        int number = 2520;
        while (!checkDividing(number)) number++;
        System.out.println("Number is: " + number);
    }
}
