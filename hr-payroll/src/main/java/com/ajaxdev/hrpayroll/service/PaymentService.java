package com.ajaxdev.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.ajaxdev.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days){
		return new Payment("Louis", 2000.0, 10);
	}	
}
