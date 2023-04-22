package pieces;

import enums.PieceDisplay;

import enums.PlayerColor;
import utils.PieceDisplayUtils;

import java.util.Map;

public class Rook implements Piece {
    private final String display;
    private static final Map<PlayerColor, String> DISPLAY_MAP =
            PieceDisplayUtils.createDisplayMap(PieceDisplay.WHITE_ROOK, PieceDisplay.BLACK_ROOK);

    public Rook(PlayerColor color) {
        this.display = DISPLAY_MAP.get(color);
    }



    @Override
    public boolean isValidMove() {
        return false;
    }

    @Override
    public String getDisplay() {
        return display;
    }
}
