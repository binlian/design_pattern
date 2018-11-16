package com.binglian.design.principle.demeter;

/**
 * 迪米特原则
 * 定义：一个对象应该对其他对象保持最少的了解。又叫最少知道原则
 * 尽量降低类与类之间的耦合
 * 优点：降低类之间的耦合、
 * 强调只和朋友交流，不和陌生人说话
 * 朋友：出现在成员变量、方法的输入、输出参数中的类称为成员朋友类。而出现在方法体内的类不属于朋友类
 * @author binglian
 *
 */
public class Test {

	public static void main(String[] args) {
		Boss boss=new Boss();
		TeamLeader teamLeader=new TeamLeader();
		boss.commandCheckNumber(teamLeader);

	}

}
