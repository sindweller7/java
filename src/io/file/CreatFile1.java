package io.file;

import java.io.File;
import java.io.IOException;

public class CreatFile1 {
    public static void main(String[] args) {
        /*
         * File(String pathname) 
         * ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
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
