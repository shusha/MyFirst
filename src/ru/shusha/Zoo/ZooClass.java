package ru.shusha.Zoo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author shusha
 * @version 0.1
 *          Date: 15.02.11
 *          Time: 20:28
 *          To change this template use File | Settings | File Templates.
 */
public class ZooClass {
    public static void main(String[] args) {
        ZooWorker Bob = new ZooWorker();
        Bob.setName("Bob");
        //Lion lion = new Lion();
      //  Mouse mouse = new Mouse();
     //   Cat cat = new Cat();
        //Bear bear = new Bear();
       // Hay hay = new Hay();
       // Zebra zebra = new Zebra();
       // mouse.setCount(5);
       // cat.setCount(10);
       // hay.setCount(11);
       // zebra.setCount(1);
        System.out.println(Bob.getClass());

      //  Bob.FeedOn(lion, hay);

        AnimalInterface a = new Bear();
        System.out.println(a.getClass());
    }
}
