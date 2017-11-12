/**   
* @Title: MyFifthRunB.java 
* @Package cn.songzx.cyclicbarrier.fifth.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����1:40:46 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.fifth.extthread.MyFifthThreadA;
import cn.songzx.cyclicbarrier.fifth.extthread.MyFifthThreadB;
import cn.songzx.cyclicbarrier.fifth.service.MyFifthServiceB;

/**
 * @ClassName: MyFifthRunB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����1:40:46
 * 
 */
public class MyFifthRunB {

	/**
	 * @Date: 2017��11��12������1:40:46
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

		MyFifthServiceB service = new MyFifthServiceB(cbRef);

		MyFifthThreadB[] threadArray = new MyFifthThreadB[parties];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyFifthThreadB(service);
			threadArray[i].start();
		}
	}

}
