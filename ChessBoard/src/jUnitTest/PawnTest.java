package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import chessBoardGame.PiecePawn;
import chessBoardGame.PiecesClass;

public class PawnTest {
	
	PiecesClass piecesClass = new PiecePawn();
	

	// No value after D8. It will print Noavailable value
	  @Test
	  public void testOfPawnTopRowPosition() {

	//	  assertEquals("No available move", piecesClass.moveAvailable("D8")); 
		  
		  
	  }

	  @Test
	  public void testOfPawnCornerPosition() {
	  
		 
		  assertEquals("A2",piecesClass.moveAvailable("A1"));
	  
	  }
	 
	
	  
	  @Test
	  public void testOfPawnSideRowPosition() {
	  
		  assertEquals("H6", piecesClass.moveAvailable("H5"));
	  
	  }
	 

	  @Test 
	  public void testOfPawnRandomPosition() {	  
		
		  assertEquals("D3", piecesClass.moveAvailable("d2"));
	  
	 }
	

}
