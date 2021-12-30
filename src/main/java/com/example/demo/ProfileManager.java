package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.impl.Manager;
import com.example.pojo.Employee;

@RestController
public class ProfileManager {

	@Autowired
	private Environment environment;

	@Autowired
	private Manager manager;
	
	@GetMapping("/result")
	public void getResult() {
		System.out.println("Request mapping begin: /result");
		getActiveProfiles();
	}
    
    public void getActiveProfiles() {
        for (String profileName : environment.getActiveProfiles()) {
            System.out.println("Currently active profile - " + profileName);
            System.out.println(environment.getProperty("AMMA"));
            System.out.println(environment.getProperty("NANNA"));
            System.out.println(environment.getProperty("CHILD"));
            AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(Config.class);

          Employee employee = context.getBean("john", Employee.class);
          System.out.println(employee.getName());
          System.out.println(manager.getName());
        }
        System.out.println("Completed");
    }
}