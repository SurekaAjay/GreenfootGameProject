import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Ajay) 
 * @version (Rocket V.1.0_June_2nd_2-2020)
 */
public class Sky extends World
{
    private int nextLevelWait=300;
    private EnemyBase enemyBase=null;
    
    public Sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000,400, 1);
        addActors();
    }
    private void addActors()
    {
        addObject(new Rocket(),87,155);
        CannonCylinder cylinder=new CannonCylinder();
        addObject(cylinder,378,346);
        enemyBase=new EnemyBase(cylinder);
        addObject(enemyBase,378,369);
        
    }
    public void act()
    { 
        nextLevel();
        nextLevelWait--;
        if(nextLevelWait==0)
        {
            Greenfoot.setWorld(new Space());
        }
    }
    private void nextLevel()
    {
        if(enemyBase.enemyLife == 0)
        {
            addObject(new NextLevel(), 500, 200);  
        }
    }
    
}