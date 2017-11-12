/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.cyclicbarrier.forth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����1:00:39 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.forth.extthread;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����1:00:39
 * 
 */
public class MyForthRunA {

	/**
	 * @Date: 2017��11��12������1:00:39
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		/*
		 * ��CyclicBarrier��partiesֵ��1��2��Ȼ���ٻָ���0�Ĺ��̣�֤��CyclicBarrier������ϵ��ǿ��Ը��õ�
		 * �߳�ABCDÿ����һ�����ϵ�ʱ������п���ʱ����ģ��п���A��B�����һ���ϣ�������ڶ�����ʱ�����ȴ��A��D��
		 * ��Ϊ�߳�A��D��sleep(long l)ֵ��С��Ҳ����sleep(long l)��ʱ���ٵĻ�����ϣ���������һ�������н���
		 */
		CyclicBarrier cbRef = new CyclicBarrier(2);

		MyForthServiceA service = new MyForthServiceA(cbRef);

		MyForthThreadA threadA = new MyForthThreadA(service);
		threadA.setName("ThreadA");
		threadA.start();

		MyForthThreadA threadB = new MyForthThreadA(service);
		threadB.setName("ThreadB");
		threadB.start();

		MyForthThreadA threadC = new MyForthThreadA(service);
		threadC.setName("ThreadC");
		threadC.start();

		MyForthThreadA threadD = new MyForthThreadA(service);
		threadD.setName("ThreadD");
		threadD.start();

	}

}
