package com.yangyang.java;
/*
 * 
 * 5.数组元素的默认初始化值
 * 	a.数组元素是整型：默认值为0
 * 	b.数组元素是浮点型：默认值为0.0
 *  c.数组元素是char型：默认值为0，这个0是ASCII字符集中的0，不是'0'，所表示的字符是ASCII字符集中对应的字符
 *  d.数组元素是boolean型：默认值为false，因为在底层二进制中，false代表的是0
 *  
 *  e.数组元素是引用数据类型：默认值为null，意为空值，此处是关键字null，并不是字符串"null"
 * 
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		// 5.数组元素的默认初始化值
		int[] arr = new int[5];  // 动态初始化：指明长度不赋值
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------");
		
		double[] arr1 = new double[5];  // 动态初始化：指明长度不赋值
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("--------------------");
		
		char[] arr2 = new char[5];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("<<<" + arr2[i] + ">>>");  // 为了能看出效果，在前后加上一些字符串
		}
		System.out.println("--------------------");
		
		boolean[] arr3 = new boolean[5];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("--------------------");
		
		String[] arr4 = new String[5];
		for (int i = 0; i < arr4.length; i++) {
			// 使用三元运算符判断是否为关键字null还是字符串"null"
			System.out.println(arr4[i] + (arr4[i] == null ? "\t关键字" : "\t字符串"));
		}
		
	}
}
