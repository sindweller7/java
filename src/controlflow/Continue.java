package controlflow;

/*
 * continue �Ĺ��ܺ� break ���ƣ�������continueֻ��ֹ����ѭ�������ſ�ʼ��һ��ѭ������
 * break������ȫ��ֹѭ������
 */
public class Continue {

    public static void main(String[] args) {
        System.out.println("--------------һ���򵥵�forѭ��,ʹ��continue����������ѭ��--------------");
        for(int i = 0; i <= 10; i++){
            System.out.println("*****i�ĵ�" + i + "��ѭ��*****");
            if(i % 2 == 0){
                //iΪż��ʱ������ѭ��ʣ�µ���䲻�ᱻִ��
                continue;
            }
            System.out.println("continue���������䣬i = " + i);
        }
        
        System.out.println("--------------һ���򵥵�forѭ��,ʹ��continue����������ѭ��--------------");
        outer:
        /*
         * ���б�������Կ�����j��ֵ���޷�����1����Ϊÿ��j����1ʱ��continue outer���ͽ��������ѭ���ĵ���ѭ����ֱ�ӿ�ʼ
         * ��һ��ѭ�����ڴ�ѭ��û�л���ִ����ɡ�
         */
        for(int i = 0; i < 5; i++){
            System.out.println("*****i�ĵ�" + i + "��ѭ��*****");
            for(int j = 0; j < 3; j++){
                System.out.println("i = " + i + "; j = " + j);
                if(j == 1){
                    //jΪ1ʱ������outer���ѭ���ĵ���ѭ������ʼ��һ��ѭ��
                    continue outer;
                }
            }
        }

    }

}
