package com.example.CourseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseManagementSystem.model.CourseEnrollment;


@Repository
public interface CourseEnrollmentRepo extends JpaRepository<CourseEnrollment,Integer>{

}
