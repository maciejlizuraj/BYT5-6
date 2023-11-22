package Group1Memento;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.printBalance();
        CareTaker careTaker = new CareTaker();
        bankAccount.getMoneyTransfer(400);
        bankAccount.printBalance();
        careTaker.add(bankAccount.saveToMemento());
        bankAccount.sendMoneyTransfer(200);
        bankAccount.printBalance();
        bankAccount.restoreFromMemento(careTaker.get(0));
        bankAccount.printBalance();
    }
}
