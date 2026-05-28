/**
 * ArmorDecorator increases spacecraft health.
 */
public class ArmorDecorator extends SpacecraftDecorator
{
    /**
     * Constructor.
     *
     * @param spacecraft spacecraft to decorate
     */
    public ArmorDecorator(Spacecraft spacecraft)
    {
        super(spacecraft);
    }

    /**
     * Adds armor bonus to health.
     *
     * @return increased health
     */
    @Override
    public int getHealth()
    {
        return super.getHealth() + 150;
    }
}
