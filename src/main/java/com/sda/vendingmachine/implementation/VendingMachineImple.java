package com.sda.vendingmachine.implementation;

import com.sda.vendingmachine.bank.Coin;
import com.sda.vendingmachine.storage.Item;

import java.math.BigDecimal;
import java.util.Queue;

public class  VendingMachineImple implements IVendingMachine {

    public Item getItem(int productCode) {
        return null;
    }

    public void payItem(Queue<Coin> amountPayed) {

    }

    public Queue<Coin> getChange(BigDecimal amountExpected, BigDecimal amountReceived) {
        return null;
    }

    public void cancelRequest() {

    }
}
