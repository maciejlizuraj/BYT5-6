package Group2Builder;

import Group2Builder.Components.Mouth;
import Group2Builder.Components.Movement;

public class Manual {
    private final String name;
    private final Movement movement;
    private final Mouth mouth;

    public Manual(String name,Movement movement, Mouth mouth) {
        this.name = name;
        this.movement = movement;
        this.mouth = mouth;
    }

    public String print() {
        StringBuilder info = new StringBuilder("Manual for ");
        info.append(name).append(":\n");
        if (movement != null) {
            info.append("Can move 100m in: ").append(movement.move(100)).append("s.\n");
            if (movement.canFly()){
                info.append("Can fly.\n");
            }else {
                info.append("Can't fly.\n");
            }
        }
        if (mouth!=null){
            if (mouth.eat(Diet.HERBIVORE)){
                info.append("Can eat plants.\n");
            }if (mouth.eat(Diet.CARNIVORE)){
                info.append("Can eat meat.\n");
            }
            info.append("Makes sound: \"").append(mouth.makeSound()).append("\".\n");
        }

        return info.toString();
    }
}
