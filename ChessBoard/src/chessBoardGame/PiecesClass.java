package chessBoardGame;


public abstract class PiecesClass {

	Board board = new Board();
	ChessboardMainClass chessboardMainClass = new ChessboardMainClass();
	
	public abstract String moveAvailable(String position);
	
	
	public int[] moveCheck(String position) {
		if(null != position) {
			String[] parts = position.split(",");
			int[] axis = new int[parts.length];
			for (int i = 0; i < parts.length; i++) {
				axis[i] = Integer.parseInt(parts[i]);
			}
	
			return axis;
		}
		return null;
	}
	
	public String upMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0] + 1;
			tempAxis[1] = availableAxis[1];
			String upMove = board.returnSportOnBoard(tempAxis);
			return upMove;
		}
		return null;
	}

	
	public String downMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0] - 1;
			tempAxis[1] = availableAxis[1];
			String downMove = board.returnSportOnBoard(tempAxis);
			return downMove;
		}
		return null;
	}

	
	public String leftMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0];
			tempAxis[1] = availableAxis[1] + 1;
			String leftMove = board.returnSportOnBoard(tempAxis);
			return leftMove;
		}
		return null;
	}

	
	public String rightMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0];
			tempAxis[1] = availableAxis[1] - 1;
			String rightMove = board.returnSportOnBoard(tempAxis);
			return rightMove;
		}
		return null;
	}

	public String diagonalRightUpMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0] + 1;
			tempAxis[1] = availableAxis[1] - 1;
			String diagonalRightUpMove = board.returnSportOnBoard(tempAxis);
			return diagonalRightUpMove;
		}
		return null;
	}

	public String diagonalRightDownMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0] - 1;
			tempAxis[1] = availableAxis[1] - 1;
			String diagonalRightDownMove = board.returnSportOnBoard(tempAxis);
			return diagonalRightDownMove;
		}
		return null;
	}

	public String diagonalLeftUpMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0] + 1;
			tempAxis[1] = availableAxis[1] + 1;
			String diagonalLeftUpMove = board.returnSportOnBoard(tempAxis);
			return diagonalLeftUpMove;
		}
		return null;
	}

	public String diagonalLeftDownMove(int[] availableAxis) {
		if(null != availableAxis) {
			int[] tempAxis = new int[2];
			tempAxis[0] = availableAxis[0] - 1;
			tempAxis[1] = availableAxis[1] + 1;
			String diagonalLeftDownMove = board.returnSportOnBoard(tempAxis);
			return diagonalLeftDownMove;
		}
		return "";
	}
	
}
