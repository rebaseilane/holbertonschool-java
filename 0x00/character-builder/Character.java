import java.text.DecimalFormat;

/**
 * Abstract class representing a character.
 */
public abstract class Character {
    /**
     * Character name.
     */
    protected String name;

    /**
     * Character type.
     */
    protected CharacterType type;

    /**
     * Intelligence attribute.
     */
    protected int intelligence;

    /**
     * Strength attribute.
     */
    protected int strength;

    /**
     * Endurance attribute.
     */
    protected int endurance;

    /**
     * Resilience attribute.
     */
    protected int resilience;

    /**
     * Dexterity attribute.
     */
    protected int dexterity;

    /**
     * Character constructor.
     *
     * @param name character name
     * @param type character type
     * @param intelligence intelligence value
     * @param strength strength value
     * @param endurance endurance value
     * @param resilience resilience value
     * @param dexterity dexterity value
     */
    public Character(String name,
            CharacterType type,
            int intelligence,
            int strength,
            int endurance,
            int resilience,
            int dexterity) {

        this.name = name;
        this.type = type;
        this.intelligence = intelligence;
        this.strength = strength;
        this.endurance = endurance;
        this.resilience = resilience;
        this.dexterity = dexterity;
    }

    /**
     * Calculates attack damage.
     *
     * @return attack damage
     */
    public abstract double getAttackDamage();

    /**
     * Returns formatted character information.
     *
     * @return character information
     */
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return "Character { name = " + name
                + ", type = " + type
                + ", intelligence = " + intelligence
                + ", strength = " + strength
                + ", endurance = " + endurance
                + ", resilience = " + resilience
                + ", dexterity = " + dexterity
                + ", attack damage = "
                + decimalFormat.format(getAttackDamage())
                + " }";
    }
}
