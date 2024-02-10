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
    @Test 
	public void testSockPoints() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Sock sock = new Sock();
	    gameBoard[sock.getLocation()] = sock;
	    assertEquals(InteractionResult.GET_POINT, sock.interact(gameBoard, sock.getLocation()));
	}
    @Test 
	public void testFlowerKills() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Flower flower = new Flower();
	    gameBoard[flower.getLocation()] = flower;
	    assertEquals(InteractionResult.KILL, flower.interact(gameBoard, flower.getLocation()+3));
	}
    @Test 
	public void testGumballGrantsPointOnInteraction() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Gumball gumball = new Gumball();
	    gameBoard[gumball.getLocation()] = gumball;
	    assertEquals(InteractionResult.ADVANCE, gumball.interact(gameBoard, gumball.getLocation()));
	}
    @Test 
	public void testMonkeyHits() {
	    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
	    Monkey monkey = new Monkey();
	    gameBoard[monkey.getLocation()] = monkey;
	    assertEquals(InteractionResult.HIT, monkey.interact(gameBoard, monkey.getLocation()));
	}
}
