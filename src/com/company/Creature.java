package com.company;

public class Creature {

    private class Position {
        public int row;// x row
        public int column; // y column different from coordinates. And in java coordinates, up equal to minus, down equal to add
        // opposite of Math

        Position(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public String toString() {
            return
                    "row: " + row +
                            ", column: " + column;
        }
    }

    public Position position;

    public Creature (int row, int column) {
        this.position = new Position(row, column);
    }
}
