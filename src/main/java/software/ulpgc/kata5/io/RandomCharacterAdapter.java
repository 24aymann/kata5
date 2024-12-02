package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojos.RandomCharacterGetResponse;
import software.ulpgc.kata5.model.Character;
import software.ulpgc.kata5.model.CharacterAdapter;

public class RandomCharacterAdapter implements CharacterAdapter {
    @Override
    public software.ulpgc.kata5.model.Character adapt(Object object) {
        RandomCharacterGetResponse response = (RandomCharacterGetResponse) object;
        return new Character(response.name(), response.ki(), response.transformations());
    }
}
