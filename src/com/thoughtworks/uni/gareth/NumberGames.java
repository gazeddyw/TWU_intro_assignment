package com.thoughtworks.uni.gareth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gareth Williams on 2/17/15.
 */
public class NumberGames {

    public static void fizzBuzz() {
        for (int currentNum = 1; currentNum <= 100; currentNum++) {
            if ((currentNum % 3 == 0) && (currentNum % 5 == 0)) {
                System.out.println("NumberGames");
            }
            else if (currentNum % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (currentNum % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(currentNum);
            }
        }
    }

    public List<Integer> generate(int number) {
        List<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }
}
