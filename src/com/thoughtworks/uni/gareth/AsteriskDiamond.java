package com.thoughtworks.uni.gareth;

/**
 * Created by Gareth Williams on 2/17/15.
 */
public class AsteriskDiamond {

    public void printIsoscelesTriangle(int numberOfLines) {
        int asteriskCount = 1;

        for (int lineNumber = 1; lineNumber <= numberOfLines; lineNumber++) {
            for (int columnIndex = lineNumber; columnIndex < numberOfLines; columnIndex++) {
                Asterisk.printSpace();
            }
            for (int asteriskIndex = 1; asteriskIndex <= asteriskCount; asteriskIndex++) {
                Asterisk.printSingleAsterisk();
            }
            System.out.println();
            asteriskCount += 2;
        }
    }

    public void printDiamond(int numberOfLines) {
    }
}
