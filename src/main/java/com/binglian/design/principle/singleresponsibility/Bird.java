package com.binglian.design.principle.singleresponsibility;

public class Bird {
	public void mainMoveMode(String birdName){
		if("����".equals(birdName)){
			System.out.println(birdName+"�ý���");
		}else{
			System.out.println(birdName+"�ó���");
		}
	}
}
