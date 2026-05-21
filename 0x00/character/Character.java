import java.text.DecimalFormat;

/**
 * Abstract class representing an RPG character.
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
     * Character intelligence.
     */
    protected int intelligence;

    /**
     * Character strength.
     */
    protected int strength;

    /**
     * Character endurance.
     */
    protected int endurance;

    /**
     * Character resilience.
     */
    protected int resilience;

    /**
     * Character dexterity.
     */
    protected int dexterity;

    /**
     * Constructor for character creation.
     *
     * @param name character name
     * @param type character type
     * @param intelligence intelligence attribute
     * @param strength strength attribute
     * @param endurance endurance attribute
     * @param resilience resilience attribute
     * @param dexterity dexterity attribute
     */
    public Character(String name, CharacterType type,
            int intelligence, int strength,
            int endurance, int resilience,
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
     * Returns character information.
     *
     * @return formatted character string
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
