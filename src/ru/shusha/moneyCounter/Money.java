package ru.shusha.moneyCounter;

/**
 * This class is used to operating with money in program.
 *
 * @author shusha
 * @version 1
 *
 */
public class Money {
    private int nominal;

    public int getNominal() {
        return nominal;
    }

    public Money() {
        this.nominal=100;
    }

    public Money(int nominal) {
        this.nominal = nominal;
    }
}
