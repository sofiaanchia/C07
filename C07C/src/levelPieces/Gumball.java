package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Gumball extends GamePiece implements Moveable {

    public Gumball() {
        // Call the constructor of the parent class (GamePiece)
        super('G', "Gumball", 7);
        // Uncomment the following line if there is an 'addMovingPieces' method
        // addMovingPieces(this);
    }

    // Override the interact method from the Movable interface
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // Check if the player is at the same location as the marble
        if (playerLocation == super.getLocation()) {
            return InteractionResult.ADVANCE;
        }
        // If not, return InteractionResult.NONE
        return InteractionResult.NONE;
    }

    // Override the move method from the Movable interface
    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
    	
        // Get the current location of the marble
        gameBoard[getLocation()] = null;
        int currentSpace = getLocation();
        // Move the marble while there is space in the gameBoard and the next space is not occupied
        
        currentSpace = (currentSpace + 1) % gameBoard.length;
        
        // Set the new location of the marble
        this.setLocation(currentSpace);
        gameBoard[this.getLocation()] = this;
    }
}