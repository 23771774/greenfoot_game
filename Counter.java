import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author Diggaj Upadhyay 
 * @version 20.09.2021
 */

public class Counter extends Actor
{
    // score begins from index 0
    static int score = 0;

    public int getCounter() {
        return score;
    }
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 25, Color.BLACK, Color.WHITE));
    }
    
    public static void addScore(int points) {
        score = score + points;
    }
}
