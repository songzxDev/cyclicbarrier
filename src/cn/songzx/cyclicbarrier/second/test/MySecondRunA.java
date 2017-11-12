/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.cyclicbarrier.second.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:32:05 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.second.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.second.extthread.MySecondThreadA;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����12:32:05
 * 
 */
public class MySecondRunA {

	/**
	 * @Date: 2017��11��12������12:32:05
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			// ����1������̸߳�����parties������ͬ�����̵߳ĸ�������parties�ĸ������ܷ����������أ�
			CyclicBarrier cbRef = new CyclicBarrier(2, new Runnable() {
				public void run() {
					System.out.println("ȫ���ˣ�");
				}
			});
			for (int i = 0; i < 4; i++) {
				/*
				 * ������Ч���Ͽ�������ʵ�ַ�������
				 * 
				 * Thread-0 begin =1510461266385 �ȴ����������������У�
				 * 
				 * Thread-1 begin =1510461268397 �ȴ����������������У�
				 * 
				 * ȫ���ˣ�
				 * 
				 * Thread-1 end =1510461268397 �Ѿ����������������У�
				 * 
				 * Thread-0 end =1510461268397 �Ѿ����������������У�
				 * 
				 * Thread-2 begin =1510461270411 �ȴ����������������У�
				 * 
				 * Thread-3 begin =1510461272424 �ȴ����������������У�
				 * 
				 * ȫ���ˣ�
				 * 
				 * Thread-3 end =1510461272424 �Ѿ����������������У�
				 * 
				 * Thread-2 end =1510461272424 �Ѿ����������������У�
				 */
				MySecondThreadA threadA = new MySecondThreadA(cbRef);
				threadA.start();
				Thread.sleep(2000L);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
