package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExp05 {
    public static void main(String[] args) {
        String content = "a211111aaaaaahello";


        String regStr = "a1?"; //匹配 a 或者 a1
        Pattern pattern = Pattern.compile(regStr/*, Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = pattern.matcher(content);


        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
