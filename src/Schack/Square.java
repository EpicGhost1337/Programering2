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
				
				if(marked.contains(this)){ // Kollar om det finns ruta
					
					 if(this.hasPiece()){
	                        this.getChildren().remove(this.piece);
	                        this.piece = null;
	                    }

					Piece p = active.piece;
					active.piece = null;
					active.makeInactive();
					this.addPiece(p);
					p.move();
					return;
					
				}
				    if (!hasPiece()) {
					    return;
			  	}
					if (hasPiece()) {
						makeActive();	
						@SuppressWarnings("unused")
						int getX = getX();
						@SuppressWarnings("unused")
						int getY = getY();
						}else{
							if(active != null){
							active.makeInactive();
							}
							moveMark();
						}
					
			});
		}
	
		@SuppressWarnings("unused")
		private boolean hasMoveMark() {
			return this.getChildren().get(this.getChildren().size() - 1) instanceof Circle;

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

		public void attackMark() {
			Circle cir = new Circle(Square.SIZE/2,Square.SIZE/2,Square.SIZE/5,Color.RED);
        	this.getChildren().add(cir);
        	marked.add(this);
			
		}
		public void Mark(Color c) {
			if(!this.hasPiece()){
				moveMark();
			}
			else{
				if(this.piece.getColor() != c){
					attackMark();
				}
			}
		}

		public Color getPieceColor() {
			return this.piece.getColor();
		}
		
		public Boolean turn(int i) {
			boolean whiteTurn = true;
			if (i % 2 == 0) {
				return whiteTurn = false;
			} else {
				return whiteTurn;
			}
		}

		

}
