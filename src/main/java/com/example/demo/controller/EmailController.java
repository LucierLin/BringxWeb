package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmailReq;
import com.example.demo.service.EmailService;

@RestController
@RequestMapping("/lucywebsite.com")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping(value = "/emails", produces = MediaType.APPLICATION_JSON_VALUE)
//	@ApiResponse(responseCode = "200", description = "OK")
	public void searchCommodityDetail(@RequestBody EmailReq emailReq) {
		// send content to the specified email address
		emailService.sendEmail(emailReq.getTo(), emailReq.getSubject(), emailReq.getBody());

	}
}
