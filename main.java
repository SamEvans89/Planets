public class main
{
    public static void main(String args[])
    {
        SolarSystem f = new SolarSystem(300,300);
        Planet earth = new Planet(100,0,10,"BLUE",f,2);
        Planet mars = new Planet(65,0,5,"RED",f,1);

        //drawing the sun
        f.drawSolarObject(0,0,20,"YELLOW");

        while (true)
        {
            f.drawSolarObject(0,0,20,"YELLOW");
            earth.draw();
            mars.draw();
            f.finishedDrawing();
            earth.Orbit();
            mars.Orbit();

        }
    }
}