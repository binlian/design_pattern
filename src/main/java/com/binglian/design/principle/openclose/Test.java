package com.binglian.design.principle.openclose;

/**
 * 开闭原则
 * 定义：一个实体类如类、模块和函数应该对扩展开放。对修改关闭
 * 用抽象构建框架，用于实现扩展细节
 * 优点:提高软件系统的可复用性及可维护性
 * @author binglian
 *
 */
public class Test {

	public static void main(String[] args) {
		ICourse ICourse=new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
		JavaDiscountCourse javaCourse=(JavaDiscountCourse)ICourse;
		System.out.println("课程ID: "+javaCourse.getId()+" 课程名称: "+javaCourse.getName()+" 课程原价: "+javaCourse.getOriginPrice()+" 课程价格: "+javaCourse.getPrice());
		
	}

}
