import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {


// Instantiate Asphalt Artist 
    
    AsphaltArtist p = new AsphaltArtist();

// Instantiate Background Artist

    BackgroundArtist b = new BackgroundArtist();

// b paints the background white

   b.paintBackground("white", 16);
   b.turnAround();
    
// p paints a brown square

   p.startBlock();
   p.createBlock("brown", 13);
   p.createGrass("green", 14);
    
// Final touches
    
   b.paintLine("white", 2);
    
  }
}
