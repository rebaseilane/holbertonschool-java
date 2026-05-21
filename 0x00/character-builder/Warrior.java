/**
 * Warrior character class.
 */
public class Warrior extends Character {

    /**
     * Warrior constructor.
     *
     * @param name character name
     * @param intelligence intelligence value
     * @param strength strength value
     * @param endurance endurance value
     * @param resilience resilience value
     * @param dexterity dexterity value
     * @throws Exception invalid warrior attributes
     */
    public Warrior(String name,
            int intelligence,
            int strength,
            int endurance,
            int resilience,
            int dexterity) throws Exception {

        super(name,
                CharacterType.WARRIOR,
                intelligence,
                strength,
                endurance,
                resilience,
                dexterity);

        if (strength <= intelligence
                || strength <= dexterity) {

            throw new Exception(
                    "Invalid attributes for WARRIOR");
        }
    }

    /**
     * Calculates warrior attack damage.
     *
     * @return attack damage
     */
    @Override
    public double getAttackDamage() {
        return (strength * 0.8)
                + (endurance * 0.05)
                + (dexterity * 0.1)
                + (intelligence * 0.05);
    }
}
