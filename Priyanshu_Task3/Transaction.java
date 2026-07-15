import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private final String type;
    private final double amount;
    private final double postBalance;

    public Transaction(String type, double amount, double postBalance) {
        this.type = type;
        this.amount = amount;
        this.postBalance = postBalance;
    }

    @Override
    public String toString() {
        return String.format("[%s] Amount: ₹%.2f | Balance: ₹%.2f", type, amount, postBalance);
    }
}
