import greenfoot.*;

public class MyWorld extends World
{
    GreenfootSound musica = new GreenfootSound("Proyectofxinal.wav");
    public MyWorld()
    {
        super(600, 400, 1);

        Frog frog = new Frog();
        addObject(frog, 300, 200);

        for(int i = 0; i < 10; i++)
        {
            Fly fly = new Fly();

            addObject(
                fly,
                Greenfoot.getRandomNumber(600),
                Greenfoot.getRandomNumber(400)
            );
        }
    }
}