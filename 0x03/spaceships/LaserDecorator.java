/**
 * LaserDecorator increases attack power.
 */
public class LaserDecorator extends SpacecraftDecorator
{
    /**
     * Constructor.
     *
     * @param spacecraft spacecraft to decorate
     */
    public LaserDecorator(Spacecraft spacecraft)
    {
        super(spacecraft);
    }

    /**
     * Adds laser attack bonus.
     *
     * @return increased attack
     */
    @Override
    public int getAttack()
    {
        return super.getAttack() + 40;
    }
}
