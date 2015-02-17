package com.thoughtworks.uni.gareth;

/**
 * Created by Gareth Williams on 2/17/15.
 */
public class AsteriskTriangle {

    public void printRightTriangle(int numberOfLines) {
        for (int lineCount = 1; lineCount <= numberOfLines; lineCount++) {
            for (int asteriskCount = 0; asteriskCount < lineCount; asteriskCount++) {
                Asterisk.printSingleAsterisk();
            }
            System.out.println();
        }
    }
}
