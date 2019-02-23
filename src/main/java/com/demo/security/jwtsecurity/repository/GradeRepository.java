package com.demo.security.jwtsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.security.jwtsecurity.model.grade;
@Repository
public interface GradeRepository extends JpaRepository<grade, Long> {

}
