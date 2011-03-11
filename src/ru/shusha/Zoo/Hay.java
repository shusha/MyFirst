package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 19.02.11
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 */
public class Hay implements PlantsInterface, FoodInterface {

    public static String DEFAULT_NAME = ZooNameProperties.DEFAULT_HAY_NAME;
    private int count;

    public String getName() {
        return DEFAULT_NAME;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void beEaten() {
        System.out.println(this.count + " hays were eaten");
    }

    public void growUp() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
