/**
*
*   // 6 Robots perform 6 tasks
*
* @author <Manu Gualandri>  // replace <...> with your name
* @version <12/11/2014> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06 {

     public static void main(String[] args) {
     String filename = JOptionPane.showInputDialog("What robot map?");  	
     Display.openWorld("maps/tasks" + filename + ".map");
     Display.setSize(10, 10);
     Display.setSpeed(8);
     Robot manu1 = new Robot();
     Robot manu2 = new Robot(1, 2, Display.EAST, Display.INFINITY);
     Robot manu3 = new Robot(1, 3, Display.EAST, Display.INFINITY);
     Robot manu4 = new Robot(1, 4, Display.EAST, Display.INFINITY);
     Robot manu5 = new Robot(1, 5, Display.EAST, Display.INFINITY);
     Robot manu6 = new Robot(1, 6, Display.EAST, Display.INFINITY); 
     
     while(manu1.nextToABeeper()) {
         manu1.move();
     }
     while(!manu2.nextToABeeper()) {
         manu2.move();
     }
     while(manu3.frontIsClear()) {
         manu3.move();
     }
    
    if(manu4.nextToABeeper()) {
             manu4.pickBeeper();
         }
     while(manu4.frontIsClear()) {       
        manu4.move();
         if(manu4.nextToABeeper()) {
             manu4.pickBeeper();
         }
     } 
    
    while(manu5.nextToABeeper()) {
             manu5.pickBeeper();
         }
     while(manu5.frontIsClear()) {       
        manu5.move();
         while(manu5.nextToABeeper()) {
             manu5.pickBeeper();
         }
     } 

     while(manu6.nextToABeeper()) {  
         manu6.move();
         }
     manu6.move();
     while(manu6.nextToABeeper()) {
         manu6.move();
         }
  
}
}

