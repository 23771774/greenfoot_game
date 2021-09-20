import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // move player down, up, left, right by 2 pixels when the input is 
        // given by the up,down,left right keys on the keyboard.
        if(Greenfoot.isKeyDown("down"))
        setLocation(getX(), getY() +2);
        if(Greenfoot.isKeyDown("up"))
        setLocation(getX(), getY() -2);
        if(Greenfoot.isKeyDown("right"))
        setLocation(getX() +2, getY());
        if(Greenfoot.isKeyDown("left"))
        setLocation(getX() -2, getY());
    }
}
