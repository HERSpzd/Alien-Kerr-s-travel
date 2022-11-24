import greenfoot.*;  // World, Actor, GreenfootImage, and Greenfoot

/**
 * Player Kerr. Kerr moves randomly until he hits the edge of the world, at
 * which point it turns randomly. If Kerr meet a monster Kris, he will get
 * vertigo effect in a short time.
 * 
 * @author Zidong Peng & 202100408064
 * @version 1.0 11/11/2022
 */

public class PlayerKerr extends Actor
{          
    /** 
     * Act - contains the player actions. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        randomMove();
        atEdge();
    }
    
    /**
     * The Player can turn when it meet the world edge.
     */
    public void atEdge()
    {
        int a = Greenfoot.getRandomNumber(360);
        if (isAtEdge())
        {
            turn(a);  //Get random rotation degree.
        }
        touchMonster();
    }
     
    /**
     * When the 'Act' or 'Run' button gets pressed, the player can random
     * move in the world.
     */
    public void randomMove()
    {
        int b = Greenfoot.getRandomNumber(5);  //Get random rotation degree.
        move(10);
        turn(b);  
    }
    
    /**
     * When player touch MonsterKris, the vertigo effect in player.
     */
    public void touchMonster()
    {
        if (isTouching(MonsterKris.class))
        {
            turn(22);
        }
    }
    
}
