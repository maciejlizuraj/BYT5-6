package Group1Calculator;

public class MultiplyHandler implements MyHandler{

    MyHandler successor;

    public MultiplyHandler(MyHandler successor) {
        this.successor = successor;
    }

    @Override
    public double handleRequest(double first, double second, MyOperation myOperation) {
        if (myOperation == MyOperation.MULTIPLY){
            return first * second;
        }
        return successor.handleRequest(first, second, myOperation);
    }
}
