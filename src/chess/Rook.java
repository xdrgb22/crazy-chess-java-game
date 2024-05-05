package chess;

public class Rook extends Piece {

	public Rook(String color, int boardSize, int collectionNumber) {
		super(color, boardSize, collectionNumber);
		pieceNumber = collectionNumber - 7;
		pieceColor = color;
		alive = true;
		name = "Rook";
	}
	
	public void printPiece() {
		System.out.println("Piece type: Rook " + pieceColor);
	}
	
	public void printPieceBoardRep() {
		System.out.print("R" + pieceNumber + "/" + pieceColor.charAt(0) + " ");
	}
}
