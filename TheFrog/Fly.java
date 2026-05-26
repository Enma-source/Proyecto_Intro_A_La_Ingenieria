import greenfoot.*;

public class Fly extends Actor
{
    int speed = 15;

    public void act()
    {
        move(speed);

        if(isAtEdge())
        {
            turn(180);
        }

        if(Greenfoot.getRandomNumber(100) < 15)
        {
            turn(Greenfoot.getRandomNumber(120) - 60);
        }
    }
}