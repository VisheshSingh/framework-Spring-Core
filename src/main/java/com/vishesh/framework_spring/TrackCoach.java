package com.vishesh.framework_spring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run a good 5k";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}

	// Init Method
	public void doMyStartup() {
		System.out.println("Init method: doMyStartup");
	}

	// Destroy method
	public void doMyShutdown() {
		System.out.println("Destroy method: doMyShutdown");
	}
}
