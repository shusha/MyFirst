package ru.shusha.firstProgram;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 08.02.11
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
public class Money {
    private int nominal;

    public Money() {
        this.nominal = 10;
    }

    public Money(int nominal) {

        this.nominal = nominal;

    }

    public String getMessage() {
        return "Денежка " + this.nominal;
    }

}
