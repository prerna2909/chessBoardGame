package chessBoardGame;
public class PieceRook extends PiecesClass {

	@Override
	public String moveAvailable(String position) {
		
		String BishopPosition = board.getSpotOnBoard(position);

		int[] availableAxis = moveCheck(BishopPosition);
		String outputPrint = null;
		String[] possibleUpMoves = new String[8];
		possibleUpMoves[0] = upMove(availableAxis);
		int Up = 1;
		while (null != possibleUpMoves[Up - 1]) {
			possibleUpMoves[Up] = upMove(moveCheck(board.getSpotOnBoard(possibleUpMoves[Up - 1])));
			Up++;
		}
		if(null != possibleUpMoves)
			outputPrint = chessboardMainClass.printOutput(possibleUpMoves);
		
		
		String[] possibleDownMoves = new String[8];
		possibleDownMoves[0] = downMove(availableAxis);
		int down = 1;
		while (null != possibleDownMoves[down - 1]) {
			possibleDownMoves[down] = downMove(moveCheck(board.getSpotOnBoard(possibleDownMoves[down - 1])));
			down++;
		}
		if(null != possibleDownMoves)
			outputPrint += chessboardMainClass.printOutput(possibleDownMoves);

		String[] possibleLeftMoves = new String[8];
		possibleLeftMoves[0] = leftMove(availableAxis);
		int left = 1;
		while (null != possibleLeftMoves[left - 1]) {
			possibleLeftMoves[left] = leftMove(moveCheck(board.getSpotOnBoard(possibleLeftMoves[left - 1])));
			left++;
		}
		if(null != possibleLeftMoves)
			outputPrint += chessboardMainClass.printOutput(possibleLeftMoves);
		
		
		String[] possibleRightMoves = new String[8];
		possibleRightMoves[0] = rightMove(availableAxis);
		int right = 1;
		while (null != possibleRightMoves[right - 1]) {
			possibleRightMoves[right] = rightMove(moveCheck(board.getSpotOnBoard(possibleRightMoves[right - 1])));
			right++;
		}
		if(null != possibleRightMoves)
			outputPrint += chessboardMainClass.printOutput(possibleRightMoves);
		
		return outputPrint;
	}

}
