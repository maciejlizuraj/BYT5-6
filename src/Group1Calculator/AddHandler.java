package Group1Calculator;

public class AddHandler implements MyHandler {

    MyHandler successor;

    public AddHandler(MyHandler successor) {
        this.successor = successor;
    }

    @Override
    public double handleRequest(double first, double second, MyOperation myOperation) {
        if (myOperation == MyOperation.ADD){
            return first + second;
        }
        return successor.handleRequest(first, second, myOperation);
    }
}
