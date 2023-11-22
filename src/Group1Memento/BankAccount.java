package Group1Memento;

public class BankAccount {

    private double bankBalance;

    public BankAccount(){
        bankBalance = 0;
    }

    public void getMoneyTransfer(float transfer){
        bankBalance += transfer;
    }

    public void sendMoneyTransfer(float transfer){
        bankBalance -= transfer;
    }

    public Memento saveToMemento() {
        return new Memento(this.bankBalance);
    }

    public void printBalance(){
        System.out.println("The balance is: " + bankBalance);
    }

    public void restoreFromMemento(Memento memento) {
        this.bankBalance = memento.getSavedState();
    }

    public static class Memento {
        private final double state;

        public Memento(double bankBalance) {
            state = bankBalance;
        }

        private double getSavedState() {
            return state;
        }
    }
}