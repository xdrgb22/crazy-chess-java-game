package chess;

public class Bishop extends Piece {

	public Bishop(String color, int boardSize, int collectionNumber) {
		super(color, boardSize, collectionNumber);
		pieceNumber = collectionNumber - 11;
		pieceColor = color;
		alive = true;
		name = "Bishop";
	}
	
	public void printPiece() {
		System.out.println("Piece type: Bishop " + pieceColor);
	}
	
	public void printPieceBoardRep() {
		System.out.print("B" + pieceNumber + "/" + pieceColor.charAt(0) + " ");
	}
}
