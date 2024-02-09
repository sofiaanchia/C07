package levelPieces;

import java.util.ArrayList;
import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
    private Drawable[] board = new Drawable[21];
    private ArrayList<Moveable> movingPieces;
    private ArrayList<GamePiece> interactingPieces;
    private int playerStartLoc = 11;

    public void createLevel(int levelNum) {
    	board = new Drawable[21];
        movingPieces = new ArrayList<Moveable>();
        interactingPieces = new ArrayList<GamePiece>(); // Initialize interactingPieces

        if (levelNum == 1) {
            createLevel1();
        }
        else {
            createLevel2();
        }
    }

    public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}

	public Drawable[] getBoard() {
        return board;
    }

    public int getPlayerStartLoc() {
        return playerStartLoc;
    }

    public ArrayList<Moveable> getMovingPieces() {
        return movingPieces;
    }

    public void addMovingPiece(Moveable newMovingPiece) {
        movingPieces.add(newMovingPiece);
    }

    public void addInteractingPiece(GamePiece newInteractingPiece) {
        interactingPieces.add(newInteractingPiece);
    }
    

    private void createLevel1() {
    	GamePiece flower = new Flower();
        Moveable sock = new Sock();
        Moveable monkey = new Monkey();
        Drawable bucket = new Bucket();
        Moveable gumball = new Gumball();
        
        movingPieces.add(sock); // Added sock to movingPieces list
        movingPieces.add(monkey);
        movingPieces.add(gumball);
        interactingPieces.add(flower);
        interactingPieces.add((GamePiece)sock);
        interactingPieces.add((GamePiece)monkey);
        interactingPieces.add((GamePiece)gumball);
        
        board[flower.getLocation()] = flower;
        board[((GamePiece)sock).getLocation()] = (GamePiece) sock;
        board[((GamePiece)monkey).getLocation()] = (GamePiece) monkey;
        board[((GamePiece)gumball).getLocation()] = (GamePiece) gumball;
        board[12] = bucket;
    }

    private void createLevel2() {
    	GamePiece flower = new Flower();
        Moveable sock = new Sock();
        Moveable monkey = new Monkey();
        Drawable bucket = new Bucket();
        Moveable gumball = new Gumball();
        
        movingPieces.add(sock); // Added sock to movingPieces list
        movingPieces.add(monkey);
        movingPieces.add(gumball);
        interactingPieces.add(flower);
        interactingPieces.add((GamePiece)sock);
        interactingPieces.add((GamePiece)monkey);
        interactingPieces.add((GamePiece)gumball);
        
        board[flower.getLocation()] = flower;
        board[((GamePiece)sock).getLocation()] = (GamePiece) sock;
        board[((GamePiece)monkey).getLocation()] = (GamePiece) monkey;
        board[((GamePiece)gumball).getLocation()] = (GamePiece) gumball;
        board[20] = bucket;
    }
}
