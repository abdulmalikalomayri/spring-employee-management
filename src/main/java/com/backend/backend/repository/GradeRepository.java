package com.backend.backend.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.backend.backend.entity.Grade;

public interface GradeRepository extends CrudRepository<Grade, Long> {
     Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);
     List<Grade> findByStudentId(Long studentId);
     List<Grade> findByCourseId(Long courseId);
     @Transactional
     void deleteByStudentIdAndCourseId(Long studentId, Long courseId);

}