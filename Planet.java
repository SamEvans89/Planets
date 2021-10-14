public class Planet
{
    //Establishing variables
    int distance_from_sun;
    int angle;
    int diameter;
    String colour;
    SolarSystem sys;
    int orbit_speed;

    /**
     * Creates a planet object to be presented on the SolarSystem object which has been passed through
     * @param d The distance from the sun of the planet which will be made
     * @param a The angle from zero (polar) which the planet is at
     * @param dia The diameter of the planet
     * @param c The Colour of the planet
     * @param s The SolarSystem object from Main
     * @param o The orbital speed of the object
     */
    public Planet(int d, int a, int dia, String c, SolarSystem s, int o)
    {
        //Setting variables
        distance_from_sun = d;
        angle = a;
        diameter = dia;
        colour = c;
        sys = s;
        orbit_speed = o;
    }

    /**
     * Changes the angle of the object, therefore moving it on the solarSystem object
     * @param speed The rate at which the angle changes
     */
    public void Orbit(int speed)
    {
        angle-= speed;
    }

    /**
     * Draws the object onto the board
     */
    public void draw()
    {
        sys.drawSolarObject(distance_from_sun,angle,diameter,colour);
    }

    /**
     * Finds the speed at which the angle is changing
     * @return Change in pixels every loop
     */
    public int getSpeed()
    {
        return orbit_speed;
    }

    public int getAngle()
    {
        return angle;
    }

    public int getDistance()
    {
        return distance_from_sun;
    }

    public int getDiameter()
    {
        return diameter;
    }
}