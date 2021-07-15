package com.du.lianxi02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。

 */
public class Text03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//格式化输出
        Scanner scanner = new Scanner(System.in);   //  新创建一个输入的Scanner对象，然后赋值给scanner
        System.out.println("请输出你的生日格式为:yyyy-MM-dd");
        String aaa = scanner.nextLine(); //  接s收
        if (aaa.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")) {// 正则表达式
                                                             // 时间格式的意思,\\d:表示匹配0-9的意思,{4}:表示四个数字,-:表示中间连接的字符是-
            Date dirs = sdf.parse(aaa); //parse成Date类型时间数据
            Date date = new Date();   //获得 真实时间
            long time = date.getTime() - dirs.getTime();
            long day = time / 1000 / 60 / 60 / 24;  //获取当前时间
            long week = day / 7; //时间戳转化时间和星期
            System.out.println("到今天经历了："+week+"周");
        }else{
            System.out.println("输入格式错误");
        }
    }
}
