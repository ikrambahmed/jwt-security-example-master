package com.demo.security.jwtsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.security.jwtsecurity.model.deptgen;

public interface DeptRepository extends JpaRepository<deptgen, Long> {

}
