package com.vishesh.framework_spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// Setup private fields

	private String emailAddress;
	private String team;

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

	// Getters and Setters of fields

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach: Inside setter method - setTeam");
		this.team = team;
	}

	public String getDailyWorkout() {
		return "Practice cover drive";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket coach: " + fortuneService.getFortune();
	}

}
