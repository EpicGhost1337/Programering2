package Schack;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Group {

		public static double SIZE = 50;

		public Square(Color c){
		    Rectangle r = new Rectangle(SIZE,SIZE);
			r.setFill(c);
			this.getChildren().add(r);
		}

}
