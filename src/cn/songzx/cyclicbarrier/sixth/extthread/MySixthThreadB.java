/**   
* @Title: MySixthThreadA.java 
* @Package cn.songzx.cyclicbarrier.sixth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:02:36 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.sixth.extthread;

import cn.songzx.cyclicbarrier.sixth.service.MySixthServiceA;

/**
 * @ClassName: MySixthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:02:36
 * 
 */
public class MySixthThreadB extends Thread {
	private MySixthServiceA service;

	/**
	 * @Date: 2017年11月12日下午2:03:07
	 * @Title: MySixthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MySixthThreadB(MySixthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}
}
