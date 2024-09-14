import org.code.neighborhood.*;

public class AsphaltArtist extends BackgroundArtist {

// Moves painter in the correct position to start creating the block.

  public void startBlock() {
    
      move();
      turnRight();
      move();
      turnLeft();
      System.out.println("Starting block!  ");
  }

// Creates a 14x14 block that is brown.
  
  public void createBlock(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();
      paintLine(color, size);
      turnToEast();
    } 
    turnLeft();
    paintLine(color, 14);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    
    turnRight();
    paintLine(color, 13);

    System.out.println("Finishing dirt base!  ");
  }

// Makes a green patch on top of the block.
  
  public void createGrass(String color, int size) {
    turnAround();

    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move(); 
    move(); 
    move();     
    
    turnLeft();
    paintLine(color, 14);
    turnToEast();
    move();
    paintLine(color, 14);

    turnToWest();

    paintPatches("green", 5); 
    turnToEast();
    move();
    paintPatches("green", 1);

    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();

    paintPatches("green", 1);
    
    
    System.out.println("Finishing the grass!  ");
  
  }
}
