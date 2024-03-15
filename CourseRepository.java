package com.in28min.LearnMySQLDocker.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.in28min.LearnMySQLDocker.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
