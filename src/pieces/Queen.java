package pieces;

import Schack.ChessBoard;
import Schack.Square;
import javafx.scene.paint.Color;

public class Queen extends Piece {
	
	public Queen(Color c) {
		super(c);
	}

	@Override
	public void showMove(int x, int y) {
		
		// Left
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

		// Right
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

		// Up
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

		// Down
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

		// Up Left
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

		// Up Right
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

		// Down Left
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

		// Down Right
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
