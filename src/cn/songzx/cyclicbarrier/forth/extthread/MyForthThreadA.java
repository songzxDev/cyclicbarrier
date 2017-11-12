/**   
* @Title: MyForthThreadA.java 
* @Package cn.songzx.cyclicbarrier.forth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:59:29 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.forth.extthread;

import cn.songzx.cyclicbarrier.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午12:59:29
 * 
 */
public class MyForthThreadA extends Thread {
	private MyForthServiceA service;

	/**
	 * @Date: 2017年11月12日下午12:59:50
	 * @Title: MyForthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
