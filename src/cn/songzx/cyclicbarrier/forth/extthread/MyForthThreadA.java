/**   
* @Title: MyForthThreadA.java 
* @Package cn.songzx.cyclicbarrier.forth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:59:29 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.forth.extthread;

import cn.songzx.cyclicbarrier.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����12:59:29
 * 
 */
public class MyForthThreadA extends Thread {
	private MyForthServiceA service;

	/**
	 * @Date: 2017��11��12������12:59:50
	 * @Title: MyForthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyForthThreadA(MyForthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.beginRun();
	}
}
