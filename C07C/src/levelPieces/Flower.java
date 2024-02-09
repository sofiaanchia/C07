package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Flower extends GamePiece implements Drawable {

    public Flower() {
        super('F', "Flower", 0);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
    	int currentSpace = super.getLocation();
    	if(playerLocation == currentSpace + 3) {
    		return InteractionResult.KILL;
    	}
    	else if (playerLocation == currentSpace - 3) {
    		return InteractionResult.KILL;
    	}
    	else {
    		return InteractionResult.NONE; // nothing happens if interaction
    	}
    	
    }

	@Override 
	public void move(Drawable[] gameBoard, int playerLocation) {
		int rand = (int) (Math.random() * 21);
        
        // Find a random empty space in the gameBoard
        while (gameBoard[rand] != null) {
            rand = (int) (Math.random() * 21);
        }

        // Set the location of the sock to the random empty space
        this.setLocation(rand);
	}

    // Default draw method inherited from GamePiece
}
