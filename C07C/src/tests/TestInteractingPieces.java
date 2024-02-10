package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Flower;
import levelPieces.Sock;

public class TestInteractingPieces {
    public void testSockPoints() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Sock sock = new Sock();
	    gameBoard[sock.getLocation()] = sock;
	    assertEquals(InteractionResult.GET_POINT, sock.interact(gameBoard, sock.getLocation()));
	}
	
	public void testFlowerKills() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Flower flower = new Flower();
	    gameBoard[flower.getLocation()] = flower;
	    assertEquals(InteractionResult.KILL, flower.interact(gameBoard, flower.getLocation()));
	}
}
