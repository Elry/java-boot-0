package com.rmt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		DateHandler dh = new DateHandler();
		
		System.out.println("Now with date:" + dh.dateNow());
		System.out.println("Now with calendar: " + dh.calendarNow());
		System.out.println("Today with local: " + dh.today());
		System.out.println("Yesterday with local: " + dh.yesterday());

		SpringApplication.run(DemoApplication.class, args);
	}
}