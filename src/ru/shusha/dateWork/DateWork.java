package ru.shusha.dateWork;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 10.03.11
 * Time: 20:22
 * To change this template use File | Settings | File Templates.
 */
public class DateWork {
    public static void main(String[] args) {
    /**
        Date d = new Date();
        System.out.println(d.getTime());

   Calendar c = new GregorianCalendar();
        System.out.println(c.getTime());

        Format f = DateFormat.getDateInstance();
        System.out.println(f.format(d));

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(sdf.format(c.getTime()));*/

        List<String> list = new ArrayList<String>();
        list.add("Monday");
        list.add("Sunday");
        list.add("Saturday");
        System.out.println(list.size());
        Iterator i = list.iterator();
      //  System.out.println(i.next());
        //   System.out.println(i.next());
         // System.out.println(i.next());
        //  System.out.println(i.next());

        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("one", "Friday");
        hm.put("two", "Thursday");
        hm.put("three","Wensday");
        System.out.println( hm.get("one"));
    }
}
