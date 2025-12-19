package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {


}
