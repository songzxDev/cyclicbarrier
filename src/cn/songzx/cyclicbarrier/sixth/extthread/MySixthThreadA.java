/**   
* @Title: MySixthThreadA.java 
* @Package cn.songzx.cyclicbarrier.sixth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:02:36 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.sixth.extthread;

import cn.songzx.cyclicbarrier.sixth.service.MySixthServiceA;

/**
 * @ClassName: MySixthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:02:36
 * 
 */
public class MySixthThreadA extends Thread {
	private MySixthServiceA service;

	/**
	 * @Date: 2017��11��12������2:03:07
	 * @Title: MySixthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MySixthThreadA(MySixthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}
}
