package Group1Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<BankAccount.Memento> mementoList = new ArrayList<BankAccount.Memento>();

    public void add(BankAccount.Memento state){
        mementoList.add(state);
    }

    public BankAccount.Memento get(int index){
        return mementoList.get(index);
    }
}
