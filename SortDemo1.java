package com.imooc.arry;

public class SortDemo1 {

	public static void main(String[] args) {
		// ð������,�Ӵ�С
		//��ʼ������
		int[] a = {123,4,32,21,52};
		System.out.println("����ǰ������˳��Ϊ:");
		//����1��
		for(int n:a) {
			System.out.print(n+",");
		}
		System.out.println();//����
		
		//����һ����ʱ�����ñȽ�
		int temp;
		//����
		//����������
		//�ڲ������С
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
		
		//������ʾ��
		System.out.println("�����ĴӴ�С��˳����:");
		//�ٴα������
		for(int n:a) {
			System.out.print(n+",");
		}

	}

}
