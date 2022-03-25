import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBase extends Actor
{
    private int distance=4;
    public int enemyLife=5;
    private CannonCylinder cylinder;//creating orv of one class has a global variable in another class is called Has-a-relation
    
    public EnemyBase(CannonCylinder cylinder)
    {
        this.cylinder=cylinder;
    }
    public void act() 
    {
        move(distance);
        toAndFro();
        moveCannonCylinder();
        blast();
    }
    
    private void toAndFro()
    {
        if(getX()==938)
        {
            distance=-4;
        }
        if(getX()==66)
        {
            distance=4;
        }
    }
    private void moveCannonCylinder()
    {
      cylinder.setLocation(this.getX(),this.getY()-23);
    }
    private void blast()
    {
        if(isTouching(Missile1.class))
       {
           removeTouching(Missile1.class);
           enemyLife--;
           
           if(enemyLife ==0)
           {
               getWorld().removeObject(cylinder);
               getWorld().removeObject(this);
            }
        }
            else if(isTouching(Missile2.class))
       {
           removeTouching(Missile2.class);
           enemyLife--;
           
           if(enemyLife ==0)
           {
               getWorld().removeObject(cylinder);
               getWorld().removeObject(this);
            }
       }
    }
}
