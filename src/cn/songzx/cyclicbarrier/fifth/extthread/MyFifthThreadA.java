/**   
* @Title: MyFifthThreadA.java 
* @Package cn.songzx.cyclicbarrier.fifth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午1:19:44 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.extthread;

import cn.songzx.cyclicbarrier.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午1:19:44
 * 
 */
public class MyFifthThreadA extends Thread {
	private MyFifthServiceA service;

	/**
	 * @Date: 2017年11月12日下午1:20:09
	 * @Title: MyFifthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
