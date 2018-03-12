/*
 * Description: 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * Mission:     What is the sum of the digits of the number 2^1000?
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */

package Level_1;

public class Problem_017 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
            sum += toEnglish(i).length();
        System.out.println( Integer.toString(sum));
    }

    private static String toEnglish(int n) {
        //- For the numbers from 0 to 19, we write the single word:
        if (0 <= n && n < 20)
            return SINGLES[n];
        //- For the numbers 20 to 99, we write the word for the tens place:
        else if (20 <= n && n < 100)
            return TENS[n / 10] + (n % 10 != 0 ? SINGLES[n % 10] : "");
        //- For the numbers 100 to 999, we write the ones word for the hundreds place followed by "hundred"
        else if (100 <= n && n < 1000)
            return SINGLES[n / 100] + "hundred" + (n % 100 != 0 ? "and" + toEnglish(n % 100) : "");
        //- For the numbers 1000 to 999999, we write the word for the three digits starting at the
        //  thousands place followed by "thousand"
        else if (1000 <= n && n < 1000000)
            return toEnglish(n / 1000) + "thousand" + (n % 1000 != 0 ? toEnglish(n % 1000) : "");
        // or throwing the Exception
        else
            throw new IllegalArgumentException();
    }

    private static String[] SINGLES = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
}
