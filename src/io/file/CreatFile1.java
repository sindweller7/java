package io.file;

import java.io.File;
import java.io.IOException;

public class CreatFile1 {
    public static void main(String[] args) {
        /*
         * File(String pathname) 
         * 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
         */
        File file = new File("E:/Workspaces/1.txt");
        try {
            System.out.println(file.createNewFile());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
