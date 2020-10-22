/**
 * Write a description of class PacmanGoogleMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanGoogleMapLoader implements StaticMapLoader 
{
    public Map loadMap()
    {
        Map map = new Map();

        addWalls(map);

        addSmallItems(map);

        addPowerItems(map);
        
        map.addObject(new PacMan(), 100, 150);
        
        map.addObject(new BluePhantom(),400,450);
        
        map.addObject(new OrangePhantom(),50,550);
        
        map.addObject(new PinkPhantom(),700,450);
        
        map.addObject(new RedPhantom(),100,250);

        return map;
    }

    void addWalls(Map map)
    {
        map.addObject(new Wall(), 50, 50);
        map.addObject(new Wall(), 100, 50);
        map.addObject(new Wall(), 150, 50);
        map.addObject(new Wall(), 200, 50);
        map.addObject(new Wall(), 250, 50);
        map.addObject(new Wall(), 300, 50);
        map.addObject(new Wall(), 350, 50);
        map.addObject(new Wall(), 400, 50);
        map.addObject(new Wall(), 450, 50);
        
        map.addObject(new Wall(), 50, 50);
        map.addObject(new Wall(), 50, 100);
        map.addObject(new Wall(), 50, 150);
        map.addObject(new Wall(), 50, 200);
        map.addObject(new Wall(), 50, 250);
        
        
        map.addObject(new Wall(), 50, 550);
        map.addObject(new Wall(), 50, 600);
        map.addObject(new Wall(), 50, 650);
        map.addObject(new Wall(), 50, 700);
        
        map.addObject(new Wall(), 50, 650);
        map.addObject(new Wall(), 100, 650);
        map.addObject(new Wall(), 150, 650);
        map.addObject(new Wall(), 200, 650);
        map.addObject(new Wall(), 250, 650);

        map.addObject(new Wall(), 300, 150);
        map.addObject(new Wall(), 300, 200);
        map.addObject(new Wall(), 300, 250);
        map.addObject(new Wall(), 300, 400);
        map.addObject(new Wall(), 300, 450);
        map.addObject(new Wall(), 300, 500);
        
         map.addObject(new Wall(), 350, 650);
        map.addObject(new Wall(), 400, 650);
        map.addObject(new Wall(), 450, 650);
        map.addObject(new Wall(), 500, 650);
        map.addObject(new Wall(), 550, 650);
        map.addObject(new Wall(), 600, 650);
        map.addObject(new Wall(), 650, 650);
        map.addObject(new Wall(), 700, 650);
        map.addObject(new Wall(), 750, 650);
        
        map.addObject(new Wall(), 700, 200);
         map.addObject(new Wall(), 650, 200);
         map.addObject(new Wall(), 600, 200);
        
        map.addObject(new Wall(), 750, 50);
        map.addObject(new Wall(), 750, 100);
        map.addObject(new Wall(), 750, 150);
        map.addObject(new Wall(), 750, 200);
        map.addObject(new Wall(), 750, 250);
        map.addObject(new Wall(), 750, 300);
        map.addObject(new Wall(), 750, 350);
        map.addObject(new Wall(), 750, 400);
        map.addObject(new Wall(), 750, 450);
        map.addObject(new Wall(), 750, 500);
        map.addObject(new Wall(), 750, 550);
        map.addObject(new Wall(), 750, 600);
       
    }

    void addSmallItems(Map map)
    {
        for(int x = 50; x < 600; x+=20) {
            map.addObject(new SmallPoint(), x, 320);
        }
    }

    void addPowerItems(Map map)
    {
        map.addObject(new PowerPoint(), 50, 350);
        map.addObject(new PowerPoint(), 100, 550);
        map.addObject(new PowerPoint(), 650, 350);
        map.addObject(new PowerPoint(), 650, 550);
        map.addObject(new PowerPoint(), 700, 100);

    }

}
