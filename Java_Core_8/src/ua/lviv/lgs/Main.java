package ua.lviv.lgs;

import java.util.Scanner;

public class Main 
{
	//Added new function
	//Checks whether input string contains a number
	public static boolean containsNumber(String name)
	{
		boolean state = false;
		
		for(int i = 0; i <= 10; i++)
		{
			if(name.contains(Integer.toString(i)))
			{
				state = true;
			}
		}
		
		return state;
	}
	//First change for lesson 9
	public static void checkIfExists() throws WrongInputConsoleParametersException
	{
		System.out.println("\nEnter the month to see whether it exist ");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		name = name.toUpperCase();
		
		//Added this exception
		if(containsNumber(name))
		{
			throw new WrongInputConsoleParametersException("You have entered prohibited character in your input");
		}
				
		boolean flag = false;
		for(Months month : Months.values())
		{
			if(name.equals(month.name()))
			{
				System.out.println("Exists");
				flag = true;
			}
		}
		if(!flag)
		{
			System.out.println("doesn't Exist");
		}
	}
	
	public static void monthsOfSameSeason(String name)
	{
		name = name.toUpperCase();
		
		System.out.println("\nSame season");
		for(Months loopMonth : Months.values())
		{
			if(loopMonth.getSeason() == Months.valueOf(name).getSeason())
			{
				System.out.println(loopMonth.name());
			}
		}
		
	}
	
	public static void monthsOfSameDays(String name)
	{
		name = name.toUpperCase();
		
		System.out.println("\nSame days");
		for(Months loopMonth : Months.values())
		{
			if(loopMonth.getDays() == Months.valueOf(name).getDays())
			{
				System.out.println(loopMonth.name());
			}
		}
		
	}
	
	public static void monthsOfLessDays(String name)
	{
		name = name.toUpperCase();
		
		System.out.println("\nLess days");
		for(Months loopMonth : Months.values())
		{
			if(loopMonth.getDays() < Months.valueOf(name).getDays())
			{
				System.out.println(loopMonth.name());
			}
		}
		
	}
	
	public static void monthsOfMoreDays(String name)
	{
		name = name.toUpperCase();
		
		System.out.println("\nMore days");
		for(Months loopMonth : Months.values())
		{
			if(loopMonth.getDays() > Months.valueOf(name).getDays())
			{
				System.out.println(loopMonth.name());
			}
		}
		
	}
	
	public static void nextSeason(String name)
	{
		name = name.toUpperCase();
		
		System.out.println("\nSeason after " + name.toLowerCase());
		
		int index = Seasons.valueOf(name).ordinal() + 1;
		
		if(index == Seasons.values().length)
		{
			System.out.println(Seasons.values()[0].name());
		} 
		else 
		{
			System.out.println(Seasons.values()[index].name());
		}
	}
	
	public static void previousSeason(String name)
	{
		name = name.toUpperCase();
		
		System.out.println("\nSeason before " + name.toLowerCase());
		
		int index = Seasons.valueOf(name).ordinal() - 1;
		
		if(index == -1)
		{
			System.out.println(Seasons.values()[Seasons.values().length - 1].name());
		} 
		else 
		{
			System.out.println(Seasons.values()[index].name());
		}
	}
	
	public static void evenDays()
	{
		System.out.println("\nMonths with even number of days ");
		for(Months month : Months.values())
		{
			if(month.getDays() % 2 == 0)
			{
				System.out.println(month.name());
			}
		}
	}
	
	public static void oddDays()
	{
		System.out.println("\nMonths with odd number of days ");
		for(Months month : Months.values())
		{
			if(month.getDays() % 2 != 0)
			{
				System.out.println(month.name());
			}
		}
	}
	//Second change for lesson 9 
	public static void isOdd() throws WrongInputConsoleParametersException
	{
		System.out.println("\nEnter the month to see whether it's number of days is odd");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		scan.close();
		name = name.toUpperCase();
		
		//Added this exception
		if(containsNumber(name))
		{
			throw new WrongInputConsoleParametersException("You have entered prohibited character in your input");
		}
				
		if(Months.valueOf(name).getDays() % 2 != 0)
		{
			System.out.println("Number of days is odd");
		}
		else
		{
			System.out.println("Number of days is even");
		}
	}
	
	public static void main(String[] args) throws WrongInputConsoleParametersException 
	{
		
		String name = "august";
		
		
		//1
		checkIfExists();
		//2
		monthsOfSameSeason(name);
		//3
		monthsOfSameDays(name);
		//4
		monthsOfLessDays(name);
		//5
		monthsOfMoreDays(name);
	
		
		name = "winter";

		
		//6
		nextSeason(name);
		//7
		previousSeason(name);
		//8
		evenDays();
		//9
		oddDays();
		//
		isOdd();
		
	}

}
