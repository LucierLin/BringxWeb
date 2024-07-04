package com.example.demo.model;

import java.util.Set;

import lombok.Data;

@Data
public class EmailReq {
	private String to;
	private String subject;
	private String body;
}
