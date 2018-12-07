package pieces;

import Schack.ChessBoard;
import Schack.Square;
import javafx.scene.paint.Color;

public class Bishop extends Piece {
	
	public Bishop(Color c) {
		super(c);
	}

	@Override
	public void showMove(int x, int y) {
		
		        // Nordöst
				for (int i = 1; i < 8; i++) {
					if (x - i < 0 || y - i < 0) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x - i, y - i);
					if (!s1.hasPiece()) {
						s1.Mark(getColor());
					} else {
						s1.Mark(getColor());
						break;
					}
				}

				// Nordväst
				for (int i = 1; i < 8; i++) {
					if (x + i > 7 || y - i < 0) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x + i, y - i);
					if (!s1.hasPiece()) {
						s1.Mark(getColor());
					} else {
						s1.Mark(getColor());
						break;
					}
				}

				// Sydväst
				for (int i = 1; i < 8; i++) {
					if (x + i > 7 || y + i > 7) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x + i, y + i);
					if (!s1.hasPiece()) {
						s1.Mark(getColor());
					} else {
						s1.Mark(getColor());
						break;
					}
				}

				// Sydöst
				for (int i = 1; i < 8; i++) {
					if (x - i < 0 || y + i > 7) {
						break;
					}
					Square s1 = ChessBoard.getSquare(x - i, y + i);
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
		// TODO Auto-generated method stub
		
	}

}
