package chessBoardGame;

public class PieceBishop extends PiecesClass{


	@Override
	public String moveAvailable(String position) {
		
		String BishopPosition = board.getSpotOnBoard(position);

		int[] availableAxis = moveCheck(BishopPosition);
		String outputPrint = null;
		String[] possibleDiagonalRightUpMoves = new String[8];
		possibleDiagonalRightUpMoves[0] = diagonalRightUpMove(availableAxis);
		int diagonalRightUp = 1;
		while (null != possibleDiagonalRightUpMoves[diagonalRightUp - 1]) {
			possibleDiagonalRightUpMoves[diagonalRightUp] = diagonalRightUpMove(
					moveCheck(board.getSpotOnBoard(possibleDiagonalRightUpMoves[diagonalRightUp - 1])));
			diagonalRightUp++;
		}
		if(null != possibleDiagonalRightUpMoves)
			outputPrint = chessboardMainClass.printOutput(possibleDiagonalRightUpMoves);
		

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
