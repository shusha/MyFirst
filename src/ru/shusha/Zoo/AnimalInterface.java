package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 15.02.11
 * Time: 20:50
 * To change this template use File | Settings | File Templates.
 */
public interface AnimalInterface {
    public void foodIn();

    public void foodIn(FoodInterface f) throws NoEatableFoodEcxeption;

    public String getName();

    public String getMenu();

}
