package com.thoughtworks.uni.gareth;

/**
 * Created by Gareth Williams on 2/17/15.
 */
public class AsteriskLine {

    public void printHorizontalAsteriskLine(int numberRequired) {
        for (int count = 0; count < numberRequired; count++) {
            Asterisk.printSingleAsterisk();
        }
        System.out.print("\n");
    }

    public void printVerticalAsteriskLine(int numberRequired) {
        for (int count = 0; count < numberRequired; count++) {
            Asterisk.printSingleAsterisk();
            System.out.println();
        }
    }
}
