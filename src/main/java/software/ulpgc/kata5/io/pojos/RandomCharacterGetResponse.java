package software.ulpgc.kata5.io.pojos;

import software.ulpgc.kata5.io.Transformation;

import java.util.List;

public record RandomCharacterGetResponse(
        int id,
        String name,
        String ki,
        List<Transformation> transformations) {}