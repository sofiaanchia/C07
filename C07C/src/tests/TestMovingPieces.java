package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.Gumball;
import levelPieces.Sock;

public class TestMovingPieces {
    public void testGumballMovesRight() {
        // Initialize the game board
        Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Gumball gumball = new Gumball();
        // Initial position of the Gumball
        int initialPosition = 5; // Choose an arbitrary position that's not at the edge
        gumball.setLocation(initialPosition);
        gameBoard[initialPosition] = gumball;
        
        // Simulate the Gumball movement
        gumball.move(gameBoard, -1); // Assuming -1 signifies no player interaction here or a dummy value
        
        // Assert that the Gumball has moved to the right
        assertNull("Gumball did not vacate the initial position.", gameBoard[initialPosition]);
        assertNotNull("Gumball did not move to the right.", gameBoard[initialPosition + 1]);
        assertEquals("Gumball is not at the expected right position.", gumball, gameBoard[initialPosition + 1]);
    }
    
    public void testRandomMovement() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Sock sock = new Sock();
	    int initialLocation = sock.getLocation();
	    gameBoard[initialLocation] = sock;
	    
	    // Move the sock a significant number of times to ensure randomness
	    for (int i = 0; i < 100; i++) {
	        sock.move(gameBoard, -1);
	        gameBoard[sock.getLocation()] = sock;
	        gameBoard[initialLocation] = null;
	        initialLocation = sock.getLocation();
	    }
	    
	    assertNotEquals(initialLocation, sock.getLocation());
	}
    
}
