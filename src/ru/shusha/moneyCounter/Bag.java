package ru.shusha.moneyCounter;

/**
 * This class is used like money store.
 *
 * @author shusha
 * @version 1
 */
public class Bag {
    public boolean isEmpty() {
        return true;
    }

    public int getTotal() {
        return 0;
    }

    /**
     * THIS method adds money in the bag
     *
     * This is long description
     * @param money
     * @see Money
     */
    public void addMoney(Money money) {
        //todo тут будет добавление денег в кошелек
    }

    public Money removeMoney(int howMuchMoney) {
        //todo тут будет метод? который заберет денежки
        return null;
    }

    public Bag() {
    }
}
