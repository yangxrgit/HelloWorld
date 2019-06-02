package com.sxt.io;

import java.io.File;

/**
 * 递归
 * 打印子孙级目录和文件的名称
 *
 */
public class DirDemo04 {
    public static void main(String[] args) {
        File src = new File("G:/ideaProject/HelloWorld");
        printName(src,0);
    }

    //打印子孙级目录和文件的名称
    public static void printName(File src,int deep){
        //控制前面的层次
        for (int i=0;i<deep;i++){
            System.out.print("-");
        }
        //打印名称
        System.out.println(src.getName());
        if (null==src||!src.exists()){//递归头
            return;
        }else if(src.isDirectory()) {//目录
            for (File s:src.listFiles()){
                printName(s,deep+1);//递归体
            }
        }

    }

}
