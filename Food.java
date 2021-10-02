import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

// Constructor overloading is the idea of having more ways to instantiate a class.
//I used constructor overloading in Food class, giving the user the posibility to create
//a Food object based on different attributes. The class has the default constructor, which
//is always called when there's not another constructor. But when we have other constructors,
//based on how our instantiation looks like, one of the constructors is called.
// Throughout this mini-game, I used all of the constructors. 
public class Food extends Actor
{
    public static GreenfootImage defaultImage = new GreenfootImage("apple1.png");
    public static GreenfootImage secondImage = new GreenfootImage("bananas.png");
    public static int speed = 1;
    public static int points = 2;
    public String[] stateValues = {"bad", "good", "normal"};
    
    public Food()
    {
    }
    public Food(int x)
    {
        if(x == 1)
        {
            setImage(defaultImage);
        }
        if(x == 2)
        {
            setImage(secondImage);
        }
    }
    public Food(String state)
    {
        if(state.equals("good"))
        {
            speed = 5;
            setImage("bananas.png");
            points = 50;
        }
        if(state.equals("bad"))
        {
            speed = 2;
            setImage("strawberry2.png");
            points = -100;
        }
        if(state.equals("normal"))
        {
            speed = 3;
            points = 25;
        }
    }
    public void act() 
    {
        move(1);
        if(isTouching(Enemy.class) != false)
        {
            getWorld().removeObject(getOneIntersectingObject(Food.class));
        }
        if(isAtEdge())
        {
             getWorld().removeObject(this);
        }
    }    
    public static int getPoints(){
        return points;
    }
    public static int getSpeed(){
        return speed;
    }
}
