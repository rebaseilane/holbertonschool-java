/**
 * Thief character class.
 */
public class Thief extends Character {

    /**
     * Thief constructor.
     *
     * @param name character name
     * @param intelligence intelligence value
     * @param strength strength value
     * @param endurance endurance value
     * @param resilience resilience value
     * @param dexterity dexterity value
     * @throws Exception invalid thief attributes
     */
    public Thief(String name,
            int intelligence,
            int strength,
            int endurance,
            int resilience,
            int dexterity) throws Exception {

        super(name,
                CharacterType.THIEF,
                intelligence,
                strength,
                endurance,
                resilience,
                dexterity);

        if (dexterity <= strength
                || dexterity <= intelligence) {

            throw new Exception(
                    "Invalid attributes for THIEF");
        }
    }

    /**
     * Calculates thief attack damage.
     *
     * @return attack damage
     */
    @Override
    public double getAttackDamage() {
        return (strength * 0.5)
                + (dexterity * 0.35)
                + (endurance * 0.1)
                + (intelligence * 0.05);
    }
}
