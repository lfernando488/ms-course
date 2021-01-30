package com.ajaxdev.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ajaxdev.hrpayroll.entities.Payment;
import com.ajaxdev.hrpayroll.entities.Worker;
import com.ajaxdev.hrpayroll.feignclients.WorkerClientFeign;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerClientFeign workerClientFeign;
	
	public Payment getPayment(long workerId, int days){
		Worker worker = workerClientFeign.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}	
}
