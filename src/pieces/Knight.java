package pieces;

import enums.PieceDisplay;
import enums.PlayerColor;
import utils.PieceDisplayUtils;

import java.util.Map;

public class Knight implements Piece {
    private final String display;
    private static final Map<PlayerColor, String> DISPLAY_MAP =
            PieceDisplayUtils.createDisplayMap(PieceDisplay.WHITE_KNIGHT, PieceDisplay.BLACK_KNIGHT);
    public Knight(PlayerColor color) {
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
