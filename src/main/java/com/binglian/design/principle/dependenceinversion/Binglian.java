package com.binglian.design.principle.dependenceinversion;

public class Binglian {

	private ICourse iCourse;
	
	
	public void studyBinglianCourse(){
		iCourse.studyCourse();
	}

	public void setiCourse(ICourse iCourse) {
		this.iCourse = iCourse;
	}
	
}
