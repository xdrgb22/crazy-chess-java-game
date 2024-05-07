package chess;

public class Piece {
	
	String pieceColor;
	String name;
	int pieceNumber;
	int moves = 0;
	boolean alive;
	
	public Piece(String color, int boardSize, int pieceNumber) {
	}
	
	public Piece() {
		pieceColor = "empty space";
	}
	
	
	public Piece(String color, int boardSize) {
	}

	public void printPiece() {
		System.out.println("Piece type: " + pieceColor);
		
	}
	
	public void printPieceBoardRep() {
		System.out.print("ES   ");
	}
}
