/**   
* @Title: MySeventhThreadA.java 
* @Package cn.songzx.cyclicbarrier.seventh.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:14:25 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.seventh.extthread;

import cn.songzx.cyclicbarrier.seventh.service.MySeventhServiceA;

/**
 * @ClassName: MySeventhThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:14:25
 * 
 */
public class MySeventhThreadB extends Thread {
	private MySeventhServiceA service;

	/**
	 * @Date: 2017��11��12������2:14:47
	 * @Title: MySeventhThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MySeventhThreadB(MySeventhServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}
}
