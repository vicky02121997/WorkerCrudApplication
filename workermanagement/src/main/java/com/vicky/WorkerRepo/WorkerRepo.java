package com.vicky.WorkerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.model.WorkerDetails;

@Repository
public interface WorkerRepo extends JpaRepository<WorkerDetails, Integer> {

} 
