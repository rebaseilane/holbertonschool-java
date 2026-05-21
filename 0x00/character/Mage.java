/**
 * Mage character class.
 */
public class Mage extends Character {

    /**
     * Creates a mage character.
     *
     * @param name character name
     * @param intelligence intelligence attribute
     * @param strength strength attribute
     * @param endurance endurance attribute
     * @param resilience resilience attribute
     * @param dexterity dexterity attribute
     * @throws Exception invalid mage attributes
     */
    public Mage(String name, int intelligence,
            int strength, int endurance,
            int resilience, int dexterity)
            throws Exception {

        super(name, CharacterType.MAGE,
                intelligence, strength,
                endurance, resilience,
                dexterity);

        if (intelligence <= strength
                || intelligence <= dexterity) {

            throw new Exception(
                    "Invalid attributes for MAGE");
        }
    }

    /**
     * Calculates mage attack damage.
     *
     * @return attack damage
     */
    @Override
    public double getAttackDamage() {
        return (intelligence * 0.8)
                + (strength * 0.05)
                + (dexterity * 0.05)
                + (endurance * 0.1);
    }
}
