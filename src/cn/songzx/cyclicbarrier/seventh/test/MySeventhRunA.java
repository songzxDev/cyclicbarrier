/**   
* @Title: MySeventhRunA.java 
* @Package cn.songzx.cyclicbarrier.seventh.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:15:49 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.seventh.test;

import cn.songzx.cyclicbarrier.seventh.extthread.MySeventhThreadA;
import cn.songzx.cyclicbarrier.seventh.extthread.MySeventhThreadB;
import cn.songzx.cyclicbarrier.seventh.extthread.MySeventhThreadC;
import cn.songzx.cyclicbarrier.seventh.service.MySeventhServiceA;

/**
 * @ClassName: MySeventhRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:15:49
 * 
 */
public class MySeventhRunA {

	/**
	 * @Date: 2017��11��12������2:15:49
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MySeventhServiceA service = new MySeventhServiceA();
			MySeventhThreadA threadA = new MySeventhThreadA(service);
			threadA.setName("A");
			threadA.start();

			MySeventhThreadB threadB = new MySeventhThreadB(service);
			threadB.setName("B");
			threadB.start();

			MySeventhThreadC threadC = new MySeventhThreadC(service);
			threadC.setName("C");
			threadC.start();

			Thread.sleep(2000L);
			// ����getParties()��������ȡ��parties�ĸ���
			System.out.println("���϶����parties����Ϊ��" + service.cyclicBarrier.getParties());
			// ����getNumberWaiting()���������м����߳��Ѿ��������ϵ�
			System.out.println("�����ϴ��ȴ����̸߳���Ϊ��" + service.cyclicBarrier.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
