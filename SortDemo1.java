package com.imooc.arry;

public class SortDemo1 {

	public static void main(String[] args) {
		// 冒泡排序,从大到小
		//初始化数据
		int[] a = {123,4,32,21,52};
		System.out.println("排序前的数组顺序为:");
		//遍历1遍
		for(int n:a) {
			System.out.print(n+",");
		}
		System.out.println();//换行
		
		//定义一个临时变量好比较
		int temp;
		//排序
		//外层决定次数
		//内层决定大小
		for(int i = 0 ;i<a.length-1;i++) {
			for(int j =0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
//					System.out.print(a[j]+",");
				}
			}
		}
		
		//来句提示语
		System.out.println("排序后的从大到小的顺序是:");
		//再次遍历输出
		for(int n:a) {
			System.out.print(n+",");
		}

	}

}
