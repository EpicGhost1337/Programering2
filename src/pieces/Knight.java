package pieces;

import Schack.ChessBoard;
import Schack.Square;
import javafx.scene.paint.Color;

public class Knight extends Piece {
	
	public boolean hasMove;
	public Knight(Color c){
		super(c);
	}

	@Override
	public void showMove(int x, int y) {

	//Nord�st 
		if(x + 1 < 8 && y + 2 < 8){
			Square s1 = ChessBoard.getSquare(x + 1, y + 2);
			s1.Mark(getColor());
		}
	//Norrv�st		
		    if(x + 2 < 8 && y + 1 < 8){
				Square s1 = ChessBoard.getSquare(x + 2, y + 1);
				s1.Mark(getColor());
		}
		 //�stsyd
			if (x + 2 < 8 && y - 1 >= 0) {
				Square s1 = ChessBoard.getSquare(x + 2, y - 1);
				s1.moveMark();
			}
			//Syd�st
			if (x + 1 < 8 && y - 2 >= 0) {
				Square s1 = ChessBoard.getSquare(x + 1, y - 2);
				s1.moveMark();
			}
			//Sydv�st
			if(x - 1 >= 0 && y - 2 >= 0){
				Square s1 = ChessBoard.getSquare(x - 1, y - 2);
				s1.moveMark();
			}
			
			// V�stsyd
			if (x - 2 >= 0 && y - 1 >= 0) {
				Square s1 = ChessBoard.getSquare(x - 2, y - 1);
				s1.moveMark();
			}

			// V�stnorr
			if (x - 2 >= 0 && y + 1 < 8) {
				Square s1 = ChessBoard.getSquare(x - 2, y + 1);
				s1.moveMark();
			}

			// Nordv�st
			if (x - 1 >= 0 && y + 2 < 8) {
				Square s1 = ChessBoard.getSquare(x - 1, y + 2);
				s1.moveMark();
			}
		}
	

	@Override
	public void move() {
		
	}
	

}
