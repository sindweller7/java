package io.file;

import java.io.File;
import java.io.IOException;

public class CreatFile2 {
    public static void main(String[] args) {
        
        /*
         * File(File parent, String child) 
         * ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
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
