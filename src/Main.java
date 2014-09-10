import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to TicTacToe \n");
		System.out.println("Input two numbers to pick a position on the board");
		
		boolean ingame = true;
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
				
		
		
		while(ingame){
		
			
			displayBoard(board, coords);
		
			int coordOne = input.nextInt();
			int coordTwo = input.nextInt();
			
			board = setBoard(board, coordOne, coordTwo, playerTurn);
			
			if(playerTurn == 1)
				playerTurn = 2;
			
			if(playerTurn == 2)
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
		
		int actualArrayValueOne = 0;
		int actualArrayValueTwo = 0;
		
		switch(posOne){
		
		case 1:
			actualArrayValueOne = 0;
			break;
		case 2:
			actualArrayValueOne = 1;
			break;
		case 3:
			actualArrayValueOne = 2;
			break;
		
		}
		
		switch(posTwo){
				
				case 1:
					actualArrayValueTwo = 0;
					break;
				case 2:
					actualArrayValueTwo = 1;
					break;
				case 3:
					actualArrayValueTwo = 2;
					break;
				
		}
		
		if(playerTurn == 1)
		board[actualArrayValueOne][actualArrayValueTwo] = "X";
		
		if(playerTurn == 2)
		board[actualArrayValueOne][actualArrayValueTwo] = "O";
		
		
		
		
		return board;
		
	}
	
	
	
}

