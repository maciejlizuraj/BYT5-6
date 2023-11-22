package Group2Builder;

import Group2Builder.Components.Movement;
import Group2Builder.Components.Mouth;

public class Director {

    public void constructCat(Builder builder){
        builder.setMovement(new Movement(48, false));
        builder.setMouth(new Mouth("Meow",Diet.CARNIVORE));
    }

    public void constructHorse(Builder builder){
        builder.setMovement(new Movement(71, false));
        builder.setMouth(new Mouth("Meow",Diet.HERBIVORE));
    }
}
