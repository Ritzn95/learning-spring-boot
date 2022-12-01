package com.Ritesh.Springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
    	return Arrays.asList(
    			new Course(1,"Learn AWS", "Umar"),
    			new Course(2,"Learn DevOps", "Aki"),
    			new Course(3,"Learn Automation", "Ritesh"),
    			new Course(4,"Learn Azure", "Ritesh")
    			);
    			
    }
}
