import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * Kerr is an Alien who crossed into a palace on Planet A. He walked 
 * into a Kris’s room in an accident. In the room of the palace, he 
 * found three monsters named Kris. If he meets a monster, he will 
 * faint. Kerr needs to avoid the monster Kris and collect gold coins, 
 * leave the room, and finally escape the palace. Gold coins can be 
 * upgraded to make Kerr stronger and armed. Version 1.0 is just you 
 * control player Kerr to move randomly in Kris’s room. You just press 
 * ‘RUN’ or ‘ACT’ to start this game. This game is built for the teens 
 * The character Alien Kerr image is from the template. The character 
 * Monster Kris image and background image are from the Internet. 
 * 
 * @author Zidong Peng & 202100408064
 * @version 1.0 11/11/2022
 */

public class KrisRoom extends World
{
    /**
     * Create Kris's room. The room has a size of 900x600 cells, 
     * where every cell is just 1 pixel.
     */
    public KrisRoom()
    {
        super(900, 600, 1);
        createPlayerKerr();
        createMonsterKris();
        }
    
    /**
     * Initialize the player Kerr in the center of the room.
     */    
    
    public void createPlayerKerr()
    {
        //0.5 is a double type, which needs to be cast to int type.
        int x = (int) (getWidth() * 0.5);
        int y = (int) (getHeight() * 0.5);
        addObject(new PlayerKerr(),x,y);
        }
    
    /**
     * Create 3 Monsters in random location which name is Kris in the room.
     */
    public void createMonsterKris()
    {
        for (int i = 0;i < 3;i++)
        {
            int a = Greenfoot.getRandomNumber(700);
            int b = Greenfoot.getRandomNumber(400);
            addObject(new MonsterKris(),a,b);
        }
    }
}
    
    
