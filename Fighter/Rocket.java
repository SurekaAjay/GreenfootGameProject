import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (Ajay) 
 * @version (Rocket V.1.0_June_2nd_2-2020)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int reloadTime;
    public void act() 
    {
       this.move(1);
       this.changeDirection();
       this.rotateRocket();
       this.moveAround();
       this.reloadTime++;
       this.displayReloadTime();//to shw reload time
       if(reloadTime> 10)
       {
       this.launchMissile();
       }
    }
       private void rotateRocket()
       {
       //Seperate simple if for turning clockwise
       if(Greenfoot.isKeyDown("Z"))
       {
           this.turn(1);
       }
       //Seperate simple if for turning anti-clockwise
       if(Greenfoot.isKeyDown("X"))
       {
           this.turn(-1);
       }
       } 
       
       private void changeDirection()
        {
         //Seperate simple if for right direction
       if (Greenfoot.isKeyDown("right"))
       {
           this.move(5);
          this.setImage("rocketWithBooster.png");
       }
       else
       {
        this.setImage("rocketWithoutBooster.png");
        }

           //Seperate simple if for back direction
       if (Greenfoot.isKeyDown("left"))
       {
          this.move(-3 );
       }
       //Seperate simple if for up direction
       if (Greenfoot.isKeyDown("up"))
       {
           this.setLocation(getX(),getY()-2);
       }
       //Simple simple if for down direction 
       if (Greenfoot.isKeyDown("down"))
       {
           this.setLocation(getX(),getY()+2);
       }
        }
        private void moveAround()
        {
            if(this.getX()==999)
            {
                this.setLocation(0,getY());
            }
           else if(this.getX()==0)
            {
                this.setLocation(999,getY());
            }
            if(this.getY()==0)
            {
                this.setLocation(getX(),399);
            }
            else if(this.getY()==399)
            {
                this.setLocation(getX(),0);
            }
        }
        private void launchMissile()
        {
          if(Greenfoot.isKeyDown("L"))
          {
             triggerMissile(new Missile1());
          }
          if(Greenfoot.isKeyDown("F"))
          {
            if(this.getRotation()==0)
           {
            triggerMissile(new Missile2());
            
           }
          }
        }
        private void triggerMissile(Missile missile)
        {
            getWorld().addObject(missile,this.getX(),this.getY());
            missile.setRotation(this.getRotation());
            reloadTime=0;
        }
        private void displayReloadTime()
        {
          getWorld().showText("Reload Time: "+reloadTime,108,47);
        }
     
}
 
