public class main
{
    public static void main(String args[])
    {
        SolarSystem f = new SolarSystem(300,300);
        Planet[] planets = new Planet[2];
        planets[0] = new Planet(100,0,10,"BLUE",f,2); //earth
        planets[1] = new Planet(65,0,5,"RED",f,1); //mars
        planets[2] = new Moon(5, 0, 5, "GREY", f, 1);

        planets[2].setParent(planets[0]);

        //drawing the sun
        f.drawSolarObject(0,0,20,"YELLOW"); //the sun (centerpoint)

        while (true)
        {
            f.drawSolarObject(0,0,20,"YELLOW");
            for(Planet p:planets)
            {
                p.draw();
                p.Orbit(p.getSpeed());
            }

            f.finishedDrawing();
        }
    }
}