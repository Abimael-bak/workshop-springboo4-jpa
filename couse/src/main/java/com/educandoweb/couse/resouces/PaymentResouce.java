package com.educandoweb.couse.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.couse.entities.Payment;
import com.educandoweb.couse.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResouce {

	@Autowired
	private PaymentService service;
	
	@GetMapping
	public ResponseEntity<List<Payment>> findAll(){
		List<Payment> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Payment> findById(@PathVariable Long id){
		Payment obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
 