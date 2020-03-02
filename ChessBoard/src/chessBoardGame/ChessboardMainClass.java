package chessBoardGame;
import java.util.Scanner;

public class ChessboardMainClass {

	
	public static void main(String[] arg)
	{	
		 Board board = new Board();
		 String ans;
		 System.out.println("WELCOME TO CHESSBOARD");
		 System.out.println("This is your board.");
		
		 PiecesClass pieceKing = new PieceKing(); 
		 PiecesClass pieceQueen = new PieceQueen(); 
		 PiecesClass pieceBishop = new PieceBishop(); 
		 PiecesClass pieceRook = new PieceRook(); 
		 PiecesClass piecePawn = new PiecePawn(); 
		 PiecesClass pieceHorse = new PieceHorse(); 
		
		 board.createBoard();
	
		 Scanner myObj = new Scanner(System.in);
		do {
				System.out.println("Choose Piece(King, Queen, Bishop, Horse,Rook or Pawn) and its Position on Board");
				try {
					String input = myObj.nextLine(); 
					String[] parts = input.split(" ");
					String pieceName = parts[0];
					String position = parts[1];
						switch(pieceName) {
							case "King": pieceKing.moveAvailable(position);
										break;
							case "Queen": pieceQueen.moveAvailable(position);
										break;
							case "Bishop": pieceBishop.moveAvailable(position);
				 						break;
							case "Pawn": piecePawn.moveAvailable(position);
				 						break;
							case "Rook": pieceRook.moveAvailable(position);
										break;
							case "Horse": pieceHorse.moveAvailable(position);
										break;
							default:  System.out.println("Bad choice.Try again.");		 
						}
				
				}catch (Exception e) {
					System.out.println("Something went wrong. Read instruction carefully. Try again");
				}
				finally {
					System.out.println("\n");
					System.out.println("Do you like to continue?");
					ans = myObj.nextLine(); 
				}
		}while(ans.equalsIgnoreCase("Yes"));
	}
	
	public String printOutput(String[] toPrint)
	{	
		String formattedString = new String();
		for(String string: toPrint )
			if (null != string)
				  formattedString += string+","; 
		int len = formattedString.length();
		if(!formattedString.equals("")) {
			System.out.println(formattedString.substring(0,len-1));
		return formattedString.substring(0,len-1);
		}
		else
			return "";
	}
}
