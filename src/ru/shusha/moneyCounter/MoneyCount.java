package ru.shusha.moneyCounter;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 12.02.11
 * Time: 12:51
 * To change this template use File | Settings | File Templates.
 */
public class MoneyCount {

    public static void main(String[] args) {
        Bag bigBag = new Bag();
        Money m1 = new Money();
        Money m2 = new Money(500);
        Money m3 = new Money(1000);
        System.out.println(bigBag.isEmpty());
        bigBag.addMoney(m1);
        bigBag.addMoney(m2);
        bigBag.addMoney(m3);
        System.out.println(bigBag.isEmpty());
        System.out.println(bigBag.getTotal());
        bigBag.removeMoney(500);
        System.out.println(bigBag.getTotal());
    }
}
