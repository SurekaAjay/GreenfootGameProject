import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile2 extends Missile
{
    private int dropTime;
    public Missile2()
    {
      super(2);  
    }
    public void act() 
    {
       if(!dropping())
       {
         move(7);
       }
       disappear();
    }
    private boolean dropping()
    {
        dropTime++;
        if(dropTime>=0 && dropTime<=25)
        {
        setLocation(getX(),getY()+1);
        return true;
        }
        else
        {
            return false;
        }
    }
    

}