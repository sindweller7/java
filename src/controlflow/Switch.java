package controlflow;

public class Switch {

    public static void main(String[] args) {
        char score1 ='B';
        /*
         * ��if��䲻ͬ���ǣ�switch����и�case��ǩ������Ŀ�ʼ��ͽ����㶼�ǳ������������ȫ����ʡ��case������Ļ����š�
         */
        switch(score1){
        case 'A':
            System.out.println("����");
            break;
        case 'B':
            System.out.println("����");
            break;
        case 'C':
            System.out.println("������");
            break;
        default:
            System.out.println("�ɼ��������");
        }
        
        System.out.println("--------------------û��break��Ч��-----------------------");
        /*
         * swicth���������expression���ʽ��ֵ��Ȼ�������ֵ��cast��ǩ���ֵ�Ƚϣ�һ��������ȵ�ֵ��
         * ����Ϳ�ʼִ�����case��ǩ��Ĵ��룬�����ж������case��default��ǩ�������Ƿ�ƥ�䣬��������break;�Ż������
         */
        char score2 ='B';
        switch (score2) {
        case 'A':
            System.out.println("����");
        case 'B':
            System.out.println("����");
        case 'C':
            System.out.println("������");
        default:
            System.out.println("�ɼ��������");
        }
        
        System.out.println("------------------expressionΪstring����--------------------");
        String season = "����";
        /*
         * Java7��ǿ��switch���Ĺ��ܣ�����switch���Ŀ��Ʊ��ʽ��java.lang.String���͵ı�������ʽ--ֻ����
         * java .lang.String���ͣ�������StringBuffer��StringBuilder�������ַ������͡�
         */
        switch (season) {
        case "����":
            System.out.println("��ů����.");
            break;
        case "����":
            System.out.println("��������.");
            break;
        case "����":
            System.out.println("�����ˬ.");
            break;
        case "����":
            System.out.println("��ѩ����.");
            break;
        default:
            System.out.println("�����������");
        }

    }

}
