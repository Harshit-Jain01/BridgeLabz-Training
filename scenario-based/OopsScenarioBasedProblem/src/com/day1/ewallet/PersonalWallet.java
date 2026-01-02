package com.day1.ewallet;

public class PersonalWallet extends Wallet {

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double bonus) {
        super(bonus);
    }

    @Override
    public double getTransferLimit() {
        return 10000;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > getTransferLimit()) {
            System.out.println("Transfer limit exceeded (Personal Wallet)");
            return;
        }

        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            history.add(new Transaction("Personal", receiver.getName(), amount));
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

