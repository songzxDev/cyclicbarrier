/**   
* @Title: MySeventhThreadA.java 
* @Package cn.songzx.cyclicbarrier.seventh.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:14:25 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.seventh.extthread;

import cn.songzx.cyclicbarrier.seventh.service.MySeventhServiceA;

/**
 * @ClassName: MySeventhThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:14:25
 * 
 */
public class MySeventhThreadB extends Thread {
	private MySeventhServiceA service;

	/**
	 * @Date: 2017年11月12日下午2:14:47
	 * @Title: MySeventhThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
