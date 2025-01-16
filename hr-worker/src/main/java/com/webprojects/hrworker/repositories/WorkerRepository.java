package com.webprojects.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webprojects.hrworker.entities.Worker;

public interface WorkerRepository  extends JpaRepository<Worker, Long>{

}
