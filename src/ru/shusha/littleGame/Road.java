package ru.shusha.littleGame;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 10.03.11
 * Time: 21:47
 * To change this template use File | Settings | File Templates.
 */
//todo make the javadoc
public class Road implements RoadInterface {
    private List<TownInterface> towns;
    //todo create body
    public String getName() {

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setName(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public TownInterface getAnotherPoint(TownInterface t) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addTown(TownInterface t) throws TooManyTowns {
        if (towns.size() == 2) {
            throw new TooManyTowns("too many towns!");
        } else {
            towns.add(t);
        }
    }


}
