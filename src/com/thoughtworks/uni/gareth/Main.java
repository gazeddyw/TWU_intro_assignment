package com.thoughtworks.uni.gareth;

public class Main {

    public static void main(String[] args) {
        Asterisk.printSingleAsterisk();
        System.out.println();
        System.out.println();
        
        AsteriskLine al = new AsteriskLine();
        al.printHorizontalAsteriskLine(8);
        al.printVerticalAsteriskLine(3);
        System.out.println();

        AsteriskTriangle at = new AsteriskTriangle();
        at.printRightTriangle(3);
        System.out.println();
    }
}
