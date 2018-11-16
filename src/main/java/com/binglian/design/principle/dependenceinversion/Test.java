package com.binglian.design.principle.dependenceinversion;

/**
 * 依赖倒置原则
 * 定义：高层模块不应该依赖低层模块，两者都应该依赖其抽象
 * 抽象不应该依赖细节;细节应该依赖抽象
 * 针对接口编程，不要针对实现编程
 * 优点：可以减少类间的耦合性、提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风向
 * @author binglian
 *
 */
public class Test {

	//v1版本 
//	public static void main(String[] args) {
//		Binglian binglian=new Binglian();
//		binglian.studyBinglianCourse();
//		binglian.studyBinglianCourse();
//	}

	//v2 接口方法
//	public static void main(String[] args){
//		Binglian binglian=new Binglian();
//		binglian.studyBinglianCourse(new JavaCourse());
//		binglian.studyBinglianCourse(new FECourse());
//	}
	
	//v3 构造器方法
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























