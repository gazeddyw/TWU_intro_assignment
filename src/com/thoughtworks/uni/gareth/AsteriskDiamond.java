package com.thoughtworks.uni.gareth;

/**
 * Created by Gareth Williams on 2/17/15.
 */
public class AsteriskDiamond {

    public void printIsoscelesTriangle(int numberOfLines) {
        int asterisksInLastLine = (numberOfLines * 2) - 1;
        int numberOfColumns = asterisksInLastLine;
        int columnIndex = 0;

        for (int lineNumber = 1; lineNumber <= numberOfLines; lineNumber++) {
            while (columnIndex < numberOfLines) {
                Asterisk.printSpace();
            }
            Asterisk.printSingleAsterisk();
        }
    }

    private void printLine(int lineNumber, int numberOfLines, int numberOfColumns) {

    }
}
