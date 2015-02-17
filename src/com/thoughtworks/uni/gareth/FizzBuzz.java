package com.thoughtworks.uni.gareth;

/**
 * Created by Gareth Williams on 2/17/15.
 */
public class FizzBuzz {

    public static void fizzBuzz() {
        for (int currentNum = 1; currentNum <= 100; currentNum++) {
            if ((currentNum % 3 == 0) && (currentNum % 5 == 0)) {
                System.out.println("FizzBuzz");
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
}
