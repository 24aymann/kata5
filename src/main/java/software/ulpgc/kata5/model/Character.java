package software.ulpgc.kata5.model;

import software.ulpgc.kata5.io.Transformation;

import java.util.List;
import java.util.Objects;

public record Character(String name, String ki, List<Transformation> transformations) {
    public String characterFormat() {
        StringBuilder sb = new StringBuilder();

        sb.append("Character name: ")
                .append(this.name)
                .append("\nBase KI: ")
                .append(this.ki)
                .append("\nCharacter transformations: ");

        if (transformations.isEmpty()) sb.append("\n - Without transformations");
        else {
            for (Transformation transformation : transformations) {
                sb.append("\n - ")
                        .append(transformation.name())
                        .append(" -> KI: ")
                        .append(transformation.ki());
            }
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Character character = (Character) object;
        return Objects.equals(ki, character.ki) && Objects.equals(name, character.name) && Objects.equals(transformations, character.transformations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ki, transformations);
    }
}
