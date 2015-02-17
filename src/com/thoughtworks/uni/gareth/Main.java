package com.thoughtworks.uni.gareth;

public class Main {

    public static void main(String[] args) {
        Asterisk.printSingleAsterisk();
        System.out.println();
        
        AsteriskLine al = new AsteriskLine();
        al.printHorizontalAsteriskLine(8);
        al.printVerticalAsteriskLine(3);

        AsteriskTriangle at = new AsteriskTriangle();
        at.printTriangle(3);
    }
}
