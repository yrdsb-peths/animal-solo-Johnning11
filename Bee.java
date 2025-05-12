import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    public Bee(){
        setImage("images/bee2.png");
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("right")) {
            move(1);
        }
    }
}
