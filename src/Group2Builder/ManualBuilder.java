package Group2Builder;

import Group2Builder.Components.Mouth;
import Group2Builder.Components.Movement;

public class ManualBuilder implements Builder {
    private String name;
    private Movement movement;
    private Mouth mouth;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    @Override
    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }

    public Manual getResult(){
        return new Manual(name, movement, mouth);
    }
}
