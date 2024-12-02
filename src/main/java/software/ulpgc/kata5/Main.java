package software.ulpgc.kata5;

import software.ulpgc.kata5.io.CharacterLoader;
import software.ulpgc.kata5.io.RandomCharacterAdapter;
import software.ulpgc.kata5.io.RandomCharacterDeserializer;
import software.ulpgc.kata5.io.RandomCharacterReader;
import software.ulpgc.kata5.model.Character;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        CharacterLoader loader = new CharacterLoader(
                new RandomCharacterReader(),
                new RandomCharacterDeserializer(),
                new RandomCharacterAdapter()
        );

        HashSet<software.ulpgc.kata5.model.Character> characters = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            Character character = loader.get();
            if (characters.add(character)) System.out.println(character.characterFormat() + "\n");
        }
    }
}
