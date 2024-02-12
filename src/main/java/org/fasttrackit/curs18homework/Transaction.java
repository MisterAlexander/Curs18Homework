package org.fasttrackit.curs18homework;//x


import lombok.Data;
@Data
public class Transaction {
    private long id;
    private String product;
    private TransactionType type;
    private double amount;
}
