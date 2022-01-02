package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/*
 * Author: Uday Katta rebased two
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.example")
public class Application {

	//This is main method,testing Squash in git 5
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	//Every Hour schedulerMethod,testing Squash in git commit 17
	@Scheduled(cron = "0 0 0/1 1/1 * ?")
	public void schedulerMethod() {
		System.out.println("Every Hour schedulerMethod=>" + new Date());
	}
	
	@Scheduled(cron = "0 0 0 ? * SUN")
	public void schedulerMethod2() {
		System.out.println("schedulerMethod2=>" + new Date());
	}
	
	@Scheduled(cron = "30 5 23 ? * SAT")
	public void schedulerMethod3() {
		System.out.println("schedulerMethod3=>" + new Date());
	}
	
	//Spring-Scheduler: every 3 months, 25th 23:09:00: testing Squash in git commit 16
	@Scheduled(cron = "0 9 23 25 1/3 ?") // every 3 months, 25th 23:09:00
	public void schedulerMethod4() {
		System.out.println("schedulerMethod4=>" + new Date());
	}
	
	@Scheduled(cron = "31 30 23 ? 1/1 SAT#4") // 4th Saturday, every month, 23:30:31
	public void schedulerMethod5() {
		System.out.println("schedulerMethod5=>" + new Date());
	}
	
	//commit 18
	//commit 19
	//commit 20
	//commit 21
	
}
