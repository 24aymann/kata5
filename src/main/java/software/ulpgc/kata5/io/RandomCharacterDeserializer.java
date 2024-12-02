package software.ulpgc.kata5.io;

import com.google.gson.Gson;
import software.ulpgc.kata5.io.pojos.RandomCharacterGetResponse;

public class RandomCharacterDeserializer implements CharacterDeserializer{
    @Override
    public Object deserialize(String read) {
        return new Gson().fromJson(read, RandomCharacterGetResponse.class);
    }
}
