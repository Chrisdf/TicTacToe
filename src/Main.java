import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to TicTacToe \n");
		System.out.println("Input two numbers without a comma to input a position on the board");
		
		boolean quitGame = false;
		Scanner input = new Scanner(System.in);
		int playerTurn = 1;
		
		
		String[][] board = {
				{" ", " ", " "},
				{" ", " ", " "},
				{" ", " ", " "}
				};
		
		String[][] coords = {
				
				{"1,1", "1,2", "1,3"},
				{"1,2", "2,2", "2,3"},
				{"1,3", "2,3", "3,3"}
				};
				
		
		
		while(quitGame == false){
		
			
			displayBoard(board, coords);
		
			int coordOne = input.nextInt();
			int coordTwo = input.nextInt();
			
			
			board = setBoard(board, coordOne, coordTwo, playerTurn);
			
			quitGame = checkIfWon(board);
			
			if(playerTurn == 1)
				playerTurn = 2;
			else
				playerTurn = 1;
			
		
		
		}
		
		
		input.close();
		
	}
	
	
	public static void displayBoard(String[][] board, String[][] coords){
		
		
		for(int i = 0; i<board.length; i++){
			
			for(int d = 0; d<board[i].length; d++){
				
				System.out.print(board[i][d]);
				
			}
			
			System.out.print("\t \t");
			
			for(int d = 0; d<board[i].length; d++){
				
				System.out.print(coords[i][d] + "  ");
				
			}
			
			
			System.out.println();
			
		}
			
	
		
	}
	
	public static String[][] setBoard(String[][] board, int posOne, int posTwo, int playerTurn){
		

			
		
		if(board[(posOne -1)][(posTwo - 1)] == " "){
		
		if(playerTurn == 1)
		board[(posOne -1)][(posTwo - 1)] = " X ";
		
		if(playerTurn == 2)
		board[(posOne -1)][(posTwo - 1)] = " O ";
		
		}
		
		else
			System.out.println("Invalid placement");
		
		
		return board;
		
	}
	
	public static boolean checkIfWon(String[][] board){
		
		
		
		
		
		return false;
	}
	
	
}

