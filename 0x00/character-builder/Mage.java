/**
 * Mage character class.
 */
public class Mage extends Character {

    /**
     * Mage constructor.
     *
     * @param name character name
     * @param intelligence intelligence value
     * @param strength strength value
     * @param endurance endurance value
     * @param resilience resilience value
     * @param dexterity dexterity value
     * @throws Exception invalid mage attributes
     */
    public Mage(String name,
            int intelligence,
            int strength,
            int endurance,
            int resilience,
            int dexterity) throws Exception {

        super(name,
                CharacterType.MAGE,
                intelligence,
                strength,
                endurance,
                resilience,
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
