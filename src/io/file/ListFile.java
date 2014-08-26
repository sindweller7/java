package io.file;

import java.io.File;

public class ListFile
{
    public static void main(String[] args)
    {
        /*
         *  String[] list() 
         *  返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。 
         */
        File file = new File("E:/Workspaces");
        String[] names = file.list();
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("-----------------------------------");
        /*
         *  File[] listFiles() 
         *  返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
         */
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f.getName());
            System.out.println(f.getParent());
        }
    }
}
