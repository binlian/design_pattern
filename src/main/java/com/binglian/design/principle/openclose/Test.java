package com.binglian.design.principle.openclose;

/**
 * ����ԭ��
 * ���壺һ��ʵ�������ࡢģ��ͺ���Ӧ�ö���չ���š����޸Ĺر�
 * �ó��󹹽���ܣ�����ʵ����չϸ��
 * �ŵ�:������ϵͳ�Ŀɸ����Լ���ά����
 * @author binglian
 *
 */
public class Test {

	public static void main(String[] args) {
		ICourse ICourse=new JavaDiscountCourse(96, "Java���㵽��ҵ�����̿���", 348d);
		JavaDiscountCourse javaCourse=(JavaDiscountCourse)ICourse;
		System.out.println("�γ�ID: "+javaCourse.getId()+" �γ�����: "+javaCourse.getName()+" �γ�ԭ��: "+javaCourse.getOriginPrice()+" �γ̼۸�: "+javaCourse.getPrice());
		
	}

}
