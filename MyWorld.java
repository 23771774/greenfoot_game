import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Object;
/**
 * Write a description of class MyWorld here.
 * 
 * @author Diggaj Upadhyay 
 * @version 20.09.2021
 */

public class MyWorld extends World
{
    Counter counter = new Counter();    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        prepare();
    }
    public void act()
    {
        addFoodRandomly();
        pause();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player mainPlayer = new Player();
        addObject(mainPlayer, 300, 200);
        
        addObject(counter, 75, 30);
        //int x = 60;
        //while(x < 450)
        //{
        //    addObject(new Food(),x + 40,40);
        //    x = x + 40;
        //}
        int y = 60;
        while(y < 180)
        {
            addObject(new Enemy(),580,y + 40);
            y = y + 40;
        }
    }
    public int getRandomNo()
    {
        int number = Greenfoot.getRandomNumber(2);
        if(number == 0)
        {
            number = 2;
        }
        return number;
    }       
    public void addFoodRandomly()
    {
        String state = "";
        int no = Greenfoot.getRandomNumber(3);
        if(no == 0) state = "good";
        if(no == 1) state = "bad";
        if(no == 2) state = "normal";
        addObject(new Food(state), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        //Greenfoot.delay(10);
        
    }
    public void pause()
    {
        int i = 0;
        while(i <= 10000000){
            i ++;
        }
    }
}
