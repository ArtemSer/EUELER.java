package Level_1;

/*
 * Description: A Pythagorean triplet is a set of three natural numbers, a < b < c
 * Mission:     There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *              Find the product abc.
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
public class Problem_009 {
    private static long calculateTriplet(int number) {
        for (long a = 1; a < number; ++a) {
            for (long b = 1; b < number - a; ++b) {
                long c = 1000 - a - b;
                if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int number = 1000;
        System.out.println(calculateTriplet(number));
    }
}
