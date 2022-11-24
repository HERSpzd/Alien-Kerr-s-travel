import greenfoot.*;  // World, Actor, GreenfootImage, Greenfoot and MouseInfo

/**
 * Monster Kris. A MonsterKris moves forward until it hits the edge of the world, at
 * which point it turns right. 
 * 
 * @author Zidong Peng 
 * @version 1.0 11/11/2022
 */
public class MonsterKris extends Actor 
{
    /**
     * Act - do whatever the MonsterKris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        //MonsterKris turns When it meet the world edge. 
        if (isAtEdge())
        {  
            turn(56);
        }
        
    }
}
