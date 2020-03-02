package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import chessBoardGame.PieceRook;
import chessBoardGame.PiecesClass;

public class RookUnitTest {

	PiecesClass piecesClass = new PieceRook();
	
	
	@Test 
	  public void testOfRookRandomPosition() {	  
		  String output ="D3,D4,D5,D6,D7,D8";
		  output += "D1";
		  output += "C2,B2,A2";
		  output += "E2,F2,G2,H2";
		  assertEquals(output, piecesClass.moveAvailable("d2"));
	  
	 }

	  @Test
	  public void testOfRookCornerPosition() {
	  
		  String output ="A2,A3,A4,A5,A6,A7,A8";
		  output += "B1,C1,D1,E1,F1,G1,H1";
		  assertEquals(output,piecesClass.moveAvailable("A1"));
	  
	  }
	 
	  
	
	  @Test
	  public void testOfRookTopRowPosition() {
	  
		  String output ="D7,D6,D5,D4,D3,D2,D1";
		  output += "C8,B8,A8";
		  output +="E8,F8,G8,H8";

		  assertEquals(output, piecesClass.moveAvailable("D8"));
		  
	  }
	
	  
	  @Test
	  public void testOfRookSideRowPosition() {
	 
		  String output ="H6,H7,H8";
		  output += "H4,H3,H2,H1";
		  output += "G5,F5,E5,D5,C5,B5,A5";
	  assertEquals(output, piecesClass.moveAvailable("H5"));
	  
	  }


	
	
	 


}
