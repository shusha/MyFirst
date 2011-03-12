package ru.shusha.littleGame;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: user
 * Date: 12.03.11
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 */
public class Road implements RoadInterface {
    private List<TownInterface> towns;
    private String roadName;

    public String getName() {
  return this.roadName;
    }

    public void setName(String roadName) {
       this.roadName=roadName;

    }
      /**
       * Получает город, находящийся на втором конце дороги
       * @param t город, в котором находимся
       */
    public TownInterface getAnotherPoint(TownInterface t) {
         towns.set(1,t);
       return  towns.get(2);


    }
     /**
      * Добавляет город, в который можно прийти по этой дороге
      * @param t город, который добавится к дороге
      */
    public void addTown(TownInterface t) throws TooManyTowns {
        if (towns.size() == 2) {
            throw new TooManyTowns("too many towns!");
        } else {
            towns.add(t);
        }
    }




}
