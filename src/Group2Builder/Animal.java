package Group2Builder;

import Group2Builder.Components.Movement;
import Group2Builder.Components.Mouth;

public class Animal {
    Movement movement;
    Mouth mouth;

    public Animal(Movement movement, Mouth mouth) {
        this.movement = movement;
        this.mouth = mouth;
    }
}
