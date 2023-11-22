package Group1Calculator;

public class DivideHandler implements MyHandler{

    MyHandler successor;

    public DivideHandler(MyHandler successor) {
        this.successor = successor;
    }

    @Override
    public double handleRequest(double first, double second, MyOperation myOperation) {
        if (myOperation == MyOperation.DIVIDE){
            return first / second;
        }
        return successor.handleRequest(first, second, myOperation);
    }
}
