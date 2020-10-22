/**
 * Write a description of class OrangePhantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class OrangePhantom extends Phantom
{
        private static final GreenfootImage image = new GreenfootImage("images/orange-phantom-left.png");
    
    private boolean colision;
    private int movePhantom;
    private int movementInX;
    private int movementInY;
    
      public OrangePhantom()
    {
       setImage(image);
           
    }
    
        public void act() 
    {
        
      setLocation(getX() + movementInX, getY() + movementInY);
      
       
      
             
       if(colision==true){
           
       movePhantom = Greenfoot.getRandomNumber(3);
        
             checkCollisions();
             
       } 
       
       
       movetPhantom(movePhantom);
             checkCollisions();
        
             
    } 
    
        void movetPhantom(int movePhantom)
    {
        movementInY = 0;
        movementInX = 0;
        switch(movePhantom)
        {
            case 3:
                movementInY = -1;
                direction = CharacterDirection.UP;
              
            break;
            case 2:
                movementInY = 1;
                direction = CharacterDirection.DOWN;
               // turnTowards(getX(), getWorld().getHeight());
            break;
            case 1:
                direction = CharacterDirection.LEFT;
                
                movementInX = -1;
            break;
            case 0:
                direction = CharacterDirection.RIGHT;
                //turnTowards(getWorld().getWidth(), getY());
                movementInX = 1;
            break;
        }
    }
    
        boolean checkCollisions()
    {
        
       
        Wall walls = null; 
        
        switch(direction)
        {
            case UP:
                walls = (Wall)getOneObjectAtOffset(0, -40, Wall.class);
                
                
            break;
            case DOWN:
                walls = (Wall)getOneObjectAtOffset(0, 40, Wall.class);
               
                
            break;
            case RIGHT:
                walls = (Wall)getOneObjectAtOffset(40, 0, Wall.class);
              
            break;
            case LEFT:
                walls = (Wall)getOneObjectAtOffset(-40, 0, Wall.class);
               
                
            break;
        }
        
        if(walls != null)
        {
           return colision=true;
        }
        return colision=false;
    }
}
