package chess;

public class Pawn extends Piece {
	
	public Pawn(String color, int boardSize, int collectionNumber) {
		super(color, boardSize, collectionNumber);
		pieceNumber = collectionNumber + 1;
		pieceColor = color;
		alive = true;
		name = "Pawn";
	}
	
	public void printPiece() {
		System.out.println("Piece type: Pawn " + pieceColor);
	}
	
	public void printPieceBoardRep() {
		System.out.print("P" + pieceNumber + "/" + pieceColor.charAt(0) + " ");
	}
	
	public void movement() {
		
	}
}
