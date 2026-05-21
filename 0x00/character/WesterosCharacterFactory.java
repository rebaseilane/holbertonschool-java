/**
 * Factory for Westeros characters.
 */
public class WesterosCharacterFactory
        extends CharacterFactory {

    /**
     * Creates a Westeros character.
     *
     * @param type character type
     * @param name character name
     * @return created character
     * @throws Exception invalid character
     */
    @Override
    public Character createCharacter(
            CharacterType type,
            String name) throws Exception {

        switch (type) {

            case MAGE:
                return new Mage(
                        name,
                        8,
                        3,
                        3,
                        3,
                        4
                );

            case THIEF:
                return new Thief(
                        name,
                        1,
                        8,
                        7,
                        7,
                        10
                );

            case WARRIOR:
                return new Warrior(
                        name,
                        0,
                        9,
                        7,
                        10,
                        7
                );

            default:
                return null;
        }
    }
}
