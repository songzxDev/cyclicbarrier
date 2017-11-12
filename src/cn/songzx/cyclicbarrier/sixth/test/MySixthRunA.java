/**   
* @Title: MySixthRunA.java 
* @Package cn.songzx.cyclicbarrier.sixth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:04:09 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.sixth.test;

import cn.songzx.cyclicbarrier.sixth.extthread.MySixthThreadA;
import cn.songzx.cyclicbarrier.sixth.extthread.MySixthThreadB;
import cn.songzx.cyclicbarrier.sixth.service.MySixthServiceA;

/**
 * @ClassName: MySixthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:04:09
 * 
 */
public class MySixthRunA {

	/**
	 * @Date: 2017年11月12日下午2:04:09
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MySixthServiceA service = new MySixthServiceA();
		MySixthThreadA threadA = new MySixthThreadA(service);
		threadA.start();
		MySixthThreadB threadB = new MySixthThreadB(service);
		threadB.start();
	}

}
