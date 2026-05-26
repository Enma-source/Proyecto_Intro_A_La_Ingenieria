import greenfoot.*;

public class Frog extends Actor
{
    int speed = 25;
    int score = 0;

    public void act()
    {
        moveAround();
        eat();
    }

    public void moveAround()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }

        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }

        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
        }

        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
        }
    }

    public void eat()
    {
        Fly fly = (Fly)getOneIntersectingObject(Fly.class);

        if(fly != null)
        {
            removeTouching(Fly.class);

            score++;

            getWorld().showText("Puntos: " + score, 80, 30);
        }
    }
}