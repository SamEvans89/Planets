public class main
{
    public static void main(String args[])
    {
        int earth_distance_around = 0;
        SolarSystem f = new SolarSystem(300,300);
        f.drawSolarObject(0,0,20,"YELLOW");
        f.drawSolarObject(100,earth_distance_around,10,"BLUE");

        while (1==1)
        {
            f.drawSolarObject(0,0,20,"YELLOW");
            f.drawSolarObject(100,earth_distance_around,10,"BLUE");
            f.finishedDrawing();
            earth_distance_around--;

        }
    }
}