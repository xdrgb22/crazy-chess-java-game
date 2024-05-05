package chess;

public class King extends Piece {

	public King(String color, Integer boardSize) {
		super(color, boardSize);
		pieceColor = color;
		alive = true;
		name = "King";
	}
	
	public void printPiece() {
		System.out.println("Piece type: King " + new String(pieceColor));
	}
	
	public void printPieceBoardRep() {
		System.out.print("Ki/" + pieceColor.charAt(0) + " ");
	}
}
