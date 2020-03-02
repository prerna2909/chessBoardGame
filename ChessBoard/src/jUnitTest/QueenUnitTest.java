package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import chessBoardGame.PieceQueen;
import chessBoardGame.PiecesClass;

public class QueenUnitTest {

	PiecesClass piecesClass = new PieceQueen();
	
	
	  @Test 
	  public void testOfQueenRandomPosition() {	  
		  String output ="D3,D4,D5,D6,D7,D8";
		  output += "D1";
		  output += "C2,B2,A2";
		  output += "E2,F2,G2,H2";
		  output += "E3,F4,G5,H6";
		  output += "E1"; 
		  output +="C3,B4,A5";
		  output += "C1";
		  assertEquals(output, piecesClass.moveAvailable("d2"));
	  
	 }
	 

	
	
	  @Test
	  public void testOfQueenCornerPosition() {
	  
		  String output ="A2,A3,A4,A5,A6,A7,A8";
		  output += "B1,C1,D1,E1,F1,G1,H1";
		  output += "B2,C3,D4,E5,F6,G7,H8";
		  assertEquals(output,piecesClass.moveAvailable("A1"));
	  
	  }
	 
	  
	
	  @Test
	  public void testOfQueenTopRowPosition() {
	  
		  String output ="D7,D6,D5,D4,D3,D2,D1";
		  output += "C8,B8,A8";
		  output +="E8,F8,G8,H8";
		  output += "E7,F6,G5,H4";
		  output += "C7,B6,A5";
		  assertEquals(output, piecesClass.moveAvailable("D8"));
		  
	  }
	
	  
	  @Test
	  public void testOfQueenSideRowPosition() {
	 
		  String output ="H6,H7,H8";
		  output += "H4,H3,H2,H1";
		  output += "G5,F5,E5,D5,C5,B5,A5";
		  output += "G6,F7,E8";
		  output += "G4,F3,E2,D1";
		  
	  assertEquals(output, piecesClass.moveAvailable("H5"));
	  
	  }
	 

}
