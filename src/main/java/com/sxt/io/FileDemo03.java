package com.sxt.io;

import java.io.File;

/**
 * 名称或路径
 * getName()
 * getPath()  构建时是相对路径即返回相对，否则返回绝对
 * getAbsolutePath() 始终返回绝对路径
 * getParent() 如果上路径不存在，返回空
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File src = new File("G:\\ideaProject\\HelloWorld\\src\\icebear.jpg");

        System.out.println("名称:"+src.getName());
        System.out.println("路径："+src.getPath());
        System.out.println("绝对路径："+src.getAbsolutePath());
        System.out.println("父路径："+src.getParent());
        System.out.println("父对象："+src.getParentFile());

    }
}
