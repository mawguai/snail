package com.nextest;

public enum Direction {

    RIGHT, DOWN, LEFT, UP;

    private Direction nextDirection;

    static {
        RIGHT.nextDirection = DOWN;
        DOWN.nextDirection = LEFT;
        LEFT.nextDirection = UP;
        UP.nextDirection = RIGHT;
    }

    public Direction getNextDirection() {
        return nextDirection;
    }
}
