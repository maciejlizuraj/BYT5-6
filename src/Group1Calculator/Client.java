package Group1Calculator;

public class Client {

    public static void main(String[] args){

        DivideHandler divideHandler = new DivideHandler(null);
        MultiplyHandler multiplyHandler = new MultiplyHandler(divideHandler);
        SubtractHandler subtractHandler = new SubtractHandler(multiplyHandler);
        AddHandler addHandler = new AddHandler(subtractHandler);

        System.out.println(addHandler.handleRequest(6,4.8, MyOperation.MULTIPLY));

    }
}
