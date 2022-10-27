package com.yangyang.java;
/*
 * 一、数组的概述
 * 	1.数组的理解：数组(Array)，是多个相同类型数据按照一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理
 * 	2.数组相关的概念
 * 	> 数组名
 *  > 元素
 *  > 角标、下标、索引
 *  > 数组的长度:存储的元素的个数
 * 
 * 	3.数组的特点:数组是有序排列的，排列必须有规则
 * 		a.数组本身是属于引用数据类型。其他的引用数据类型还有类和接口
 *  	b.数组虽然是引用数据类型，但是数组的元素可以是基本数据类型，也可以是引用数据类型，比如说：int、double、String
 * 		c.创建数组对象会在内存中开辟一块 连续的内存空间 用来存储数据
 * 		d.数组的长度一旦确定就不能再去修改!
 * 
 * 	4.数组的分类:
 * 		a.按照维度分类:一维数组、二维数组...
 * 		b.按照数组元素分类:基本数据类型的数据、引用数据类型的数组
 * 
 * 	5.一维数组的使用
 * 		a.一维数组的声明和使用
 *      b.如何调用数组指定位置的元素
 *      c.如何获取数组的长度
 *      d.如何遍历数组
 *      e.数组元素的默认初始化值:见ArrayTest1.java文件
 *      f.数组的内存解析:见ArrayTest1.java文件
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 一维数组的声明和初始化
		// 1.1静态初始化:数组的初始化和数组元素的赋值操作 同时 进行，为静态初始化
		int[] ids;  // 声明
		ids = new int[] {1001, 1002, 1003, 1004, 1005};  // 初始化，也就是赋值操作
		// int[] ids2 = new int[] {1, 2, 3, 4, 5};  // 声明然后直接赋值初始化
		// 1.2动态初始化:数组的初始化和数组元素的赋值操作 分开 进行
		String[] names = new String[5];  // 声明
		// 错误写法
			// int[] arr1 = new int[];什么也不填系统默认为为静态初始化，但是没有赋值所以报错
			// int[5] arr2 = new int[];将数组长度值放在前面的中括号里面，会报错，记住一点：前面的中括号永远不能有东西
			// int[] arr3 = new int[3] {1, 2, 3};不能在动态初始化的同时给元素赋值，因为同时进行，所以报错
		// 总结：数组一旦初始化完成，其长度就确定了
		
		// 2.如何调用数组指定位置的元素:通过下标的方式
		// 提示:数组的下标(索引)都是从0开始的，到数组的长度-1的位置结束
		names[0] = "杨阳1";
		names[1] = "杨阳2";
		names[2] = "杨阳3";
		names[3] = "杨阳4";
		names[4] = "杨阳5";
		// names[5] = "杨阳6";不能超过数组的长度赋值，否则报错
		System.out.println(names[0].charAt(0));
		System.out.println(ids[0]);
		
		// 3.如何获取数组的长度
		// 属性:length
		System.out.println("数组names的长度为: " + names.length);
		System.out.println("数组ids的长度为: " + ids.length);
		
		// 4.如何遍历数组
		/* 一个一个输出，不推荐
		 * System.out.println(names[0]); System.out.println(names[1]);
		 * System.out.println(names[2]); System.out.println(names[3]);
		 * System.out.println(names[4]);
		 */
		// 使用for循环
		for (int i = 0; i < names.length; i++) {
			System.out.println("姓名: " + names[i] + "\t学号: " + ids[i]);
		}
		
	}
}
