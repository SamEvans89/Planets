public class Moon extends Planet
{
    int distance_from_planet;
    int angle_on_planet;
    int moon_diameter;
    String moon_colour;
    int moon_orbit_speed;
    Planet parent_planet;
    SolarSystem solSys;

    /**
     * Creates a moon to rotate around a specific planet.
     * @param d Distance from the planet to rotate
     * @param a The angle from the planet to rotate around
     * @param dia The diameter of the moon
     * @param c The colour of the moon
     * @param o The orbit speed of the moon
     * @param p The parent planet of the moon
     * @param s The SolarSystem object to put the moon on
     */
    public Moon(int d, int a, int dia, String c, int o, Planet p, SolarSystem s) {
        super(p.getDistance(),p.getAngle(),dia,"GREY",s,p.getSpeed());

        //setting variables, and setting the super variables as well.
        distance_from_planet = d;
        angle_on_planet = a;
        moon_diameter = dia;
        moon_colour = c;
        moon_orbit_speed = o;
        parent_planet = p;
        solSys = s;


    }

    /**
     * Overwriting the orbit code of the planet code in order to allow the moon to orbit individually.
     */
    @Override
    public void Orbit(int speed) 
    {
        angle_on_planet-= moon_orbit_speed;
    }

    /**
     * Drawing the moon onto the solarsystem object given
     */
    public void draw()
    {
        sys.drawSolarObjectAbout(distance_from_planet, angle_on_planet, diameter, colour, parent_planet.getDistance(), parent_planet.getAngle());
    }
    
    /**
     * Finding the moon speed.
     * @return The speed at which the moon is orbiting around its parent planet.
     */
    @Override
    public int getSpeed()
    {
        return orbit_speed;
    }
}