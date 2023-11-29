package Group2Builder;

import Group2Builder.Components.Movement;
import Group2Builder.Components.Mouth;

public class Animal {
    private final String name;
    private final Movement movement;
    private final Mouth mouth;

    public Animal(String name, Movement movement, Mouth mouth) {
        this.name = name;
        this.movement = movement;
        this.mouth = mouth;
    }

    public String getName() {
        return name;
    }

    public Movement getMovement() {
        return movement;
    }

    public Mouth getMouth() {
        return mouth;
    }
}
