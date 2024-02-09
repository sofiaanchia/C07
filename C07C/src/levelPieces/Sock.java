package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

// Sock class representing a game piece
public class Sock extends GamePiece implements Moveable {

    // Constructor for Sock class
    public Sock() {
        super('S', "Sock", 20);
        // Uncomment if 'addMovingPiece' method exists in LevelSetup
        // addMovingPiece(this);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // Check if player is at the same location as the sock
        if (playerLocation == super.getLocation()) {
            return InteractionResult.GET_POINT;
        }
        // If not, return InteractionResult.NONE
        return InteractionResult.NONE;
    }

    // Default draw method inherited from GamePiece

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        gameBoard[getLocation()] = null;
    	int rand = (int) (Math.random() * gameBoard.length);
        
        // Find a random empty space in the gameBoard
        while (gameBoard[rand] != null) {
            rand = (int) (Math.random() * gameBoard.length);
        }

        // Set the location of the sock to the random empty space
        this.setLocation(rand);
        gameBoard[this.getLocation()] = this;
    }
}
