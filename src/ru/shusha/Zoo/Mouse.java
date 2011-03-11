package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 17.02.11
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
public class Mouse implements FoodInterface {
    public final static String NAME = ZooNameProperties.DEFAULT_MOUSE_NAME;

    private static int count;

    public void FoodIn(FoodInterface f) {
        System.out.println("No, thanks. I'm not hungry");

    }

    public String getName() {
        return NAME;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return (this.count);
    }

    public void beEaten() {
        System.out.println(this.getCount() + "mouse(s) were eaten");
    }
}