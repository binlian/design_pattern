package com.binglian.design.principle.dependenceinversion;

/**
 * ��������ԭ��
 * ���壺�߲�ģ�鲻Ӧ�������Ͳ�ģ�飬���߶�Ӧ�����������
 * ����Ӧ������ϸ��;ϸ��Ӧ����������
 * ��Խӿڱ�̣���Ҫ���ʵ�ֱ��
 * �ŵ㣺���Լ�����������ԡ����ϵͳ�ȶ��ԣ���ߴ���ɶ��ԺͿ�ά���ԣ��ɽ����޸ĳ�������ɵķ���
 * @author binglian
 *
 */
public class Test {

	//v1�汾 
//	public static void main(String[] args) {
//		Binglian binglian=new Binglian();
//		binglian.studyBinglianCourse();
//		binglian.studyBinglianCourse();
//	}

	//v2 �ӿڷ���
//	public static void main(String[] args){
//		Binglian binglian=new Binglian();
//		binglian.studyBinglianCourse(new JavaCourse());
//		binglian.studyBinglianCourse(new FECourse());
//	}
	
	//v3 ����������
//	public static void main(String[] args){
//		Binglian binglian=new Binglian(new JavaCourse());
//		binglian.studyBinglianCourse();
//	}
	
	public static void main(String[] args){
		Binglian binglian=new Binglian();
		binglian.setiCourse(new JavaCourse());
		binglian.studyBinglianCourse();
		
		binglian.setiCourse(new FECourse());
		binglian.studyBinglianCourse();
	}
}























