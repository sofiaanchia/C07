package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Flower;
import levelPieces.Gumball;
import levelPieces.Monkey;
import levelPieces.Sock;

public class TestInteractingPieces {
	/*
	 * Tests if sock adds a point if the player is on the same location as it
	 */
    @Test 
	public void testSockPoints() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Sock sock = new Sock();
	    gameBoard[sock.getLocation()] = sock;
	    assertEquals(InteractionResult.GET_POINT, sock.interact(gameBoard, sock.getLocation()));
	}
    /*
	 * Tests if flower kills the player if the player is +/- 3 spots away from it
	 */
    @Test 
	public void testFlowerKills() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Flower flower = new Flower();
	    gameBoard[flower.getLocation()] = flower;
	    assertEquals(InteractionResult.KILL, flower.interact(gameBoard, flower.getLocation()+3));
	}
    /*
     * Tests if the gumball grants an advance on interaction
     */
    @Test 
	public void testGumballGrantsAdvanceOnInteraction() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Gumball gumball = new Gumball();
	    gameBoard[gumball.getLocation()] = gumball;
	    assertEquals(InteractionResult.ADVANCE, gumball.interact(gameBoard, gumball.getLocation()));
	}
    /*
     * Test if monkey hits the player if they stand on the same spot
     */
    @Test 
	public void testMonkeyHits() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Monkey monkey = new Monkey();
	    gameBoard[monkey.getLocation()] = monkey;
	    assertEquals(InteractionResult.HIT, monkey.interact(gameBoard, monkey.getLocation()));
	}
}
