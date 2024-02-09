package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

// Bucket class representing a game piece
public class Bucket implements Drawable {
	protected char symbol = 'B';
	private String label = "Bucket";
	private int location = 1;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(symbol);
	}
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		
	}
}
