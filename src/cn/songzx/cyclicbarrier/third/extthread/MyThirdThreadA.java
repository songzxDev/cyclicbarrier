/**   
* @Title: MyThirdThreadA.java 
* @Package cn.songzx.cyclicbarrier.third.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:40:01 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.third.extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/** 
* @ClassName: MyThirdThreadA 
* @Description: TODO(������һ�仰��������������) 
* @author Songzx songzx_2326@163.com 
* @date 2017��11��12�� ����12:40:01 
*  
*/
public class MyThirdThreadA extends Thread {
	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017��11��12������12:40:33
	 * @Title: MyThirdThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param cbRef
	 */
	public MyThirdThreadA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}
	
	public void run() {
		try {
			cbRef.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
