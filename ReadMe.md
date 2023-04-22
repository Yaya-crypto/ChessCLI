# Chess in the Command Line

This is a Java command-line application that allows you to play chess in your terminal. It includes the following packages:

- `pieces`: Contains the `Piece` interface and six concrete classes for each piece in chess: `Rook`, `Knight`, `Bishop`, `Queen`, `King`, and `Pawn`.

- `moves`: Contains the `Move` interface and concrete classes for each type of move, such as `NormalMove`, `CaptureMove`, `EnPassantMove`, `CastleMove`, and `PromotionMove`.

- `board`: Contains the `ChessBoard` class, which represents the state of the chess board, and the `Game` class, which manages the game logic and player turns.

- `utils`: Contains utility functions to simplify the code, such as `Utils.getPieceAt()` to retrieve the piece at a given position on the board.

- `enums`: Contains commonly used definitions, such as `PlayerColor` to represent the color of a player, and `PieceType` to represent the type of a piece.

## Usage
To run through the CLI (this is a CLI Game after all)
* Clone the project `git clone https://github.com/Yaya-crypto/ChessCLI.git`
* cd into the `src` directory
* `javac Game.java`
* `java Game`

OR

Simply run the `Game` class. The game will prompt you to input the starting and ending positions of your move, such as `e2 e4` to move the pawn at `e2` to `e4`. You can also enter `quit` at any time to end the game. (This is in development)


## Contributing

If you would like to contribute to this project, feel free to submit a pull request or open an issue on GitHub. Contributions are always welcome!

## License

This project is not licensed!
