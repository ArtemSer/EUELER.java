package Level_1;
/*
 * Description: The sum of the squares of the first ten natural numbers is 385
 *              The square of the sum of the first ten natural numbers is 3025
 *              Hence the difference between the sum of the squares of the first
 *              ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Mission:     Find the difference between the sum of the squares of the first one hundred
 *              natural numbers and the square of the sum.
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
public class Problem_006 {
    private static int calculateSumOfSquares (int endNumber){
        int result = 0;
        for (int i = 1; i <= endNumber; i++){ result += Math.pow(i, 2);}
        return result;
    }
    private static int calculateSquaresOfSum (int endNumber){
        int result = 0;
        for (int i = 1; i <= endNumber; i++){ result += i;}
        return (int) Math.pow(result, 2);
    }
    public static void main(String[] args) {
        int end = 100;
        int squareOfSum = calculateSquaresOfSum(end);
        int sumOfSquare = calculateSumOfSquares(end);
        System.out.println("Result: " + (squareOfSum - sumOfSquare));
    }
}
