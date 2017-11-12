/**   
* @Title: MySecondThreadA.java 
* @Package cn.songzx.cyclicbarrier.second.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:28:46 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.second.extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MySecondThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����12:28:46
 * 
 */
public class MySecondThreadA extends Thread {
	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017��11��12������12:29:20
	 * @Title: MySecondThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param cbRef
	 */
	public MySecondThreadA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin =" + System.currentTimeMillis() + " �ȴ����������������У�");
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + "   end =" + System.currentTimeMillis() + " �Ѿ����������������У�");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}
