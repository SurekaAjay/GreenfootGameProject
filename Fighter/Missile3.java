import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile3 extends Missile
{
    public Missile3()
    {
        super(3);
    }
    public void act() 
    {
        move(30);
        disappear();
    }    
}
