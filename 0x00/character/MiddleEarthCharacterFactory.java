/**
 * Factory for Middle-earth characters.
 */
public class MiddleEarthCharacterFactory
        extends CharacterFactory {

    /**
     * Creates a Middle-earth character.
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
                        10,
                        2,
                        5,
                        3,
                        4
                );

            case THIEF:
                return new Thief(
                        name,
                        2,
                        6,
                        8,
                        5,
                        10
                );

            case WARRIOR:
                return new Warrior(
                        name,
                        1,
                        8,
                        5,
                        10,
                        6
                );

            default:
                return null;
        }
    }
}
