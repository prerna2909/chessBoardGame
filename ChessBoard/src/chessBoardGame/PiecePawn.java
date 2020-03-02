package chessBoardGame;

public class PiecePawn extends PiecesClass{

	@Override
	public String moveAvailable(String position) {
	
		String PawnPosition = board.getSpotOnBoard(position);	
		
		int[] availableAxis = moveCheck(PawnPosition);	
	
		String move = null;
	
		move = upMove(availableAxis);
		if(null != move ) 
			System.out.println(move);
		else
			System.out.println("No available move");
		
		return move;	
	
	
	
	}
	
}
