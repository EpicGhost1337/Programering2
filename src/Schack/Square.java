package Schack;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import pieces.Piece;

public class Square extends Group {

		public static double SIZE = 80;
		private Piece piece;
		private Color originalColor;
		private Rectangle r;

		public Square(Color c){
		    Rectangle r = new Rectangle(SIZE,SIZE);
			r.setFill(c);
			this.getChildren().add(r);
			
			this.setOnMouseClicked(event -> {

				// EXEMPEL:
				if (hasPiece()) {
					if (!this.getBackground().getFill().equals(originalColor)) {
						this.getBackground().setFill(originalColor);
					} else {
						this.getBackground().setFill(Color.RED);
					}
				}

			});
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

}
