/**   
* @Title: MyEighthThreadA.java 
* @Package cn.songzx.cyclicbarrier.eighth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:28:20 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.eighth.extthread;

import cn.songzx.cyclicbarrier.eighth.service.MyEighthServiceA;

/**
 * @ClassName: MyEighthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:28:20
 * 
 */
public class MyEighthThreadC extends Thread {
	private MyEighthServiceA service;

	/**
	 * @Date: 2017年11月12日下午2:28:54
	 * @Title: MyEighthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
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
