package board;


public class Position {
    private final int row;
    private final int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    // You can also implement utility methods here, such as checking if a position is within the bounds of the chessboard or calculating the distance between two positions.
}

