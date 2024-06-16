/**
 * 
 */
package com.demo.myapplication.rest;

import org.springframework.web.bind.annotation.RestController;

import com.demo.myapplication.api.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Demo Rest Controller class for understanding the Constructor Injection.
 */
@RestController
public class DemoRestController {
		
	private Coach myCoach;
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return this.myCoach.dailyWorkout();
	}
	
	@Autowired
	public void setCricketCoach(Coach Coach) {
		myCoach = Coach;
	}
	
}
