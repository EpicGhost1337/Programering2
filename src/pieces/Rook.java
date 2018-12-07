package pieces;

import Schack.ChessBoard;
import Schack.Square;
import javafx.scene.paint.Color;

public class Rook extends Piece {
	
	public boolean hasMove;
	public Rook(Color c) {
		super(c);
	}

	@Override
	public void showMove(int x, int y) {
		
		        // Vänster
				for (int i = 1; i < 8; i++) {
					if (x - i < 0) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x - i, y);
					if (!s1.hasPiece()) {
						s1.Mark(getColor());
					} else {
						s1.Mark(getColor());
						break;
					}
				}

				// Höger
				for (int i = 1; i < 8; i++) {
					if (x + i > 7) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x + i, y);
					if (!s1.hasPiece()) {
						s1.Mark(getColor());
					} else {
						s1.Mark(getColor());
						break;
					}
				}

				// Upp
				for (int i = 1; i < 8; i++) {
					if (y - i < 0) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x, y - i);
					if (!s1.hasPiece()) {
						s1.Mark(getColor());
					} else {
						s1.Mark(getColor());
						break;
					}
				}

				// Ner
				for (int i = 1; i < 8; i++) {
					if (y + i > 7) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x, y + i);
					if (!s1.hasPiece()) {
						s1.Mark(getColor());
					} else {
						s1.Mark(getColor());
						break;
					}
				}

	}

	@Override
	public void move() {
		hasMove = true;
	}

}
