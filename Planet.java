public class Planet
{
    int distance_from_sun;
    int angle;
    int diameter;
    String colour;
    SolarSystem sys;

    public Planet(int d, int a, int dia, String c, SolarSystem s)
    {
        distance_from_sun = d;
        angle = a;
        diameter = dia;
        colour = c;
        sys = s;
    }

    public void Orbit()
    {
        angle++;
    }

    public int getAngle()
    {
        return(angle);
    }
}