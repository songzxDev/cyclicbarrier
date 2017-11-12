/**   
* @Title: MyFifthRunA.java 
* @Package cn.songzx.cyclicbarrier.fifth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����1:20:55 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.fifth.extthread.MyFifthThreadA;
import cn.songzx.cyclicbarrier.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthRunA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����1:20:55
 * 
 */
public class MyFifthRunA {

	/**
	 * @Date: 2017��11��12������1:20:55
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		int parties = 4;
		CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
			public void run() {
				System.out.println("�����ˣ�");
			}
		});

		MyFifthServiceA service = new MyFifthServiceA(cbRef);
		
		MyFifthThreadA[] threadArray = new MyFifthThreadA[parties];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyFifthThreadA(service);
			threadArray[i].start();
		}
		
	}

}
