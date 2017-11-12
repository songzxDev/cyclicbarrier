/**   
* @Title: MySixthRunA.java 
* @Package cn.songzx.cyclicbarrier.sixth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:04:09 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.sixth.test;

import cn.songzx.cyclicbarrier.sixth.extthread.MySixthThreadA;
import cn.songzx.cyclicbarrier.sixth.extthread.MySixthThreadB;
import cn.songzx.cyclicbarrier.sixth.service.MySixthServiceA;

/**
 * @ClassName: MySixthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:04:09
 * 
 */
public class MySixthRunA {

	/**
	 * @Date: 2017��11��12������2:04:09
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MySixthServiceA service = new MySixthServiceA();
		MySixthThreadA threadA = new MySixthThreadA(service);
		threadA.start();
		MySixthThreadB threadB = new MySixthThreadB(service);
		threadB.start();
	}

}
