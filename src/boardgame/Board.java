package boardgame;

public class Board {
	
	private Integer rown;
	private Integer columns;
	private Piece[][] pieces;
	
	
	public Board(Integer rown, Integer columns) {
		this.rown = rown;
		this.columns = columns;
		pieces = new Piece[rown][columns];
		
	}


	public Integer getRown() {
		return rown;
	}


	public void setRown(Integer rown) {
		this.rown = rown;
	}


	public Integer getColumns() {
		return columns;
	}


	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
}
