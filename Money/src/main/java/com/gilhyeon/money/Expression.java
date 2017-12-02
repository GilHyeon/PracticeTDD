package com.gilhyeon.money;

public interface Expression {
    Money reduce(Bank bank, String to);
}
