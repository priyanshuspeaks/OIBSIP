import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String userId;
    private final String pin;
    private double balance; 
    private final List<Transaction> history;

    public Account(String userId, String pin, double initialBalance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = initialBalance;
        this.history = new ArrayList<>();
        recordTransaction("INITIAL_DEPOSIT", initialBalance);
    }

    public boolean auth(String id, String inputPin) {
        return this.userId.equals(id) && this.pin.equals(inputPin);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            recordTransaction("DEPOSIT", amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            recordTransaction("WITHDRAW", amount);
            return true;
        }
        return false;
    }

    public boolean transfer(Account target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
            return true;
        }
        return false;
    }

    public void printHistory() {
        if (history.isEmpty()) System.out.println("No records.");
        else history.forEach(System.out::println);
    }

    private void recordTransaction(String type, double amount) {
        history.add(new Transaction(type, amount, this.balance));
    }
}
