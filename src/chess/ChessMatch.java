package chess;


import boardgame.Board;

public class ChessMatch {
	
	private Board board;

	public ChessMatch( ) {
		board = new Board(8, 8);
	}
	
	
	public ChessPiece[][] getPieces() {
		
		ChessPiece[][] mat = new ChessPiece[board.getRown()][board.getColumns()];
		for (int i=0; i<board.getRown(); i++) {
			for (int j=0; j<board.getColumns();j++ ) {
				mat[i][j] = (ChessPiece) board.piece( i, j);
			}
		}
		
		return mat;	
		
	}


}
