/**
 * Base Spacecraft class.
 */
public class Spacecraft
{
    protected int health;
    protected int attack;

    /**
     * Constructor for Spacecraft.
     *
     * @param health spacecraft health
     * @param attack spacecraft attack
     */
    public Spacecraft(int health, int attack)
    {
        this.health = health;
        this.attack = attack;
    }

    /**
     * Get spacecraft health.
     *
     * @return health
     */
    public int getHealth()
    {
        return this.health;
    }

    /**
     * Get spacecraft attack.
     *
     * @return attack
     */
    public int getAttack()
    {
        return this.attack;
    }

    /**
     * String representation of spacecraft.
     *
     * @return formatted string
     */
    @Override
    public String toString()
    {
        return "Health: " + getHealth() + " - Attack: " + getAttack();
    }
}
