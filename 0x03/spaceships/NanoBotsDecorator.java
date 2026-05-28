/**
 * NanoBotsDecorator increases attack power.
 */
public class NanoBotsDecorator extends SpacecraftDecorator
{
    /**
     * Constructor.
     *
     * @param spacecraft spacecraft to decorate
     */
    public NanoBotsDecorator(Spacecraft spacecraft)
    {
        super(spacecraft);
    }

    /**
     * Adds nanobots attack bonus.
     *
     * @return increased attack
     */
    @Override
    public int getAttack()
    {
        return super.getAttack() + 25;
    }
}
