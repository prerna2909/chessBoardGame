package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import chessBoardGame.PieceKing;
import chessBoardGame.PiecesClass;

public class KingUnitTests {

	PiecesClass piecesClass = new PieceKing();
	
	
	@Test
	public void testOfKingRandomPosition() {
		
		 assertEquals("D3,E3,E2,E1,D1,C1,C2,C3", piecesClass.moveAvailable("d2"));
		 
	}
	
	@Test
	public void testOfKingCornerPosition() {
				
		 assertEquals("A2,B2,B1", piecesClass.moveAvailable("A1"));
		
	}
	
	@Test
	public void testOfKingTopRowPosition() {
				
		 assertEquals("E8,E7,D7,C7,C8", piecesClass.moveAvailable("D8"));
		
	}
	
	@Test
	public void testOfKingSideRowPosition() {
				
		 assertEquals("H6,H4,G4,G5,G6", piecesClass.moveAvailable("H5"));
		
	}



}
