/**   
* @Title: MyEighthThreadA.java 
* @Package cn.songzx.cyclicbarrier.eighth.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:28:20 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.eighth.extthread;

import cn.songzx.cyclicbarrier.eighth.service.MyEighthServiceA;

/**
 * @ClassName: MyEighthThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:28:20
 * 
 */
public class MyEighthThreadC extends Thread {
	private MyEighthServiceA service;

	/**
	 * @Date: 2017��11��12������2:28:54
	 * @Title: MyEighthThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param service
	 */
	public MyEighthThreadC(MyEighthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}

}
