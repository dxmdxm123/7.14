package com.du.lianxi02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 *
 */
public class Text02 {
    public static void main(String[] args) {
        Date date=new Date();
        String partten="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat();
        String aaa = sdf.format(date);
        System.out.println("aaa = " + aaa);

    }

}
