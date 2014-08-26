package io.file;

import java.io.File;
import java.io.IOException;

public class MkdirsFile {
    public static void main(String[] args) {
        /*
         * boolean mkdirs() 
         *  创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。 
         */
        File file = new File("E:/Workspaces/a/b/c");
        
        System.out.println(file.mkdirs());
        
        System.out.println(file.isFile());
        
        System.out.println(file.isDirectory());
    }

}
