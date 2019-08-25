import java.util.Scanner;


public class TicTacToe068V1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dim of grid?");
		int dim = Integer.parseInt(scanner.nextLine());
		boolean gameOver = false;
		int tie = 0;
		Cell[][] board = new Cell[dim][dim];
		String playerTurn = "O";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[1].length; j++) {
				board[i][j] = new Cell("-");
			
			}
		}
		
		while (gameOver == false) {
			tie = 0;
			System.out.println(playerTurn + " , your turn");
			System.out.println("What row: ");
			int row = Integer.parseInt(scanner.nextLine());
			System.out.println("What column: ");
			int col = Integer.parseInt(scanner.nextLine());
			board[row][col].fixCellVal(playerTurn);
			printBoard(board);
			gameOver = scanBoard(board, playerTurn);
			if (playerTurn == "O") {
				playerTurn = "X";
			} else {
				playerTurn = "O";
			}
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[1].length; j++) {
					if (board[i][j].getCellVal().equals("O") || board[i][j].getCellVal().equals("X")) {
						tie++;
					}
				}
			}			
			if (tie == board.length * board[1].length) {
				gameOver = true;
			}
			
			
		}
		
		if (tie == board.length * board[1].length) {
			System.out.print("Its a tie");
		} else {
			if (playerTurn == "O") {
				System.out.print("Player X won");
			} else {
				System.out.print("Player O won");
			}
		}
		
	
	}
	
	/** Scans board for win cases
	 *@ param boardArray the board to scanBoard
	 *@ param playerTurn which player's turn it is
	 *@ return win or not
	*/
	public static boolean scanBoard(Cell[][] boardArray, String playerTurn) {
		
		boolean gameOver = false; 
		
		boolean result = horTripletDetecter(boardArray, playerTurn);
		boolean result2 = verTripletDetecter(boardArray, playerTurn);
		boolean result3 = diagonalDetecter(boardArray, playerTurn);
		
		
		if (result == true || result2 == true || result3 == true) {
			gameOver = true;
		}	
		
		return gameOver;
	}
	
	public static boolean diagonalDetecter(Cell[][] testArray, String playerTurn) {
		int counter = 0;
		int counter1 = 0;
		boolean gameOver = false;
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[0 + i][0 + i].getCellVal() == playerTurn) {
				counter++;
			} 
			
		}
		
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[(testArray.length - 1) - i][0 + i].getCellVal() == playerTurn) {
				counter1++;
			}
		}
		
		if (counter1 == testArray.length || counter == testArray.length) {
			gameOver = true;
		}
		
		return gameOver;
		
	}
	
	public static boolean horTripletDetecter(Cell[][] testArray, String playerTurn) {
		boolean gameOver = false;
		int counter = 0;
		for (int i = 0; i < testArray.length; i++) {
			counter = 0;
			for (int j = 0; j < testArray.length; j++) {
				if ((testArray[i][j].getCellVal()).equals(playerTurn)) {
					counter++;
				}
				if (counter == testArray.length) {
					gameOver = true;
				}
			}
					
		}
		
		return gameOver;
	}
	
	public static boolean verTripletDetecter(Cell[][] testArray, String playerTurn) {
		boolean gameOver = false;
		int counter = 0;
		for (int i = 0; i < testArray.length; i++) {
			counter = 0;
			for (int j = 0; j < testArray.length; j++) {
				if ((testArray[j][i].getCellVal()).equals(playerTurn)) {
					counter++;
				}
				if (counter == testArray.length) {
					gameOver = true;
				}
			}
					
		}
		
		return gameOver;
	}
	
	public static int[] bubbleSorter(int[] testArray) {
		for (int j = 0; j < testArray.length; j++) {
			int first = testArray[0];
			for (int i = 1; i < testArray.length; i++) {
				int z = 0;
				if (testArray[i] < first) {
					z = first;
					testArray[i - 1] = testArray[i];
					testArray[i]  = z;
					first = testArray[i - 1];

				}
			}
		}
		
		return testArray;
	}
	
	/** Prints grid
	 *@ param boardArray the board to print
	*/
	public static void printBoard(Cell[][] boardArray) {
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[1].length; j++) {
				System.out.print(boardArray[i][j].getCellVal());
			}
			System.out.println();
		
		}
		
	}


}