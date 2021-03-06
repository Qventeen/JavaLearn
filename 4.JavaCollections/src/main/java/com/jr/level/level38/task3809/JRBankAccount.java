package com.jr.level.level38.task3809;

public class JRBankAccount {
    private String ownerName;

    @LongPositive
    private long amount;

    public JRBankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
