package com.example.CourseManagementSystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseManagementSystem.model.CourseEnrollment;
import com.example.CourseManagementSystem.model.CourseInfo;
import com.example.CourseManagementSystem.repository.CourseEnrollmentRepo;
import com.example.CourseManagementSystem.repository.CourseInfoRepo;
import java.util.List;

@Service
public class CourseService {
@Autowired
CourseInfoRepo cInfoRepo;
@Autowired
CourseEnrollmentRepo cEnrollRepo;

 public List<CourseInfo> availableCourses() {
        return cInfoRepo.findAll();
    }

    public List<CourseEnrollment> enrolledStudents() {
        return cEnrollRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseEnrollment courseEnroll = new CourseEnrollment(name,emailId,courseName);
        cEnrollRepo.save(courseEnroll);
    }


}
