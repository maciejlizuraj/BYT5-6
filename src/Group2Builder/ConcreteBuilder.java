package Group2Builder;

import Group2Builder.Components.Movement;
import Group2Builder.Components.Mouth;

public class ConcreteBuilder implements Builder {
    private Movement movement;
    private Mouth mouth;


    @Override
    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    @Override
    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }

    public Animal getResult(){
        return new Animal(movement, mouth);
    }
}
