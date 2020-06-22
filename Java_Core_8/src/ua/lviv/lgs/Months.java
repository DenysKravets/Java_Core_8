package ua.lviv.lgs;

public enum Months 
{
	DECEMBER(Seasons.WINTER, 31), JANUARY(Seasons.WINTER, 29), FEBRUARY(Seasons.WINTER, 30),
	MARCH(Seasons.SPRING, 30), APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 32), 
	JUNE(Seasons.SUMMER, 31), JULY(Seasons.SUMMER, 28), AUGUST(Seasons.SUMMER, 31), 
	SEPTEMBER(Seasons.FALL, 32), OCTOBER(Seasons.FALL, 30), NOVEMBER(Seasons.FALL, 30);
	
	private double days;
	private Seasons season;
	
	public double getDays() {
		return days;
	}

	public Seasons getSeason() {
		return season;
	}

	private Months(Seasons season, int days)
	{
		this.season = season;
		this.days = days;
	}
}
