package chess;

public class Knight extends Piece {

	public Knight(String color, int boardSize, int collectionNumber) {
		super(color, boardSize, collectionNumber);
		pieceNumber = collectionNumber - 9;
		pieceColor = color;
		alive = true;
		name = "Knight";
	}
	
	public void printPiece() {
		System.out.println("Piece type: Knight " + pieceColor);
	}
	
	public void printPieceBoardRep() {
		System.out.print("Kn" + pieceNumber + "/" + pieceColor.charAt(0) + " ");
	}
}
