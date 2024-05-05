package chess;

public class Queen extends Piece {
	public Queen(String color, int boardSize) {
		super(color, boardSize);
		pieceColor = color;
		alive = true;
		name = "Queen";
	}

	public void printPiece() {
		System.out.println("Piece type: Queen " + pieceColor);
	}
	
	public void printPieceBoardRep() {
		System.out.print("Q" + pieceColor.charAt(0) + " ");
	}
}
