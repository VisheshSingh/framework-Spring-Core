package com.vishesh.framework_spring;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;

	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice pocketing from 20 yards";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
