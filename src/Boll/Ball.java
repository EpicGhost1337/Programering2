package Boll;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Circle {
	
	public Ball(double radius,Color color){
		super(radius,color);
		setTranslateX(radius);
		setTranslateY(radius);
	}

}
