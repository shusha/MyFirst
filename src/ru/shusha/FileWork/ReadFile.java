package ru.shusha.FileWork;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: golodnyj
 * Date: 26.02.11
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("/alexandra.txt");
            String encoding = "UTF-8";
            InputStreamReader i = new InputStreamReader(f,encoding);
            BufferedReader br = new BufferedReader(i);


            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
