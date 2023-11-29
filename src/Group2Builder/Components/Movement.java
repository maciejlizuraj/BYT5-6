package Group2Builder.Components;

public class Movement {

    private final int velocity;
    private final boolean flight;

    public Movement(int velocity, boolean flight) {
        this.velocity = velocity;
        this.flight = flight;
    }

    public int move(int distance) {
        return distance / velocity ;
    }

    public boolean canFly(){
        return flight;
    }
}
