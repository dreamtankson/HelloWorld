package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExp10 {
    public static void main(String[] args) {
        String content = "13588889999";

        String regStr = "^1[3|4|5|8]\\d{9}$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

    }
}
