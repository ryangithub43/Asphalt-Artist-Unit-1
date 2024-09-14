import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  public void takeAllPaint() {

    while (isOnBucket()) {
      takePaint();
    }
  }

  public void paintToEmpty (String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }   
  }
  
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  public void paintDonut(String color) {
    while (hasPaint()) {
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
    }
  }
// Makes the painter do a 180 degree turn
  public void turnAround() {
    turnRight();
    turnRight();
  }
}
