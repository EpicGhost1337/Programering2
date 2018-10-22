package Schack;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class ChessBoard extends Group {
	
	public ChessBoard(){
		for(int i = 0; i < 8; i++ ){
			for(int j = 0; i < 8; j++){
				Square s = new Square(Color.WHITE);
				
				if((i+j)%2 == 0){
					Square B = new Square(Color.BROWN);
					B.setTranslateX(i*Square.SIZE);
					B.setTranslateY(j*Square.SIZE);
					this.getChildren().add(B);
				}
				else{
					Square W = new Square(Color.WHITE);
					W.setTranslateX(j*Square.SIZE);
					W.setTranslateX(i*Square.SIZE);
					this.getChildren().add(s);
				}
			}
		} 
	}

}
