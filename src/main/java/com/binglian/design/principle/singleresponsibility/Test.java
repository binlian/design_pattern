package com.binglian.design.principle.singleresponsibility;

/**
 * 单一职责原则
 * 定义：不要存在多于一个导致类变更的原因
 * 一个类/接口/方法只负责一项职责
 * 有点：降低类的复杂度、提高类的可读性，提高系统的可维护性、降低变更引起的风险
 * @author binglian
 *
 */
public class Test {

	public static void main(String[] args) {
//		Bird bird=new Bird();
//		bird.mainMoveMode("大雁");
//		bird.mainMoveMode("鸵鸟");
		
		FlyBird flyBird=new FlyBird();
		flyBird.mainMoveMode("大雁");
		
		WalkBird walkBird=new WalkBird();
		walkBird.mainMoveMode("鸵鸟");
	}

}
