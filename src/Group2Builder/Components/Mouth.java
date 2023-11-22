package Group2Builder.Components;

import Group2Builder.Diet;

public class Mouth {

    String sound;
    Diet diet;

    public Mouth(String sound, Diet diet) {
        this.sound = sound;
        this.diet = diet;
    }

    public boolean eat(Diet food){
        if (diet==Diet.OMNIVORE){
            return true;
        }else return diet == food;
    }

    public void makeSound(){
        System.out.println("\""+sound+"\"");
    }
}
