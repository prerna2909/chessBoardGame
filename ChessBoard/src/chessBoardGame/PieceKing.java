package chessBoardGame;

public class PieceKing extends PiecesClass {
	
	
	@Override
	public String moveAvailable(String position ) {
		
		String kingPosition = board.getSpotOnBoard(position);	
		
		int[] availableAxis = moveCheck(kingPosition);	
		
		String[] moves = new String[8];
		
		moves[0] = upMove(availableAxis);
		moves[1] = diagonalRightUpMove(availableAxis);
		moves[2] = rightMove(availableAxis);
		moves[3] = diagonalRightDownMove(availableAxis);
		moves[4] = downMove(availableAxis);
		moves[5] = diagonalLeftDownMove(availableAxis);
		moves[6] = leftMove(availableAxis);
		moves[7] = diagonalLeftUpMove(availableAxis);	
		
		return chessboardMainClass.printOutput(moves);
		
	}


}
