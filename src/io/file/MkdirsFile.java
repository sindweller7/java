package io.file;

import java.io.File;
import java.io.IOException;

public class MkdirsFile {
    public static void main(String[] args) {
        /*
         * boolean mkdirs() 
         *  �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼�� 
         */
        File file = new File("E:/Workspaces/a/b/c");
        
        System.out.println(file.mkdirs());
        
        System.out.println(file.isFile());
        
        System.out.println(file.isDirectory());
    }

}
