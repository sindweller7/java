package io.file;

import java.io.File;

public class ListFile
{
    public static void main(String[] args)
    {
        /*
         *  String[] list() 
         *  ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�� 
         */
        File file = new File("E:/Workspaces");
        String[] names = file.list();
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("-----------------------------------");
        /*
         *  File[] listFiles() 
         *  ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
         */
        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f.getName());
            System.out.println(f.getParent());
        }
    }
}
