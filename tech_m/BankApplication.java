package tech_m;

import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store multiple bank accounts
        BankAccount[] accounts = new BankAccount[10]; // Assuming a maximum of 10 accounts
        int accountCount = 0;

        while (true) {
            System.out.println("\n--- Bank Application Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Create Account
                    if (accountCount < accounts.length) {
                        System.out.print("Enter Account Holder Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Initial Balance: ");
                        double initialBalance = scanner.nextDouble();
                        accounts[accountCount] = new BankAccount(name, accountCount + 1, initialBalance);
                        System.out.println("Account created successfully. Account Number: " + (accountCount + 1));
                        accountCount++;
                    } else {
                        System.out.println("Cannot create more accounts. Limit reached.");
                    }
                    break;

                case 2: // Deposit
                    System.out.print("Enter Account Number: ");
                    int depositAccountNumber = scanner.nextInt();
                    BankAccount depositAccount = findAccount(accounts, depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3: // Withdraw
                    System.out.print("Enter Account Number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    BankAccount withdrawAccount = findAccount(accounts, withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4: // Check Balance
                    System.out.print("Enter Account Number: ");
                    int balanceAccountNumber = scanner.nextInt();
                    BankAccount balanceAccount = findAccount(accounts, balanceAccountNumber);
                    if (balanceAccount != null) {
                        balanceAccount.checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Thank you for using the Bank Application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Helper method to find an account by account number
    private static BankAccount findAccount(BankAccount[] accounts, int accountNumber) {
        for (BankAccount account : accounts) {
            if (account != null && account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
