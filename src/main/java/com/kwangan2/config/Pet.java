package com.kwangan2.config;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Pet {
	
	private String name;
	private int age;

}
