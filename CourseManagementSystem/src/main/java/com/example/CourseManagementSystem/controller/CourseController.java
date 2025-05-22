package com.example.CourseManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseManagementSystem.model.CourseEnrollment;
import com.example.CourseManagementSystem.model.CourseInfo;
import com.example.CourseManagementSystem.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:5500")

public class CourseController {
@Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<CourseInfo> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseEnrollment> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulations! "+name+" Enrollment Successful for "+courseName;

    }

}



