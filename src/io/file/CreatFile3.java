package io.file;

import java.io.File;
import java.io.IOException;

public class CreatFile3 {
    public static void main(String[] args) {
        
        /*
         * File(String parent, String child)  
         * ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
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
