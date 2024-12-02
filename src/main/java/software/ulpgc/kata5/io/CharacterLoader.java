package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.Character;
import software.ulpgc.kata5.model.CharacterAdapter;

public class CharacterLoader {
    private final CharacterReader reader;
    private final CharacterDeserializer deserializer;
    private final CharacterAdapter adapter;

    public CharacterLoader(CharacterReader reader, CharacterDeserializer deserializer, CharacterAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public Character get() {
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
