package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regexp_ {
    public static void main(String[] args) {



        String content = "私有地址（Private address）属于非注册地址，专门为组织机构内部使用。\n" +
                "以下列出留用的内部私有地址\n" +
                "A类 10.0.0.0--10.255.255.255\n" +
                "B类 172.16.0.0--172.31.255.255\n" +
                "C类 192.168.0.0--192.168.255.255";



        Pattern pattern = Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+");

        int no = 0;
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {

            System.out.println("找到: " + (++no) + " " +matcher.group(0));
        }



    }
}
