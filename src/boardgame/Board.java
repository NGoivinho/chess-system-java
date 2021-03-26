package boardgame;

public class Board {
	
	private Integer rown;
	private Integer columns;
	private Piece[][] pieces;
	
	
	public Board(Integer rown, Integer columns) {
		
		if (rown < 1 || columns < 1) {
			throw new BoardException("Erro! É necessário ao menos 1 coluna e 1 linha.");
		}
		this.rown = rown;
		this.columns = columns;
		pieces = new Piece[rown][columns];
		
	}


	public Integer getRown() {
		return rown;
	}


	
	public Integer getColumns() {
		return columns;
	}


	public Piece piece(int rown, int column) {
		if (!positionExists(rown, column)) {
			throw new BoardException("Erro! Essa posição não existe.");
		}
		return pieces[rown][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Erro! Essa posição não existe.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("Erro! Já existe uma peça nessa posição.");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(int rown, int column) {
		return rown >= 0 && rown < this.rown && column >= 0 && column < this.columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists (position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Erro! Essa posição não existe.");
		}
		return piece(position) != null;
	}
	
}
