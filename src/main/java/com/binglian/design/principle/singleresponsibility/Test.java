package com.binglian.design.principle.singleresponsibility;

/**
 * ��һְ��ԭ��
 * ���壺��Ҫ���ڶ���һ������������ԭ��
 * һ����/�ӿ�/����ֻ����һ��ְ��
 * �е㣺������ĸ��Ӷȡ������Ŀɶ��ԣ����ϵͳ�Ŀ�ά���ԡ����ͱ������ķ���
 * @author binglian
 *
 */
public class Test {

	public static void main(String[] args) {
//		Bird bird=new Bird();
//		bird.mainMoveMode("����");
//		bird.mainMoveMode("����");
		
		FlyBird flyBird=new FlyBird();
		flyBird.mainMoveMode("����");
		
		WalkBird walkBird=new WalkBird();
		walkBird.mainMoveMode("����");
	}

}
