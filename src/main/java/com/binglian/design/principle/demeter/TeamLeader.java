package com.binglian.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
	public void checkNumberOfCourses(){
		List<Course> coursesList=new ArrayList<Course>();
		for(int i=0;i<20;i++){
			coursesList.add(new  Course());
		}
		System.out.println("���߿γ̵������ǣ�"+coursesList.size());
	}
}
