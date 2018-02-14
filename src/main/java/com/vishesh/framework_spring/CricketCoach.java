package com.vishesh.framework_spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("Inside no-args constructor");
	}

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method of Cricket Coach");
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
