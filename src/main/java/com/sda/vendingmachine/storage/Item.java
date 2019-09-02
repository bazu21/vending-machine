package com.sda.vendingmachine.storage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data                   ///pt gettere si setare
@AllArgsConstructor      // constructor,hashcode
@NoArgsConstructor

public class Item {

    private int id;
    private String name;
    private BigDecimal price;//clasa "bigdecimal" repr nr reale(cu zecimale)
}
