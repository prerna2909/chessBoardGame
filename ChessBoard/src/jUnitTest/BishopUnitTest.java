package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import chessBoardGame.PieceBishop;
import chessBoardGame.PiecesClass;

public class BishopUnitTest {
	
	PiecesClass piecesClass = new PieceBishop();
	
	
	  @Test 
	  public void testOfBishopRandomPosition() {	  
		  String output ="E3,F4,G5,H6";
		  output += "E1"; 
		  output +="C3,B4,A5";
		  output += "C1";
		  assertEquals(output, piecesClass.moveAvailable("d2"));
	  
	 }
	 

	
	
	  @Test
	  public void testOfBishopCornerPosition() {
	  
		  String output ="B2,C3,D4,E5,F6,G7,H8";
		 
		  assertEquals(output,piecesClass.moveAvailable("A1"));
	  
	  }
	 
	  
	
	  @Test
	  public void testOfBishopTopRowPosition() {
	  
		  String output ="E7,F6,G5,H4";
		  output += "C7,B6,A5";
		  assertEquals(output, piecesClass.moveAvailable("D8"));
		  
	  }
	
	  
	  @Test
	  public void testOfBishopSideRowPosition() {
	 
		  String output ="G6,F7,E8";
		  output += "G4,F3,E2,D1";
		  
	  assertEquals(output, piecesClass.moveAvailable("H5"));
	  
	  }
	 


}
