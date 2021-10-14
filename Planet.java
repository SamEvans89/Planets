public class Planet
{
    int distance_from_sun;
    int angle;
    int diameter;
    String colour;
    SolarSystem sys;
    int orbit_speed;

    public Planet(int d, int a, int dia, String c, SolarSystem s, int o)
    {
        distance_from_sun = d;
        angle = a;
        diameter = dia;
        colour = c;
        sys = s;
        orbit_speed = o;
    }

    public void Orbit()
    {
        //rotating clockwise
        angle-= orbit_speed;
    }

    public int getAngle()
    {
        return(angle);
    }

    public void draw()
    {
        sys.drawSolarObject(distance_from_sun,angle,diameter,colour);
    }
}