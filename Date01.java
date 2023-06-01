package com.hspedu.date_;



import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println("当前日期=" + d1);
        Date d2 = new Date(9234567);
        System.out.println("d2=" + d2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期=" + format);

        String s = "1996年01月01日 10:20:30 星期一";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        Date parse = sdf2.parse(s);
        System.out.println("parse=" + parse);
    }
}


