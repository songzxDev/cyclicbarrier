/**   
* @Title: MyFirstRun.java 
* @Package cn.songzx.cyclicbarrier.first.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:20:57 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.first.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.first.extthread.MyFirstThreadA;

/**
 * @ClassName: MyFirstRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����12:20:57
 * 
 */
public class MyFirstRun {

	/**
	 * @Date: 2017��11��12������12:20:57
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		/*
		 * �������Ϊ5����partiesͬ���ߣ�Ҳ����5���̶߳�ִ����cbRef�����await()���������ſ��Լ���
		 * �������У�������Щ�̱߳˴˻���ȴ���һֱ������״̬��
		 */
		CyclicBarrier cbRef = new CyclicBarrier(5, new Runnable() {
			public void run() {
				System.out.println("ȫ�������ˣ�");
			}
		});

		MyFirstThreadA[] threadArray = new MyFirstThreadA[5];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyFirstThreadA(cbRef);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
	}

}
