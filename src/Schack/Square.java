package Schack;



import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import pieces.Piece;

public class Square extends Group {
	
	    public static ArrayList<Square> marked = new ArrayList<Square>();
		public static final double SIZE = 80;
		private Piece piece;
		private Color originalColor;
		public static Square active;
		private Rectangle r;

		
		public Square(Color c){	
			originalColor = c;
		    r = new Rectangle(SIZE,SIZE,c);
			this.getChildren().add(r);
			
			this.setOnMouseClicked(event -> {
				
				if(marked.contains(this)){ // Kollar om det finn ruta
					Piece p = active.piece;
					active.makeInactive();
					this.addPiece(p);
					p.move();
					return;
					
				}
                //Example
				if (hasPiece()) {
					//if (!this.getBackground().getFill().equals(originalColor)) {
						//this.getBackground().setFill(originalColor);
					makeActive();	
					}else{
						if(active != null){
						active.makeInactive();
						}
						moveMark();
					}
					
				

			});
		}
		
		public void makeInactive(){ 
			this.getBackground().setFill(originalColor); // rutan blir orginalfärgen 
			active = null; // Gör DENNA rutan inaktive 
			removeMoveMark();
		}
		
		public void makeActive(){
			if(active != null){ // Om det finns en ruta som är aktive 
				active.makeInactive(); //gör den inaktive
			}
			piece.showMove(getX(),getY());
			active = this; // Gör DENNA rutan aktive 
			this.getBackground().setFill(Color.RED); //rutan blir röd
		}
		
		public void addPiece(Piece p) {
			this.piece = p;
			this.getChildren().add(p);
		}

		public boolean hasPiece() {
			return this.piece != null;
		}

		public Rectangle getBackground() {
			return this.r;
		}
		
		public int getX(){
			int y = getY();
			for(int i = 0; i < 8; i++){
				if(ChessBoard.all_squares.get(y).get(i) == this){
					return i;
				}
			}
			return -1;
		}
        public int getY(){
			for(int i = 0; i < 8; i++){
				if(ChessBoard.all_squares.get(i).contains(this)){
					return i;
				}
			}
			return -1;
		}
        public void moveMark(){
        	Circle cir = new Circle(Square.SIZE/2,Square.SIZE/2,Square.SIZE/5,Color.LIGHTSEAGREEN);
        	this.getChildren().add(cir);
        	marked.add(this);
        }
        
        public static void removeMoveMark(){
        	for(Square square : marked){
        		square.getChildren().remove(square.getChildren().size()-1);
        	}
        	marked.clear();
        	
        }

}
