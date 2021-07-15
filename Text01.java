package com.du.lianxi02;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间

 */

public class Text01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);//输出
        long time = date.getTime(); //获得 真实时间
        time=time+1000*60*60*24*3L;  //查看三天后
        date.setTime(time);
        System.out.println("date = " + date);

    }
}

