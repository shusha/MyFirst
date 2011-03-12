package ru.shusha.littleGame;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: user
 * Date: 12.03.11
 * Time: 17:59
 * To change this template use File | Settings | File Templates.
 */
public interface TownInterface {
        public String getName();
    public void setName(String s);

    public List<RoadInterface> getRoadList();
    public void addRoad(RoadInterface r);
}
