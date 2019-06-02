package com.sxt.io;

import java.io.File;

public class FileDemo01 {
    /**
     * 构建File对象
     * @param args
     */
    public static void main(String[] args) {
        String path ="G:/ideaProject/HelloWorld/src/icebear.jpg";

        //1.构建File对象
        File src = new File(path);
        System.out.println(src.length());

        //2.构建File对象
        src = new File("G:/ideaProject/HelloWorld/src","icebear.jpg");
        src = new File("G:/ideaProject","/HelloWorld/src/icebear.jpg");
        System.out.println(src.length());

        //3.构建File对象
        src = new File(new File("G:/ideaProject/HelloWorld/src"),"icebear.jpg");
        System.out.println(src.length());
    }
}

