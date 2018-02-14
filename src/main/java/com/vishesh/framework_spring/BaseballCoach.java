package com.vishesh.framework_spring;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 mins on the field warming up...";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
