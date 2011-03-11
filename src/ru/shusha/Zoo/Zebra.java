package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 19.02.11
 * Time: 16:46
 * To change this template use File | Settings | File Templates.
 */
public class Zebra implements AnimalInterface {
    public static String DEFAULT_NAME = ZooNameProperties.DEFAULT_ZEBRA_NAME;
    public String food[] = {"hay"};
    public int count;

    public void foodIn() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void foodIn(FoodInterface f) {

        if (f.getName().equals(this.food)) {
            System.out.println("I eaten" + f.getCount() + "" + f.getName() + ". Very tasty");
        } else {
            System.out.println("I eat only" + this.food);

        }
    }

    public String getName() {
        return DEFAULT_NAME;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void beEaten() {
        System.out.println(this.getCount() + "zebra(s) were eaten");
    }

     public String getMenu() {

        StringBuffer menu = new StringBuffer();

        for (String s:food){
            menu.append(s+" ");
        }

        return menu.toString();  //To change body of implemented methods use File | Settings | File Templates.
    }
}

