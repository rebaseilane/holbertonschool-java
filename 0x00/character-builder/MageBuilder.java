/**
 * Builder class for Mage.
 */
public class MageBuilder implements Builder {

    /**
     * Character name.
     */
    private String name;

    /**
     * Character type.
     */
    private CharacterType type;

    /**
     * Intelligence attribute.
     */
    private int intelligence;

    /**
     * Strength attribute.
     */
    private int strength;

    /**
     * Endurance attribute.
     */
    private int endurance;

    /**
     * Resilience attribute.
     */
    private int resilience;

    /**
     * Dexterity attribute.
     */
    private int dexterity;

    /**
     * Sets character name.
     *
     * @param name character name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets character type.
     *
     * @param type character type
     */
    @Override
    public void setType(CharacterType type) {
        this.type = type;
    }

    /**
     * Sets intelligence.
     *
     * @param intelligence intelligence value
     */
    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Sets strength.
     *
     * @param strength strength value
     */
    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Sets endurance.
     *
     * @param endurance endurance value
     */
    @Override
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    /**
     * Sets resilience.
     *
     * @param resilience resilience value
     */
    @Override
    public void setResilience(int resilience) {
        this.resilience = resilience;
    }

    /**
     * Sets dexterity.
     *
     * @param dexterity dexterity value
     */
    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Builds mage object.
     *
     * @return mage character
     * @throws Exception invalid attributes
     */
    public Mage build() throws Exception {
        return new Mage(
                name,
                intelligence,
                strength,
                endurance,
                resilience,
                dexterity
        );
    }
}
