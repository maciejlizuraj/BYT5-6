package Group2Builder;

import Group2Builder.Components.Movement;
import Group2Builder.Components.Mouth;

public interface Builder {
    void setName(String name);
    void setMovement(Movement movement);
    void setMouth(Mouth mouth);
}
