/**   
* @Title: MyFifthThreadB.java 
* @Package cn.songzx.cyclicbarrier.fifth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����1:39:44 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.extthread;

import cn.songzx.cyclicbarrier.fifth.service.MyFifthServiceB;

/**
 * @ClassName: MyFifthThreadB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����1:39:44
 * 
 */
public class MyFifthThreadB extends Thread {

	private MyFifthServiceB service;

	/**
	 * @Date: 2017��11��12������1:40:02
	 * @Title: MyFifthThreadB.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyFifthThreadB(MyFifthServiceB service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testB();
	}
}
