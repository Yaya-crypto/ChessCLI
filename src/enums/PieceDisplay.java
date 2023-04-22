package enums;

public enum PieceDisplay {
    WHITE_PAWN("♙"),
    BLACK_PAWN("♟"),
    WHITE_ROOK("♖"),
    BLACK_ROOK("♜"),
    WHITE_KNIGHT("♘"),
    BLACK_KNIGHT("♞"),
    WHITE_BISHOP("♗"),
    BLACK_BISHOP("♝"),
    WHITE_KING("♔"),
    BLACK_KING("♚"),
    WHITE_QUEEN("♕"),
    BLACK_QUEEN("♛"),
    WHITE_SQUARE("◦");

    private final String display;
    PieceDisplay(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}
