package chess;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		System.out.println("Hello! Welcome to Crazy Chess!");
	    int boardSize = 8;
	    String[] pieceColors = {"White", "Black"};
	    PieceCollection whitePieces = new PieceCollection(pieceColors[0], boardSize);
	    PieceCollection blackPieces = new PieceCollection(pieceColors[1], boardSize);
	    PieceCollection[] pieceCollections = {whitePieces, blackPieces};
	    Board gameBoard = new Board(boardSize, pieceCollections[0], pieceCollections[1]);
	    chessGame(pieceCollections, gameBoard, pieceColors);
	}
	
	public static void names() {
		
		}
	
	public static void chessGame(PieceCollection[] pieceCollections, Board gameBoard, String[] pieceColors) {
		int turnCount = 1;
		Scanner chessInput = new Scanner(System.in);
		while ((pieceCollections[0].pieceArray[15].alive == true) & pieceCollections[1].pieceArray[15].alive == true) {
			System.out.println("Current turn count is: " + turnCount + "and current board is:");
			gameBoard.printCurrentBoard();
			turn(pieceCollections, turnCount, gameBoard, chessInput, pieceColors);
			turnCount += 1;
		}
		chessInput.close();
	}
	
	public static void turn(PieceCollection[] pieceCollections, int turnCount, Board gameBoard, Scanner chessInput, String[] pieceColors) {
		for (int currentTeam = 0; currentTeam < 2; currentTeam++) {
			System.out.println("Player with " + pieceColors[currentTeam] + " pieces turn next.");
			int moveChoice = 0;
			while ((moveChoice != 1) & (moveChoice != 2)) {
				System.out.println("Enter 1 to move a pawn and 2 to move a piece which is not a pawn.");
				while (!chessInput.hasNextInt()) {
					System.out.println("Input is not a number.");
					chessInput.nextLine();
				}
				moveChoice = chessInput.nextInt();
				chessInput.nextLine();
				if (moveChoice == 1) {
					pawnMovement(pieceCollections, turnCount, gameBoard, chessInput, pieceColors, currentTeam);
				} else if (moveChoice == 2) {
					nonPawnMovement(pieceCollections, turnCount, gameBoard, chessInput, pieceColors, currentTeam);
				} else {
					System.out.println("Invalid choice. Please enter 1 or 2.");
				}
			}
		}
	}
	
	public static void pawnMovement(PieceCollection[] pieceCollections, int turnCount, Board gameBoard, Scanner chessInput, String[] pieceColors, int currentTeam) {
		System.out.println("Choose which pawn to move! Living pawns for " + pieceColors[currentTeam] + " team are: ");
		for (int i = 0; i < 8; i++) {
			if (pieceCollections[currentTeam].pieceArray[i].alive == true) {
				System.out.print("Pawn #" + (i+1) + " ");
			}
		} 
		System.out.println();
	}
	
	public static void nonPawnMovement(PieceCollection[] pieceCollections, int turnCount, Board gameBoard, Scanner chessInput, String[] pieceColors, int currentTeam) {
		System.out.println("Choose which non-pawn piece to move! Living non-pawn pieces for " + pieceColors[currentTeam] + " team are: ");
		for (int i = 8; i < 14; i++) {
			if (pieceCollections[currentTeam].pieceArray[i].alive == true) {
				System.out.print(pieceCollections[currentTeam].pieceArray[i].name + " #" + pieceCollections[currentTeam].pieceArray[i].pieceNumber + " ");
			}
		} 
		for (int i = 14; i < 16; i++) {
			if (pieceCollections[currentTeam].pieceArray[i].alive == true) {
				System.out.print(pieceCollections[currentTeam].pieceArray[i].name + " ");
			}
		}
		System.out.println();
	}
}
