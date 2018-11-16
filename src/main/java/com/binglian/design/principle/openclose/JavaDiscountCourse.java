package com.binglian.design.principle.openclose;

/**
 * ����ԭ��
 * ���壺һ��ʵ�������ࡢģ��ͺ���Ӧ�ö���չ���š����޸Ĺر�
 * �ó��󹹽���ܣ�����ʵ����չϸ��
 * �ŵ�:������ϵͳ�Ŀɸ����Լ���ά����
 * @author binglian
 *
 */
public class JavaDiscountCourse extends JavaCourse {
	
	public JavaDiscountCourse(Integer id,String name,Double price){
		super(id, name, price);
	}
	
	//��ȡԭ��
	public Double getOriginPrice(){
		return super.getPrice();
	}
	//��ô��ۼ�
	@Override
	public Double getPrice(){
		return super.getPrice()*0.8;
	}

}
