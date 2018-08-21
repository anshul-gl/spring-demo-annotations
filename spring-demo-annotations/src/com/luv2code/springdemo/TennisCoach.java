package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("p	rototype")
public class TennisCoach implements Coach {

//	@Autowired
//	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	public String getEmail() {
		return email;
	}

	@Autowired
	public TennisCoach(@Qualifier("randomService")FortuneService fortuneService) {
		this.fortuneService=fortuneService;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortunes();
	}

}
