package io.file;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        /*
         *  boolean delete() 
         *  删除此抽象路径名表示的文件或目录。
         */
        File file = new File("E:/Workspaces/a/b/c/1.txt");
        
        System.out.println(file.createNewFile());
        
        System.out.println(file.delete());
    }

}
