/**
 * Abstract factory for character creation.
 */
public abstract class CharacterFactory {

    /**
     * Creates a character.
     *
     * @param type character type
     * @param name character name
     * @return created character
     * @throws Exception invalid character
     */
    public abstract Character createCharacter(
            CharacterType type,
            String name) throws Exception;
}
