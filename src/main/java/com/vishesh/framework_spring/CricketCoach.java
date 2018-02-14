package com.vishesh.framework_spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice cover drive";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket coach: " + fortuneService.getFortune();
	}

}
