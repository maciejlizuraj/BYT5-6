package Group1Calculator;

public class SubtractHandler implements MyHandler {

    MyHandler successor;

    public SubtractHandler(MyHandler successor) {
        this.successor = successor;
    }

    @Override
    public double handleRequest(double first, double second, MyOperation myOperation) {
        if (myOperation == MyOperation.SUBTRACT){
            return first - second;
        }
        return successor.handleRequest(first, second, myOperation);
    }
}
