package Group2Builder.Components;

public class Movement {

    int velocity;
    boolean flight;

    public Movement(int velocity, boolean flight) {
        this.velocity = velocity;
        this.flight = flight;
    }

    public void move(int distance) {
        System.out.println("Needs " + (distance / velocity) + " to get there");
    }

    public boolean canFly(){
        return flight;
    }
}
