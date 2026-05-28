/**
 * Base decorator class for Spacecraft.
 */
public class SpacecraftDecorator extends Spacecraft
{
    protected Spacecraft spacecraft;

    /**
     * Constructor.
     *
     * @param spacecraft spacecraft to decorate
     */
    public SpacecraftDecorator(Spacecraft spacecraft)
    {
        super(spacecraft.getHealth(), spacecraft.getAttack());
        this.spacecraft = spacecraft;
    }

    /**
     * Get health from decorated spacecraft.
     *
     * @return health
     */
    @Override
    public int getHealth()
    {
        return this.spacecraft.getHealth();
    }

    /**
     * Get attack from decorated spacecraft.
     *
     * @return attack
     */
    @Override
    public int getAttack()
    {
        return this.spacecraft.getAttack();
    }
}
