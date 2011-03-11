package ru.shusha.FileWork;

import java.io.*;
import java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 26.02.11
 * Time: 14:25
 * To change this template use File | Settings | File Templates.
 */
public class WriteFile {
    public String s;
    public static void main(String[] args) {
        try {
            FileOutputStream o = new FileOutputStream("/alexandra2.txt");
            String encoding = "UTF-8";
            OutputStreamWriter w = new OutputStreamWriter(o,encoding);
            BufferedWriter bw = new BufferedWriter(w);

            bw.write("new line");

//                  Scanner sc = new Scanner(System.in);
//                  sc.
//                  bw.write(sc.toString());
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
