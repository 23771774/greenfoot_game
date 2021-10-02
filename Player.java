import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.lang.System;
/**
 * Write a description of class Player here.
 * 
 * @author Diggaj Upadhyay 
 * @version 20.09.2021
 */

public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY() +5);
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY() -5);
        if(Greenfoot.isKeyDown("right"))
            setLocation(getX() +5, getY());
        if(Greenfoot.isKeyDown("left"))
            setLocation(getX() -5, getY());
        
        if(isTouching(Food.class) != false)
        {
            getWorld().removeObject(getOneIntersectingObject(Food.class));
            Counter.addScore(Food.getPoints());
        }
        if(isTouching(Enemy.class) != false)
        {
            getWorld().removeObject(getOneIntersectingObject(Enemy.class));
            Counter.addScore(-10);
        }
    }

}
