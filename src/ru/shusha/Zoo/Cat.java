package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 15.02.11
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
public class Cat extends CatAbstract implements FoodInterface {
    private final static String NAME = ZooNameProperties.DEFAULT_CAT_NAME;

    public String food = "mouse";

    public String getName() {
        return NAME;
    }

    private int count;

    public void foodIn() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void foodIn(FoodInterface f) {
        if (f.getName().equals(this.food)) {
            System.out.println("Cat had eaten " + f.getCount() + "" + f.getName());
        } else System.out.println("I eat only" + this.food);

    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return (this.count);
    }

    public void beEaten() {

        System.out.println(this.count + " cats eaten");

    }

    public String getMenu() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
