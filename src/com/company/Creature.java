package com.company;

public abstract class Creature {

          private class Position {
            public int x;
            public int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Position position;

    public Creature (int x, int y) {
        this.position = new Position(x, y);
    }


}
