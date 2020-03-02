package chessBoardGame;

public class PieceHorse extends PiecesClass {

	@Override
	public String moveAvailable(String position) {
		
	String HorsePosition = board.getSpotOnBoard(position);	
		
		int[] availableAxis = moveCheck(HorsePosition);	
		
		String[] moves = new String[8];
		String upMove = board.getSpotOnBoard(upMove(availableAxis));		
		int[] upPosition = moveCheck(upMove);			
		String upMoveAgain = board.getSpotOnBoard(upMove(upPosition));
		int[] newUpPosition = moveCheck(upMoveAgain);			
		moves[0]=  rightMove(newUpPosition);		
		moves[1] = leftMove(newUpPosition);
		
		String downMove = board.getSpotOnBoard(downMove(availableAxis));		
		int[] downPosition = moveCheck(downMove);		
		String downMoveAgain = board.getSpotOnBoard(downMove(downPosition));
		int[] newDownPosition = moveCheck(downMoveAgain);			
		moves[2]=  rightMove(newDownPosition);		
		moves[3] = leftMove(newDownPosition);
		
		String rightMove = board.getSpotOnBoard(rightMove(availableAxis));		
		int[] rightPosition = moveCheck(rightMove);		
		String rightMoveAgain = board.getSpotOnBoard(rightMove(rightPosition));
		int[] newRightPosition = moveCheck(rightMoveAgain);			
		String upRightMove = upMove(newRightPosition);
		moves[4]=  upMove(newRightPosition);		
		moves[5] = downMove(newRightPosition);
		
		String leftMove = board.getSpotOnBoard(leftMove(availableAxis));		
		int[] leftPosition = moveCheck(leftMove);		
		String leftMoveAgain = board.getSpotOnBoard(leftMove(leftPosition));
		int[] newLeftPosition = moveCheck(leftMoveAgain);			
		moves[6]=  upMove(newLeftPosition);		
		moves[7] = downMove(newLeftPosition);
		
		
		
	return chessboardMainClass.printOutput(moves);
		
		
		
	}

	
	
}
