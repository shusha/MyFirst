package ru.shusha.firstProgram;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 08.02.11
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleCenter {

    public static String s1 = "wewewewewewewewe";

    public static void main(String[] args) {
        System.out.println("эта программа запустилась!!!");
        System.out.println(s1);
        String s2 = "провокационная блузка";
        System.out.println(s2);


        Money m1 = new Money();
        System.out.println(m1.getMessage());

        Money m2 = new Money(500);
        System.out.println(m2.getMessage());


    }
}
