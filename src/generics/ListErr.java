package generics;

import java.util.ArrayList;
import java.util.List;

public class ListErr {
    // ����ĳ���������ʱ�����ClassCastException�쳣����Ϊ������ͼ��һ��Integer����ת��ΪString���͡�
    @SuppressWarnings({ "unchecked", "rawtypes", "unused" })
    public static void main(String[] args) {
        // ����һ��ֻ�뱣���ַ�����List����
        List strList = new ArrayList();
        strList.add("Struts2Ȩ��ָ��");
        strList.add("����J2EE��Ajax����");
        strList.add("������J2EE��ҵӦ��ʵս");
        // ����С�ġ���һ��Integer���󡱶���"�˼���
        strList.add(5);
        for (int i = 0; i < strList.size(); i++) {
            // ��ΪList��ȡ����ȫ����Object�����Ա���ǿ������ת��
            // ���һ��Ԫ�ؽ�����ClassCastException�쳣
            String str = (String) strList.get(i);
        }
    }
}