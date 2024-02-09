package levelPieces;


import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;


public class Monkey extends GamePiece implements Moveable{

    public Monkey() {
        super('M', "Monkey", 13);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // Customize the interaction logic for Monkey if needed
    	if (playerLocation == super.getLocation()) {
            return InteractionResult.HIT;
        }
        // If not, return InteractionResult.NONE
        return InteractionResult.NONE;
    }

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int currentSpace = super.getLocation();
		
	    gameBoard[currentSpace] = null;
	    if (playerLocation > currentSpace && currentSpace < (gameBoard.length - 1) && gameBoard[currentSpace + 2] == null) {
	    	this.setLocation(currentSpace + 2);
	    }
	    else if (playerLocation < currentSpace && currentSpace > 2 && gameBoard[currentSpace - 2] == null) {
	    	this.setLocation(currentSpace - 2);
	    }
	    else {
	    	this.setLocation(currentSpace);
	    }
	    gameBoard[this.getLocation()] = this;
	}

    // Default draw method inherited from GamePiece
}
