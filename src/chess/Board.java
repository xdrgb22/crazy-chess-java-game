package chess;

public class Board {
	Integer boardDimension;
	private Piece [][] boardSpaces;
	public Board(Integer dimension, PieceCollection topPieces, PieceCollection bottomPieces) {
		boardDimension = dimension;
		boardSpaces = new Piece[dimension][dimension];
		for (Integer i=0; i < boardSpaces.length; i++) {
			for (Integer j=0; j < boardSpaces[i].length; j++) {
				boardSpaces[i][j] = new Piece();
			}
		}
		fillTopBoard(topPieces);
		fillBottomBoard(bottomPieces);
	}
	
	public void fillTopBoard(PieceCollection pieces) {
		for (int i = 0; i < pieces.pieceArray.length; i++) {
			if (i < 8) {
				boardSpaces[1][i] = pieces.pieceArray[i];
			}
			else if ((7 < i) & (i < 10)) {
				if (i % 2 == 0) {
					boardSpaces[0][0] = pieces.pieceArray[i];
				}
				else {
					boardSpaces[0][boardDimension-1] = pieces.pieceArray[i];
				}
			}
			else if ((9 < i) & (i < 12)) {
				if (i % 2 == 0) {
					boardSpaces[0][1] = pieces.pieceArray[i];
				}
				else {
					boardSpaces[0][boardDimension-2] = pieces.pieceArray[i];
				}
			}
			else if ((11 < i) & (i < 14)) {
				if (i % 2 == 0) {
					boardSpaces[0][2] = pieces.pieceArray[i];
				}
				else {
					boardSpaces[0][boardDimension-3] = pieces.pieceArray[i];
				}
			}
			else if ((13 < i) & (i < 15)) {
				boardSpaces[0][3] = pieces.pieceArray[i];
			}
			else if ((14 < i) & (i < 16)) {
				boardSpaces[0][4] = pieces.pieceArray[i];
			}
		}
	}
	
	public void fillBottomBoard(PieceCollection pieces) {
		for (int i = 0; i < pieces.pieceArray.length; i++) {
			if (i < 8) {
				boardSpaces[boardDimension-2][i] = pieces.pieceArray[i];
			}
			else if ((7 < i) & (i < 10)) {
				if (i % 2 == 0) {
					boardSpaces[boardDimension-1][0] = pieces.pieceArray[i];
				}
				else {
					boardSpaces[boardDimension-1][boardDimension-1] = pieces.pieceArray[i];
				}
			}
			else if ((9 < i) & (i < 12)) {
				if (i % 2 == 0) {
					boardSpaces[boardDimension-1][1] = pieces.pieceArray[i];
				}
				else {
					boardSpaces[boardDimension-1][boardDimension-2] = pieces.pieceArray[i];
				}
			}
			else if ((11 < i) & (i < 14)) {
				if (i % 2 == 0) {
					boardSpaces[boardDimension-1][2] = pieces.pieceArray[i];
				}
				else {
					boardSpaces[boardDimension-1][boardDimension-3] = pieces.pieceArray[i];
				}
			}
			else if ((13 < i) & (i < 15)) {
				boardSpaces[boardDimension-1][4] = pieces.pieceArray[i];
			}
			else if ((14 < i) & (i < 16)) {
				boardSpaces[boardDimension-1][3] = pieces.pieceArray[i];
			}
		}
	}
	
	public void printCurrentBoard() {
		int count = 0;
		for (Integer i=0; i < boardSpaces.length; i++) {
			for (Integer j=0; j < boardSpaces[i].length; j++) {
				if (count % 8 == 7) {
					boardSpaces[i][j].printPieceBoardRep();
					System.out.println();
				}
				else {
					boardSpaces[i][j].printPieceBoardRep();
				}
				count += 1;
			}
		}
	}
	
}
