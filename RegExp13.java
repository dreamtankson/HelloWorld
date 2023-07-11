package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExp13 {
    public static void main(String[] args) {
        String content = "我....我要....学学学学....编程java!";

        //1. 去掉所有的.

        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");


        content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");

        System.out.println("content=" + content);

    }
}
