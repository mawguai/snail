package com.nextest;

public class SnailBuilder {

    public static int[][] buildSnail(int snailSize) {
        if (snailSize < 1) {
            throw new IllegalArgumentException("Value must be superior or equal to 1");
        }

        Direction currentDirection = Direction.RIGHT;

        int[][] snail = new int[snailSize][snailSize];
        int row = 0;
        int col = 0;

        for (int number = 1; number < Math.pow(snailSize, 2) + 1; number++) {
            snail[row][col] = number;
            currentDirection = getDirection(snailSize, currentDirection, snail, row, col);

            switch (currentDirection) {
                case RIGHT:
                    col++;
                    break;
                case DOWN:
                    row++;
                    break;
                case LEFT:
                    col--;
                    break;
                case UP:
                    row--;
                    break;
            }
        }

        return snail;
    }

    private static Direction getDirection(int snailSize, Direction currentDirection, int[][] snail, int row, int col) {
        switch (currentDirection) {
            case RIGHT:
                if (col == snailSize-1 || snail[row][col+1] != 0) {
                    currentDirection = currentDirection.getNextDirection();
                }
                break;
            case DOWN:
                if (row == snailSize-1 || snail[row+1][col] != 0) {
                    currentDirection = currentDirection.getNextDirection();
                }
                break;
            case LEFT:
                if (col == 0 || snail[row][col-1] != 0) {
                    currentDirection = currentDirection.getNextDirection();
                }
                break;
            case UP:
                if (snail[row-1][col] != 0) {
                    currentDirection = currentDirection.getNextDirection();
                }
                break;
        }
        return currentDirection;
    }
}
