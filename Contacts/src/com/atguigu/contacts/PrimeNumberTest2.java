
package com.atguigu.contacts;

/*
10万以内所有质数的输出
方法二
质数：又称素数，只能被1和数字本身整除的数
说明：最小的质数是2，所以循环条件的范围应该是2到数字-1的范围，2 ~ n-1

对PrimeNumberTest.java代码的优化
*/
class PrimeNumberTest2
{
	public static void main(String[] args)
	{	

		int count = 0;  // 用来记录质数的个数

		long start = System.currentTimeMillis();  // 获取当前时间距离1970-1-1 00:00:00 的毫秒数(1秒/1000毫秒)
		
		label:  // 给外层循环设置一个标签
		for (int i = 2; i <= 100000; i++)  // 遍历10万以内的自然数，从2开始，因为2是最小的质数，不用计算，直接记录就行
		{
			for (int j = 2; j <= Math.sqrt(i); j++)  // j：i的被除数
			{
				if (i % j == 0)
				{
					continue label;
				}
				
			}
			
			// 能执行到此步骤的肯定都是质数，因为不是质数的执行到上面continue的时候就已经跳到下一次循环而不参与累加了
			count++;  // 质数数量累加

		}

		long end = System.currentTimeMillis();  // 获取当前时间距离1970-1-1 00:00:00 的毫秒数(1秒/1000毫秒)
		
		System.out.println("质数个数为：" + count);  // 无优化：23187毫秒=23秒，优化一：2714毫秒=2.7秒，优化二：24毫秒=0.024秒！
		System.out.println("耗费时间：" + (end - start));  // 无优化：29999毫秒=29.9秒，优化一break：5721毫秒=5.7秒，优化二利用根号与质数的关系：1214=1.2秒
		// 结论：输出操作也会影响到算法的运行耗时

	}
}
