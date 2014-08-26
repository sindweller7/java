package io.file;

import java.io.File;
import java.io.IOException;

public class CreatFile3 {
    public static void main(String[] args) {
        
        /*
         * File(String parent, String child)  
         * 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
         */
        File file = new File("E:/Workspaces","1.txt");
        try {
            System.out.println(file.createNewFile());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
