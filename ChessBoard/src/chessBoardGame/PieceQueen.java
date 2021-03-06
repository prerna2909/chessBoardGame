package chessBoardGame;
public class PieceQueen extends PiecesClass {

	
	@Override
	public String moveAvailable(String position) {

		String QueenPosition = board.getSpotOnBoard(position);

		int[] availableAxis = moveCheck(QueenPosition);
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
		if(null != possibleDownMoves)
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

		String[] possibleDiagonalRightUpMoves = new String[8];
		possibleDiagonalRightUpMoves[0] = diagonalRightUpMove(availableAxis);
		int diagonalRightUp = 1;
		while (null != possibleDiagonalRightUpMoves[diagonalRightUp - 1]) {
			possibleDiagonalRightUpMoves[diagonalRightUp] = diagonalRightUpMove(
					moveCheck(board.getSpotOnBoard(possibleDiagonalRightUpMoves[diagonalRightUp - 1])));
			diagonalRightUp++;
		}
		if(null != possibleDiagonalRightUpMoves)
		outputPrint += chessboardMainClass.printOutput(possibleDiagonalRightUpMoves);

		String[] possibleDiagonalRightDownMove = new String[8];
		possibleDiagonalRightDownMove[0] = diagonalRightDownMove(availableAxis);
		int diagonalRightDown = 1;
		while (null != possibleDiagonalRightDownMove[diagonalRightDown - 1]) {
			possibleDiagonalRightDownMove[diagonalRightDown] = diagonalRightDownMove(
					moveCheck(board.getSpotOnBoard(possibleDiagonalRightDownMove[diagonalRightDown - 1])));
			diagonalRightDown++;
		}
		if(null != possibleDiagonalRightDownMove)
		outputPrint += chessboardMainClass.printOutput(possibleDiagonalRightDownMove);

		String[] possibleDiagonalLeftUpMove = new String[8];
		possibleDiagonalLeftUpMove[0] = diagonalLeftUpMove(availableAxis);
		int diagonalLeftUp = 1;
		while (null != possibleDiagonalLeftUpMove[diagonalLeftUp - 1]) {
			possibleDiagonalLeftUpMove[diagonalLeftUp] = diagonalLeftUpMove(
					moveCheck(board.getSpotOnBoard(possibleDiagonalLeftUpMove[diagonalLeftUp - 1])));
			diagonalLeftUp++;
		}
		if(null != possibleDiagonalLeftUpMove)
			outputPrint += chessboardMainClass.printOutput(possibleDiagonalLeftUpMove);
		
		String[] possibleDiagonalLeftDownMove = new String[8];
		possibleDiagonalLeftDownMove[0] = diagonalLeftDownMove(availableAxis);
		int diagonalLeftDown = 1;
		while (null != possibleDiagonalLeftDownMove[diagonalLeftDown - 1]) {
			possibleDiagonalLeftDownMove[diagonalLeftDown] = diagonalLeftDownMove(
					moveCheck(board.getSpotOnBoard(possibleDiagonalLeftDownMove[diagonalLeftDown - 1])));
			diagonalLeftDown++;
		}
		if(null != possibleDiagonalLeftDownMove)
		outputPrint += chessboardMainClass.printOutput(possibleDiagonalLeftDownMove);
		
		return outputPrint;
	}

	
	

	
}
