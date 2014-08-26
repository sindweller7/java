package io.file;

import java.io.File;
import java.io.IOException;

public class CreatFile2 {
    public static void main(String[] args) {
        
        /*
         * File(File parent, String child) 
         * 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
         */
        File file1 = new File("E:/Workspaces");
        File file2 = new File(file1,"1.txt");
        try {
            System.out.println(file2.createNewFile());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
