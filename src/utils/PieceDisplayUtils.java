package utils;

import enums.PlayerColor;
import enums.PieceDisplay;

import java.util.HashMap;
import java.util.Map;

public class PieceDisplayUtils {

    public static Map<PlayerColor, String> createDisplayMap(PieceDisplay whitePiece, PieceDisplay blackPiece) {
        Map<PlayerColor, String> displayMap = new HashMap<>();
        displayMap.put(PlayerColor.WHITE, whitePiece.getDisplay());
        displayMap.put(PlayerColor.BLACK, blackPiece.getDisplay());
        return displayMap;
    }


}

