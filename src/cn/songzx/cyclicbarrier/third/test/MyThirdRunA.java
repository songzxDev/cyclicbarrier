/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.cyclicbarrier.third.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:42:07 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.third.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.third.extthread.MyThirdThreadA;

/**
 * @ClassName: MyThirdRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����12:42:07
 * 
 */
public class MyThirdRunA {

	/**
	 * @Date: 2017��11��12������12:42:07
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		CyclicBarrier cbRef = new CyclicBarrier(3);

		try {
			MyThirdThreadA threadA = new MyThirdThreadA(cbRef);
			threadA.start();
			Thread.sleep(500L);
			// ��CyclicBarrier�������������ԣ���parties��ֵ��������Ϊ0
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			MyThirdThreadA threadB = new MyThirdThreadA(cbRef);
			threadB.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			MyThirdThreadA threadC = new MyThirdThreadA(cbRef);
			threadC.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			MyThirdThreadA threadD = new MyThirdThreadA(cbRef);
			threadD.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			MyThirdThreadA threadE = new MyThirdThreadA(cbRef);
			threadE.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
