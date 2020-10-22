import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacMan extends Person
{
    private static final int INITIAL_LIFES = 3;
    private static final int INITIAL_POINTS = 0;
    private static final int ITERATIONS_TO_CHANGE_SPRITE = 15;
    
    private int lifes;
    private int points;
    
    private int movementInX;
    private int movementInY;
    
    public PacMan()
    {
        sprites = new GreenfootImage[2];
        sprites[0] = new GreenfootImage("images/pacman-open.png");
        sprites[1] = new GreenfootImage("images/pacman-close.png");
        
        lifes = INITIAL_LIFES;
        points = INITIAL_POINTS;
        direction = CharacterDirection.RIGHT;
    }
    /**
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(delaySprite >= ITERATIONS_TO_CHANGE_SPRITE)
        {
           currentSprite = (++currentSprite) % sprites.length;
           setImage(sprites[currentSprite]);

           delaySprite = 0;
        }
        
        delaySprite++;
        
        setLocation(getX() + movementInX, getY() + movementInY);
        
        String lastKeyPressed = Greenfoot.getKey();
        if(lastKeyPressed != null)
        {
          
            getWorld().showText(lastKeyPressed, 100, 10);
            
            movePacman(lastKeyPressed);
        }
        
        
        checkCollisions();
        eat();
        
    }    
    
    void movePacman(String keyPressed)
    {
        movementInY = 0;
        movementInX = 0;
        switch(keyPressed)
        {
            case "up":
                movementInY = -1;
                direction = CharacterDirection.UP;
                turnTowards(getX(), 0);
            break;
            case "down":
                movementInY = 1;
                direction = CharacterDirection.DOWN;
                turnTowards(getX(), getWorld().getHeight());
            break;
            case "left":
                direction = CharacterDirection.LEFT;
                turnTowards(0, getY());
                movementInX = -1;
            break;
            case "right":
                direction = CharacterDirection.RIGHT;
                turnTowards(getWorld().getWidth(), getY());
                movementInX = 1;
            break;
        }
    }
    
    void checkCollisions()
    {
        
        Item point = null;
        
        Wall wall = null; 
        switch(direction)
        {
            case UP:
                wall = (Wall)getOneObjectAtOffset(0, -20, Wall.class);
            break;
            case DOWN:
                wall = (Wall)getOneObjectAtOffset(0, 20, Wall.class);
            break;
            case RIGHT:
                wall = (Wall)getOneObjectAtOffset(20, 0, Wall.class);
            break;
            case LEFT:
                wall = (Wall)getOneObjectAtOffset(-20, 0, Wall.class);
            break;
        }
        
        if(wall != null)
        {
            movementInY = 0;
            movementInX = 0;
        }
    }
    
    void eat(){
    SmallPoint point=null;
    PowerPoint powerpoint= null;
    
         switch(direction)
        {
            case UP:
                point = (SmallPoint)getOneObjectAtOffset(0, -20, SmallPoint.class);
                powerpoint= (PowerPoint)getOneObjectAtOffset(0,-20, PowerPoint.class);
            break;
            case DOWN:
                point = (SmallPoint)getOneObjectAtOffset(0, 20, SmallPoint.class);
                powerpoint= (PowerPoint)getOneObjectAtOffset(0,20, PowerPoint.class);
            break;
            case RIGHT:
                point = (SmallPoint)getOneObjectAtOffset(20, 0, SmallPoint.class);
                powerpoint= (PowerPoint)getOneObjectAtOffset(20,0, PowerPoint.class);
            break;
            case LEFT:
                point = (SmallPoint)getOneObjectAtOffset(-20, 0, SmallPoint.class);
                powerpoint= (PowerPoint)getOneObjectAtOffset(-20,0, PowerPoint.class);
            break;
        }
        
        if(point != null)
        {
            points=points +1;
            World mundo;
            mundo= getWorld();
           
             mundo.removeObject​(point);
             getWorld().showText("Points :"+ points , 400, 10);
        }
         if(powerpoint != null)
        {
            points=points + 5;
            World mundo;
            mundo= getWorld();
             mundo.removeObject​(powerpoint);
             getWorld().showText("Points :"+ points , 400, 10);
        }
    
    }
        
        
   
}
