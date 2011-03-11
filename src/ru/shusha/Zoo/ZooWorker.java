package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 19.02.11
 * Time: 16:26
 * To change this template use File | Settings | File Templates.
 */
public class ZooWorker {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void FeedOn(AnimalInterface a, FoodInterface b) {
        try {
            a.foodIn(b);
        } catch (NoEatableFoodEcxeption noEatableFoodEcxeption) {
            noEatableFoodEcxeption.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            System.out.println("We can't feed in "+a.getName()+"because he this amimal eats only"+ a.getMenu());
        }
        b.beEaten();
        System.out.println(this.getName() + "FeedOn" + a.getName() + b.getName() + b.getCount());

    }
}
