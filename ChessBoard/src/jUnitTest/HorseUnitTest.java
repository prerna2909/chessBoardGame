package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import chessBoardGame.PieceHorse;
import chessBoardGame.PiecesClass;

public class HorseUnitTest {

PiecesClass piecesClass = new PieceHorse();
		
	@Test 
	  public void testOfHorseRandomPosition() {	  
		
		  assertEquals("F5,D5,F1,D1,G4,G2,C4,C2", piecesClass.moveAvailable("e3"));
	  
	 }
	
	@Test
	  public void testOfHorseCornerPosition() {
	  
		  assertEquals("B3,C2,",piecesClass.moveAvailable("A1"));
		  System.out.println("\n");
		   
	  }

	  @Test
	  public void testOfHorseTopRowPosition() {
	  

		  assertEquals("E6,C6,F7,B7", piecesClass.moveAvailable("D8"));
		  
	  }

	  @Test
	  public void testOfRookSideRowPosition() {
	 

	  assertEquals("G7,G3,F6,F4", piecesClass.moveAvailable("H5"));
	  
	  }


	
}
