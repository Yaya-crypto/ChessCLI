package board;


import enums.PlayerColor;
import pieces.*;



/**
 * Responsible for managing the positions of all the pieces and board.Game state
 */
public class ChessBoard {
    private final Piece[][] chessBoard = new Piece[8][8];

    public ChessBoard() {

        for (int col = 0; col< 8; col++) {
            chessBoard[1][col] = new Pawn(PlayerColor.WHITE);
            chessBoard[6][col] = new Pawn(PlayerColor.BLACK);
        }

        chessBoard[0][0] = new Rook(PlayerColor.WHITE);
        chessBoard[0][1] = new Knight(PlayerColor.WHITE);
        chessBoard[0][2] = new Bishop(PlayerColor.WHITE);
        chessBoard[0][3] = new King(PlayerColor.WHITE);
        chessBoard[0][4] = new Queen(PlayerColor.WHITE);
        chessBoard[0][5] = new Bishop(PlayerColor.WHITE);
        chessBoard[0][6] = new Knight(PlayerColor.WHITE);
        chessBoard[0][7] = new Rook(PlayerColor.WHITE);

        chessBoard[7][0] = new Rook(PlayerColor.BLACK);
        chessBoard[7][1] = new Knight(PlayerColor.BLACK);
        chessBoard[7][2] = new Bishop(PlayerColor.BLACK);
        chessBoard[7][3] = new King(PlayerColor.BLACK);
        chessBoard[7][4] = new Queen(PlayerColor.BLACK);
        chessBoard[7][5] = new Bishop(PlayerColor.BLACK);
        chessBoard[7][6] = new Knight(PlayerColor.BLACK);
        chessBoard[7][7] = new Rook(PlayerColor.BLACK);


        for (int row = 2; row <=5 ; row++) {
            for (int col = 0; col<8; col++) {
                chessBoard[row][col] = new EmptyPosition(PlayerColor.WHITE);
            }

        }

    }

    public void printChessBoard() {
        for (Piece[] pieces : chessBoard) {
            for (Piece piece : pieces) {
                System.out.printf("%-10s ", piece.getDisplay());
            }
            System.out.println();
        }

    }

    private Piece getPieceAtPosition(Position source) {
        return null;
    }
}

