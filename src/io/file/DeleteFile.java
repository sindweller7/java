package io.file;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        /*
         *  boolean delete() 
         *  ɾ���˳���·������ʾ���ļ���Ŀ¼��
         */
        File file = new File("E:/Workspaces/a/b/c/1.txt");
        
        System.out.println(file.createNewFile());
        
        System.out.println(file.delete());
    }

}
