package com.claudionogueira.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.claudionogueira.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
