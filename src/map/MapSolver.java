package map;

import blocks.Block;
import blocks.ClosedBlock;
import blocks.GoalBlock;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MapSolver {
	
    static Map map;
    static boolean solution = false;
    static int dir = 1;
    static int steps = 0;
    

    
	public MapSolver(Map map){
		
		this.map = map;
		int StartX = map.getStartX();
		int StartY = map.getStartY();
		
		Solver(StartX, StartY, 1); // Upp
		Solver(StartX, StartY, 2); // Höger
		Solver(StartX, StartY, 3); // Ner
		Solver(StartX, StartY, 4); // Vänster
	}
	
	public static void Solver(int x, int y, int dir ){
		
		Block b = map.getBlock(x,y);
		
		if(b == null || b instanceof ClosedBlock ){
			return;
		}
		
		if(solution == true){
			return;
		}
	
	 if(b instanceof GoalBlock){
		 System.out.println(steps); // Printa ut stegen
    	 solution = true;
    	 return;
     }
	 steps++;
	 
     Circle cir = new Circle(Block.SIZE / 2, Block.SIZE / 2, Block.SIZE / 3, Color.YELLOW); // Skapa cirkel 
		map.getBlock(x, y).getChildren().add(cir);
        
	 if(dir == 1){ //Upp 
    	 Solver(x , y - 1, 1);
    	 Solver(x + 1, y, 2);
    	 Solver(x - 1, y, 4);
     }
	 if(dir == 2){ //Höger
		 Solver(x, y - 1, 1);
		 Solver(x + 1, y, 2);
		 Solver(x, y + 1, 3);
	
	 }
	 if(dir == 3){//Ner
		 Solver(x + 1, y, 2);
	     Solver(x, y + 1, 3);
         Solver(x - 1, y, 4);
	 }
	 if(dir == 4){ //Vänster
		Solver(x, y - 1, 1);
		Solver(x, y + 1, 3);
	    Solver(x - 1, y, 4);
	 }
	 
	 if (!solution) { 
	     b.getChildren().remove(cir);
	     steps--;
      }
	}	
}





