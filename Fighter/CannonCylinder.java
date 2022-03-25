import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonCylinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonCylinder extends Actor
{
    private int swingCount=0;
    private int delayTime;
    public void act() 
    {
     swing();
     autofire();
    }    
    private void swing()
    {
        if(swingCount>=0 && swingCount<=170)
        {
        swingCount++;
        turn(-1);
        }
    
        else if(swingCount>=171 && swingCount<=340)
        {
           swingCount++;
           turn(1);
           if(swingCount==341)
           {
               swingCount=0;
           }
        }
    }
    private void autofire()
    {
        delayTime++;
        if(delayTime==50)
        {
            Missile3 missile=new Missile3();
            getWorld().addObject(missile,this.getX(),this.getY());
            missile.setRotation(this.getRotation());
            delayTime=0;
        }
    }
    }

