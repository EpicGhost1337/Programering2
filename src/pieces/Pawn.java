package pieces;

import Schack.ChessBoard;
import Schack.Square;
import javafx.scene.paint.Color;

public class Pawn extends Piece {

	private boolean hasMove = false;
	
	public Pawn(Color c) {
		super(c);
	}

	@Override
	public void showMove(int x, int y) {
	 if(this.getColor() == Color.WHITE){
		 Square s1 = ChessBoard.getSquare(x, y - 1);
		if(!s1.hasPiece()){
			s1.moveMark();
		}
		else{
			return;
		}
		
		if(!hasMove){
			 Square s2 = ChessBoard.getSquare(x, y - 2);
			 if(!s2.hasPiece()){
					s2.moveMark();
				}
		}
	} else{
		    Square s1 = ChessBoard.getSquare(x, y + 1);
			if(!s1.hasPiece()){
				s1.moveMark();
			    } 
			else{
				return;
			}
			
			Square s2 = ChessBoard.getSquare(x, y + 2);
			if(!s2.hasPiece()){
				s2.moveMark();
			    } 
			
	}
	 
	
	}
	 public void move(){
		 hasMove = true;
	 }
}
