package com.nextest;

public class Main {

    public static void main(String[] args) {
        int[][] snail = SnailBuilder.buildSnail(5);

        for (int i = 0; i < snail.length; i++) {
            for (int j = 0; j < snail[i].length; j++) {
                System.out.print(snail[i][j] + " ");
            }
            System.out.println();
        }
    }

}
