package com.binglian.design.principle.singleresponsibility;

public class Bird {
	public void mainMoveMode(String birdName){
		if("ÍÒÄñ".equals(birdName)){
			System.out.println(birdName+"ÓÃ½Å×ß");
		}else{
			System.out.println(birdName+"ÓÃ³á°ò·É");
		}
	}
}
