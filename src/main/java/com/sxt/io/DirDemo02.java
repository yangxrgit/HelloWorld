package com.sxt.io;

import java.io.File;

/**
 * 列出下一级
 * 1.list() 列出下级名称
 * 2.listFiles() 列出下级File对象
 */
public class DirDemo02 {
    public static void main(String[] args) {
        File dir = new File("G:/ideaProject/HelloWorld/src");

        //列出下级名称 list()
        String[] subsNames = dir.list();
        for (String s:subsNames){
            System.out.println(s);
        }

        //下级对象listFiles()
        File[] subFiles = dir.listFiles();
        for (File s:subFiles){
            System.out.println(s);
        }
        //列出所有的盘符 listRoots()
        File[] roots = dir.listRoots();
        for (File r:roots){
            System.out.println(r.getAbsolutePath());
        }
    }
}
