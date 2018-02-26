package Level_1;
/*
 * Description: The prime factors of 13195 are 5, 7, 13 and 29.
 * Mission:     What is the largest prime factor of the number 600851475143?
 *
 * Author:      Sierikov Artem  (https://github.com/ArtemSer)
 */
import java.util.ArrayList;
import java.util.List;

public class Problem_003 {
    private static List<Long> primeFactors(long number) {
        long userNumber = number;
        List<Long> factors = new ArrayList<>();
        for (long primer = 2; primer <= userNumber; primer++) {
            while (userNumber % primer == 0) {
                factors.add(primer);
                userNumber /= primer;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        long userNumber = 600851475143L;
        System.out.println("Primefactor of 600851475143");
        for (Long longer : primeFactors(userNumber)) {
            System.out.println(longer);
        }
    }
}
