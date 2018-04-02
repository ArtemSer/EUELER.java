/*
 * Description: You are given the following information, but you may prefer to do some research for yourself.
 *              - 1 Jan 1900 was a Monday.
 *              - Thirty days has September,
 *                April, June and November.
 *                All the rest have thirty-one,
 *                Saving February alone,
 *                Which has twenty-eight, rain or shine.
 *                And on leap years, twenty-nine.
 *              - A leap year occurs on any year evenly divisible by 4, but not on a century
 *                unless it is divisible by 400.
 * Mission:     How many Sundays fell on the first of the month during the twentieth century
 *              (1 Jan 1901 to 31 Dec 2000)?
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */

package Level_1;

//Solved by Zeller (https://en.wikipedia.org/wiki/Zeller%27s_congruence)
public class Problem_019 {
    public static final int DAY = 1;

    public static void main(String[] args) {
        int startYear = 1901,
                stopYear = 2000,
                amountOfSundays = 0;
        for (; startYear <= stopYear; startYear++)
            for (int month = 1; month <= 12; month++)
                if (thisDay(DAY, month, startYear) == 0) amountOfSundays++;
        System.out.println("Result = " + Integer.toString(amountOfSundays));
    }

    private static int thisDay(int day, int month, int year) {
        //Zeller algorithm
        int m = (month - 3 + 4800) % 4800;
        int y = (year + m / 12) % 400;
        m %= 12;
        return (y + y / 4 - y / 100 + (13 * m + 2) / 5 + day + 2) % 7;
    }
}
