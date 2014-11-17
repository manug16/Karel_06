import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab06Extension {
     
     public static void main(String[] args) {  	
     Display.openWorld("maps/CustomLab06.map");
     Display.setSize(11, 11);
     Display.setSpeed(8);
     Robot manu7 = new Robot();
     Robot manu8 = new Robot(1, 2, Display.EAST, 10);
     Robot manu8task = new Robot(5, 2, Display.EAST, Display.INFINITY);
     Robot manu9 = new Robot(1, 3, Display.EAST, Display.INFINITY);
     Robot manu10 = new Robot(1, 4, Display.EAST, Display.INFINITY);
     Robot manu11 = new Robot(1, 5, Display.EAST, Display.INFINITY);
     Robot manu12 = new Robot(1, 6, Display.EAST, Display.INFINITY); 
     
     int count = 0;
     while(manu7.frontIsClear() && !manu7.nextToABeeper()) {		
     manu7.move();		
     count++;
     }
     System.out.println("Number of steps is " + count + ".");
     
	  while(!manu8.nextToARobot ()) {		
     manu8.move();	
     }
     while(manu8.hasBeepers ()) {		
     manu8.putBeeper();		
     } 
     
     for(int n = 5; n > 0; n--) {
        for(int beepers = 4; beepers > 0; beepers--) {
            manu9.putBeeper();
        }
        manu9.move();
     }       
     
     while(manu10.frontIsClear()) {
         while(manu10.nextToABeeper()) {		
         manu10.move();	
         }				    
         manu10.putBeeper();
     }

     while(!manu11.rightIsClear()) {		
         manu11.putBeeper();
         manu11.move();
     }
  
     while(manu12.rightIsClear() || !manu12.nextToABeeper()) {	
     manu12.move();
     }
}
}



























