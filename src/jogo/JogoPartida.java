package jogo;

import boardGame.Board;

public class JogoPartida {
	private Board board;
	
	public JogoPartida() {
		board = new Board(8,8);
		
	}
	public JogoPiece[][] getPieces(){
		JogoPiece[][] mat = new JogoPiece[board.getRows()][board.getColumns()];
		for(int i  = 0; i < board.getRows(); i ++){
			for(int j = 0 ; j < board.getColumns(); j++) {
				mat[i][j] = (JogoPiece) board.piece(i,j);
			}
		}
		return mat;
		
	}

	

}
