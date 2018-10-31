package com.raghav.feedbackapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.raghav.feedbackapp.controller.UsersController;

@SpringBootApplication
public class FeedbackappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackappApplication.class, args);
		
	}
}
