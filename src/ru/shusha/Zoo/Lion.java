package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 15.02.11
 * Time: 21:00
 * To change this template use File | Settings | File Templates.
 */
public class Lion extends CatAbstract {
    public static String DEFAULT_NAME = ZooNameProperties.DEFAULT_LION_NAME;
    String food[] = ZooNameProperties.DEFAULT_FOOD_FOR_LION;
    public boolean k;

    public void foodIn() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getName() {
        return this.DEFAULT_NAME;
    }

    public void FoodIn() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void foodIn(FoodInterface f) throws NoEatableFoodEcxeption {
        k=false;
        for (String s:food) {
            if (f.getName().equals(s)) {
                System.out.println("Lion had eaten " + f.getCount() + "" + f.getName());
                k = true;
            }
        }
        if (k == false) {


            throw new NoEatableFoodEcxeption("Junk food! Beee!!");


        }
        System.out.println();
    }

    public String getMenu() {

        StringBuffer menu = new StringBuffer();

        for (String s:food){
            menu.append(s+" ");
        }

        return menu.toString();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
