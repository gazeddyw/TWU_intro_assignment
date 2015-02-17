package com.thoughtworks.uni.gareth;

import java.util.List;

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
        at.printRightTriangle(4);
        System.out.println();

        AsteriskDiamond ad = new AsteriskDiamond();
        ad.printIsoscelesTriangle(3);
        ad.printDiamond(4);
        System.out.println();

        NumberGames.fizzBuzz();
        System.out.println();

        NumberGames ng = new NumberGames();
        for (Integer integer : ng.generate(30)) {
            System.out.println(integer);
        }
        System.out.println();
    }
}
