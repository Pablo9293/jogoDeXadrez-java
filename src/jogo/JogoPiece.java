package jogo;

import boardGame.Board;
import boardGame.Piece;

public class JogoPiece extends Piece {

	private Color color;

	public JogoPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
