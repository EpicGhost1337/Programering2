package Schack;

import java.util.ArrayList;

import Schack.Square;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

public class ChessBoard extends Group {
	
	public static ArrayList<ArrayList<Square>>all_squares = new ArrayList<ArrayList<Square>>();
	
	public ChessBoard(){
		for(int i = 0; i < 8; i++ ){
			ArrayList<Square> Square_row = new ArrayList<Square>();
			for(int j = 0; j < 8; j++){
				
				Color c = Color.BROWN;
				if ((i + j) % 2 == 0) {
					c = Color.WHITE;
				}
				
				Square s = new Square(c);
				s.setTranslateX(j*Square.SIZE);
				s.setTranslateY(i*Square.SIZE);
	
				this.getChildren().add(s);
				Square_row.add(s);
				
				//Bönder
				if(i == 1){
					s.addPiece(new Pawn(Color.BLACK));
				}
				if(i == 6){
					s.addPiece(new Pawn(Color.WHITE));
				}
				//Präst
				if(i == 0 &&(j == 2 || j == 5)){
					s.addPiece(new Bishop(Color.BLACK));
				}
				if(i == 7 &&(j == 2 || j == 5)){
					s.addPiece(new Bishop(Color.WHITE));
				}
				//Löpare
				if(i == 0 &&(j == 1 || j == 6)){
					s.addPiece(new Knight(Color.BLACK));
				}
				if(i == 7 &&(j == 1 || j == 6)){
					s.addPiece(new Knight(Color.WHITE));
				}
				//Torn
				if(i == 0 &&(j == 0 || j == 7)){
					s.addPiece(new Rook(Color.BLACK));
				}
				if(i == 7 &&(j == 0 || j == 7)){
					s.addPiece(new Rook(Color.WHITE));
				}
				//Kung
				if(i == 0 &&(j == 4)){
					s.addPiece(new King(Color.BLACK));
				}
				if(i == 7 &&(j == 4)){
					s.addPiece(new King(Color.WHITE));
				}
				//Drottning
				if(i == 0 &&(j == 3)){
					s.addPiece(new Queen(Color.BLACK));
				}
				if(i == 7 &&(j == 3)){
					s.addPiece(new Queen(Color.WHITE));
				}
			
			}
			all_squares.add(Square_row);
		} 
	}
	
	public static Square getSquare(int x, int y){
		return all_squares.get(y).get(x);
	}

}
//Made By EpicGhost1337 //