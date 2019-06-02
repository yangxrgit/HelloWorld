package com.sxt.io;

import java.io.File;

public class PathDemo01 {

    /**
     *  \ 名称分隔符 separator
     * @param args
     */

    public static void main(String[] args) {
        String  path = "G:\\ideaProject\\HelloWorld\\src\\icebear.jpg";
        System.out.println(File.separator);

        //建议
        //1. /
        path = "G:/ideaProject/HelloWorld/src/icebear.jpg";
        System.out.println(path);
        //2.常量拼接
        path = "G:"+File.separator+"ideaProject"+File.separator+"HelloWorld"+File.separator+"src"+File.separator+"icebear.jpg";
        System.out.println(path);
    }
}
