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

    public void printDiamond(int numberOfLinesToPivot) {
        int asterisksPerLine = 1;
        int totalLines = (numberOfLinesToPivot * 2) - 1;
        int lineNumber = 1;
        String name = "Gareth!";

        for (int prePivot = lineNumber; lineNumber <= numberOfLinesToPivot; prePivot++, lineNumber++) {
            for (int columnIndex = prePivot; columnIndex < numberOfLinesToPivot; columnIndex++) {
                Asterisk.printSpace();
            }
            if (lineNumber < numberOfLinesToPivot) {
                for (int asteriskIndex = 1; asteriskIndex <= asterisksPerLine; asteriskIndex++) {
                    Asterisk.printSingleAsterisk();
                }
            }
            else {
                System.out.print(name);
            }
            System.out.println();
            asterisksPerLine += 2;
        }
        asterisksPerLine -= 4;
        for (int postPivot = totalLines; lineNumber <= totalLines; postPivot--, lineNumber++) {
            for (int columnIndex = postPivot; columnIndex <= totalLines; columnIndex++) {
                Asterisk.printSpace();
            }
            for (int asteriskIndex = 1; asteriskIndex <= asterisksPerLine; asteriskIndex++) {
                Asterisk.printSingleAsterisk();
            }
            System.out.println();
            asterisksPerLine -= 2;
        }
    }
}
