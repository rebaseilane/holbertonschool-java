/**
 * Builder interface for character creation.
 */
public interface Builder {

    /**
     * Sets character name.
     *
     * @param name character name
     */
    void setName(String name);

    /**
     * Sets character type.
     *
     * @param type character type
     */
    void setType(CharacterType type);

    /**
     * Sets intelligence.
     *
     * @param intelligence intelligence value
     */
    void setIntelligence(int intelligence);

    /**
     * Sets strength.
     *
     * @param strength strength value
     */
    void setStrength(int strength);

    /**
     * Sets endurance.
     *
     * @param endurance endurance value
     */
    void setEndurance(int endurance);

    /**
     * Sets resilience.
     *
     * @param resilience resilience value
     */
    void setResilience(int resilience);

    /**
     * Sets dexterity.
     *
     * @param dexterity dexterity value
     */
    void setDexterity(int dexterity);
}
