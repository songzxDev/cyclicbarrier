/**   
* @Title: MyFifthThreadA.java 
* @Package cn.songzx.cyclicbarrier.fifth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����1:19:44 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.extthread;

import cn.songzx.cyclicbarrier.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����1:19:44
 * 
 */
public class MyFifthThreadA extends Thread {
	private MyFifthServiceA service;

	/**
	 * @Date: 2017��11��12������1:20:09
	 * @Title: MyFifthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyFifthThreadA(MyFifthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testA();
	}
}
