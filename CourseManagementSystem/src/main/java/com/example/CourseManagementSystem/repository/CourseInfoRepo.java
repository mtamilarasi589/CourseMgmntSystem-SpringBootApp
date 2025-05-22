package com.example.CourseManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseManagementSystem.model.CourseInfo;
@Repository
public interface CourseInfoRepo extends JpaRepository<CourseInfo,String>  {

}
