package com.sxt.io;

import java.io.File;

/**
 * 其他信息
 * length() ：字节数 返回文件长度
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File src = new File("G:/ideaProject/HelloWorld/src/icebear.jpg");
        System.out.println("长度："+src.length());

        //文件不存在
        src = new File("G:/ideaProject/HelloWorld/src/panda.jpg");
        System.out.println("长度："+src.length());

        //是文件夹
        src = new File("G:/ideaProject/HelloWorld/src");
        System.out.println("长度："+src.length());

    }
}
