package com.binglian.design.principle.openclose;

/**
 * 开闭原则
 * 定义：一个实体类如类、模块和函数应该对扩展开放。对修改关闭
 * 用抽象构建框架，用于实现扩展细节
 * 优点:提高软件系统的可复用性及可维护性
 * @author binglian
 *
 */
public class JavaDiscountCourse extends JavaCourse {
	
	public JavaDiscountCourse(Integer id,String name,Double price){
		super(id, name, price);
	}
	
	//获取原价
	public Double getOriginPrice(){
		return super.getPrice();
	}
	//获得打折价
	@Override
	public Double getPrice(){
		return super.getPrice()*0.8;
	}

}
