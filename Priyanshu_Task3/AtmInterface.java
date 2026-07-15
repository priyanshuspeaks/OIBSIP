import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simulating Database Persistence in Heap
        Account currentUser = new Account("Priyanshu", "3400", 50000.00);
        Account dummyTarget = new Account("TargetUser", "0000", 0.0);

        System.out.println("=== SECURE ATM TERMINAL ===");
        System.out.print("User ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("PIN: ");
        String pin = scanner.nextLine().trim();

        if (!currentUser.auth(id, pin)) {
            System.out.println("[AUTH FAILED] Terminating process.");
            return;
        }

        boolean active = true;
        while (active) {
            System.out.println("\n1. History | 2. Withdraw | 3. Deposit | 4. Transfer | 5. Quit");
            System.out.print("Command: ");
            String cmd = scanner.nextLine().trim();

            try {
                switch (cmd) {
                    case "1" -> currentUser.printHistory();
                    case "2" -> {
                        System.out.print("Amount: ₹");
                        if (currentUser.withdraw(Double.parseDouble(scanner.nextLine()))) 
                            System.out.println("[SUCCESS] Dispensing cash.");
                        else System.out.println("[DENIED] Insufficient funds.");
                    }
                    case "3" -> {
                        System.out.print("Amount: ₹");
                        currentUser.deposit(Double.parseDouble(scanner.nextLine()));
                        System.out.println("[SUCCESS] Deposited.");
                    }
                    case "4" -> {
                        System.out.print("Amount: ₹");
                        if (currentUser.transfer(dummyTarget, Double.parseDouble(scanner.nextLine())))
                            System.out.println("[SUCCESS] Transferred to external route.");
                        else System.out.println("[DENIED] Insufficient funds.");
                    }
                    case "5" -> active = false;
                    default -> System.out.println("[ERROR] Invalid opcode.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Invalid numeric input.");
            }
        }
        System.out.println("Session terminated. Ejecting token.");
    }
}
