package ru.shusha.littleGame;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 10.03.11
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 */
public interface RoadInterface {

    public String getName();
    public void setName(String s);

    public TownInterface getAnotherPoint(TownInterface t);
    public  void addTown(TownInterface t) throws TooManyTowns;

}
