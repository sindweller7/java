package controlflow;

public class If {

    /*
     * java���ṩ�����ֳ����ķ�֧�ṹ��if����switch��䣬����if���ʹ�ò������ʽ���߲���ֵ
     * ��Ϊ��֧���������з�֧���ƣ���switch��������ڶԶ������ֵ����ƥ�䣬�Ӷ�ʵ�ַ�֧���ơ�
     */
    public static void main(String[] args) {
        int age = 45;
        System.out.println("----------------�����if�߼�---------------");
        // ��δ���ᵼ�´�ӡ�Y���������ˣ�����ֵΪ������
        // if�ж�ֻ�����һ����֧�����Ա����򲻻��ӡ ������ ������
        if (age > 20) {
            System.out.println("������");
        } else if (age > 40) {
            System.out.println("������");
        } else if (age > 60) {
            System.out.println("������");
        }

        System.out.println("----------------��ȷ�ĵ�if�߼�---------------");
        /*
         * �������ȰѰ�����ΧС����������ǰ�洦����age>60��age>20��������������age>60��
         * ��Χ��С������Ӧ�����ȴ���age>60�������
         */
        if (age > 60) {
            System.out.println("������");
        } else if (age > 40) {
            System.out.println("������");
        } else if (age > 20) {
            System.out.println("������");
        }

        System.out.println("----------------ͨ����if�߼�---------------");
        /*
         * ������߼����Ǻܺ���⣬ͨ�����������ÿ��if�����ж�
         */
        if (age > 60) {
            System.out.println("������");
        } else if (age > 40 && age <= 60) {
            System.out.println("������");
        } else if (age > 20 && age <= 40) {
            System.out.println("������");
        } else {
            System.out.println("Сƨ��");
        }
    }

}
