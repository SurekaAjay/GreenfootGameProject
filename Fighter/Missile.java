import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Actor
{
    public Missile(int reduceSize)
    {
       getImage().scale(getImage().getWidth()/reduceSize,getImage().getHeight()/reduceSize);
    }
     public void disappear()
    {
        if(this.isAtEdge())
        {
            getWorld().removeObject(this);
        } 
    }
}
