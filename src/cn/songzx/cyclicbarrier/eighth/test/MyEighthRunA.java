/**   
* @Title: MyEighthRunA.java 
* @Package cn.songzx.cyclicbarrier.eighth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:29:44 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.eighth.test;

import cn.songzx.cyclicbarrier.eighth.extthread.MyEighthThreadA;
import cn.songzx.cyclicbarrier.eighth.extthread.MyEighthThreadB;
import cn.songzx.cyclicbarrier.eighth.service.MyEighthServiceA;

/**
 * @ClassName: MyEighthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:29:44
 * 
 */
public class MyEighthRunA {

	/**
	 * @Date: 2017��11��12������2:29:44
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		try {
			MyEighthServiceA service = new MyEighthServiceA();
			MyEighthThreadA threadA = new MyEighthThreadA(service);
			threadA.setName("ThreadA");
			MyEighthThreadB threadB = new MyEighthThreadB(service);
			threadB.setName("ThreadB");
			// �߳�Cδʵ����
			threadA.start();
			threadB.start();
			Thread.sleep(2000L);
			service.cyclicBarrier.reset();// reset()�������������������ϣ����ϱ����ú�2���̳߳������쳣
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
