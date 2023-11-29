package Group2Builder;

import Group2Builder.Components.Movement;
import Group2Builder.Components.Mouth;

public class Director {

    public void constructCat(Builder builder) {
        builder.setName("Cat");
        builder.setMovement(new Movement(9, false));
        builder.setMouth(new Mouth("Meow", Diet.CARNIVORE));
    }

    public void constructHorse(Builder builder) {
        builder.setName("Horse");
        builder.setMovement(new Movement(13, false));
        builder.setMouth(new Mouth("Neigh", Diet.HERBIVORE));
    }
}
