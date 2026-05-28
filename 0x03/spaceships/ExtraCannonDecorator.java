/**
 * ExtraCannonDecorator increases attack power.
 */
public class ExtraCannonDecorator extends SpacecraftDecorator
{
    /**
     * Constructor.
     *
     * @param spacecraft spacecraft to decorate
     */
    public ExtraCannonDecorator(Spacecraft spacecraft)
    {
        super(spacecraft);
    }

    /**
     * Adds cannon attack bonus.
     *
     * @return increased attack
     */
    @Override
    public int getAttack()
    {
        return super.getAttack() + 75;
    }
}
