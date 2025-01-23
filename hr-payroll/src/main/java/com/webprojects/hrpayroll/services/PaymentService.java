package com.webprojects.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webprojects.hrpayroll.entities.Payment;
import com.webprojects.hrpayroll.entities.Worker;
import com.webprojects.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkerFeignClient feignClient; 
	
	public Payment getPayment(Long workerId, int days) {
		
		Worker worker = feignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
