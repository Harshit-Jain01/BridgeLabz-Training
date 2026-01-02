package com.day1.ewallet;

public class BusinessWallet extends Wallet {

    public BusinessWallet() {
        super();
    }

    public BusinessWallet(double bonus) {
        super(bonus);
    }

    @Override
    public double getTransferLimit() {
        return 50000;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02; // 2% tax
        double total = amount + tax;

        if (total > getTransferLimit()) {
            System.out.println("Transfer limit exceeded (Business Wallet)");
            return;
        }

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            history.add(new Transaction("Business", receiver.getName(), amount));
            System.out.println("Transfer successful with tax: ₹" + tax);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
