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
		if(this.getColor() == Color.WHITE){
			 Square s1 = ChessBoard.getSquare(x - 1, y - 2);
			if(!s1.hasPiece()){
				s1.moveMark();
			}
			else{
				return;
			}
			
			if(!hasMove){
				 Square s2 = ChessBoard.getSquare(x + 1, y - 2);
				 if(!s2.hasPiece()){
						s2.moveMark();
					}
			}
		} else{
			    Square s1 = ChessBoard.getSquare(x + 1, y + 2);
				if(!s1.hasPiece()){
					s1.moveMark();
				    } 
				else{
					return;
				}
				
				Square s2 = ChessBoard.getSquare(x - 1, y + 2);
				if(!s2.hasPiece()){
					s2.moveMark();
				    } 		
		        }
		 
		}

	@Override
	public void move() {
		hasMove = true;
		
	}
	

}
