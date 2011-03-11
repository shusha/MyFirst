package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 19.02.11
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class Bear implements AnimalInterface {
    public static String DEFAULT_NAME = ZooNameProperties.DEFAULT_BEAR_NAME;
    public String food[] = {"Zebra"};

    public String getName() {
        return this.DEFAULT_NAME;
    }

    public void foodIn() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void foodIn(FoodInterface f) {
        if (f.getName().equals(this.food)) {
            System.out.println("Bear had eaten " + f.getCount() + "" + f.getName());
        } else
            System.out.println("I eat only" + this.food);

    }
     public String getMenu() {

        StringBuffer menu = new StringBuffer();

        for (String s:food){
            menu.append(s+" ");
        }

        return menu.toString();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
