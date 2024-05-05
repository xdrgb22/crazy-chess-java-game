package chess;

public class PieceCollection {
	Piece pieceArray [];
	public PieceCollection(String color, Integer boardSize) {
		pieceArray = new Piece[boardSize*2];
		for (int i = 0; i < (boardSize*2); i++) {
			if (i < 8) {
				pieceArray[i] = new Pawn(color, boardSize, i);
			}
			else if ((7 < i) & (i < 10)) {
				pieceArray[i] = new Rook(color, boardSize, i);
			}
			else if ((9 < i) & (i < 12)) {
				pieceArray[i] = new Knight(color, boardSize, i);
			}
			else if ((11 < i) & (i < 14)) {
				pieceArray[i] = new Bishop(color, boardSize, i);
			}
			else if ((13 < i) & (i < 15)) {
				pieceArray[i] = new Queen(color, boardSize);
			}
			else if ((14 < i) & (i < 16)) {
				pieceArray[i] = new King(color, boardSize);
			}
		}
	}
	
	public void printPieceCollection() {
		for (int i = 0; i < pieceArray.length; i++) {
			pieceArray[i].printPiece();
		}
	}
}
