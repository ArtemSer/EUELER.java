package Level_1;

import java.util.LinkedList;

/*
 * Description: The following iterative sequence is defined for the set of positive integers:
 *                               n → n/2 (n is even)
 *                               n → 3n + 1 (n is odd)
 *              Using the rule above and starting with 13, we generate the following sequence:
 *                             13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 *              It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 *              Although it has not been proved yet (Collatz Problem), it is thought that all starting
 *              numbers finish at 1.
 * Mission:     Which starting number, under one million, produces the longest chain?
 *              NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
public class Problem_014 {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        LinkedList<Long> list = new LinkedList<>();

        int result = 0;
        long amount = 0;

        for(int num = 13; num < 1_000_000; num++) {
            long count = num;
            while (count != 1) {
                if (count % 2 == 0) {
                    count /= 2;
                    list.add(count);
                }
                else {
                    count = (3 * count) + 1;
                    list.add(count);
                }
            }

            if(list.size() > amount) {
                amount = list.size();
                result = num;
            }
            // important to clear list
            list.clear();
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("Result: " + result + " Amount: " + amount);
        System.out.println("Spended time: " + (timeEnd - timeBegin) + "ms");
    }
}
