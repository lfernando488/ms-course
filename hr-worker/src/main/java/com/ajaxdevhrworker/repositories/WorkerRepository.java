package com.ajaxdevhrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajaxdevhrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	
	
}
