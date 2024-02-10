package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import levelPieces.Gumball;

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
}
