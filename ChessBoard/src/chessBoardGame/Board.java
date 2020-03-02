package chessBoardGame;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class Board {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	int[][] boardMatrix = new int[9][9];
	int alpha;
	int Xaxis;
	int Yaxis;

	
	public void createBoard() {
		for (int row = boardMatrix.length-1; row >= 1; row--)
		{ 
			alpha = 65;
			for (int col = boardMatrix[row].length-1; col >= 1; col--)
			{ 		
				System.out.print(Character.toString((char)alpha)+row + "\t");
				alpha++;			
			} 	
			System.out.println(); 
		}
	}
	

	
	public String getSpotOnBoard(String position)
	{
		Xaxis = 8;
		String positionOnBoard = null;
		if(null != position) {
			for (int row = boardMatrix.length-1; row >= 1; row--)
			{ 
				alpha = 65;
			
				Yaxis = 8;
				for (int col = boardMatrix[row].length-1; col >= 1; col--)
				{ 				
					if(position.equalsIgnoreCase(Character.toString((char)alpha)+row))
					{
						positionOnBoard = Xaxis+","+Yaxis;
						break;
					}
						alpha++;
						Yaxis--;
				} 	
				Xaxis--;
			}	
		}
		return positionOnBoard;
	}
	
	
	public String returnSportOnBoard(int[] availableAxis)
	{
		String boardSpot = null;
		for (int row = boardMatrix.length-1; row >= 1; row--)
		{ 
			alpha = 65;
			for (int col = boardMatrix[row].length-1; col >= 1; col--)
			{ 		
				if(availableAxis[0] ==row && availableAxis[1] == col) {
					boardSpot = Character.toString((char)alpha)+row;
					break;
				}
				alpha++;			
			} 	
		}
		return boardSpot;
	}
}
