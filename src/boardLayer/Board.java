package boardLayer;

public class Board {
	private int row;
	private int column;
	private Piece piece;
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Board() {
		
	}
	
	public Board(int row, int column, Piece piece) {
		this.row = row;
		this.column = column;
		this.piece = piece;
	}
	
	public Piece piece(int row, int columns) {
		return piece;
	}
	public Piece piece (Position position) {
		return piece;	
	}
	public void placePiece(Piece piece, Position position ) {
		
	}
	
	public Piece removePiece(Position position) {
		return piece;
		
	}
	
	public boolean positionExists(Position position) {
		return false;
	}
	
	public boolean thereIsAPiece(Position position) {
		return false;
	}
}
