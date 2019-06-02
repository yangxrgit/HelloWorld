package com.sxt.io;

import java.io.File;
import java.io.IOException;

/**
 * 其他信息
 * createNewFile()  ：不存在才创建；
 * delete() ：删除已经存在的文件
 */
public class FileDemo06 {
    public static void main(String[] args) throws IOException {

        File src = new File("G:/ideaProject/HelloWorld/src/io.txt");
        boolean flag = src.createNewFile();
        System.out.println(flag);

        System.out.println("-----------------");

        //不能创建文件夹
        src = new File("G:/ideaProject/HelloWorld/src/aaa"); //只是创建了一个没有后缀名的文件，不是文件夹
        flag = src.createNewFile();
        System.out.println(flag);

        flag = src.delete();
        System.out.println(flag);

        //补充：con con3...操作系统的设备名，不能正确创建
        src = new File("G:/ideaProject/HelloWorld/src/con");
        src.createNewFile();
    }
}
