import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Diggaj Upadhyay 
 * @version 20.09.2021
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        if(isAtEdge())
        {
            turn(180);
            getImage().mirrorVertically();
        }
    }    
}
