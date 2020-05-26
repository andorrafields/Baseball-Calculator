package com.techelevator.BaseballStatsCalculator;

import java.util.Scanner;

public class BaseballStatsCalculator {

	public static void main(String[] args) {
		System.out.println("This baseball calculator will return basic hitter's stats:");
		System.out.println("Batting Average (AVG), On-Base Percentage (OBP), ");
		System.out.println("Slugging Percentage (SLG), and On Base Plus Slugging (OPS).");
		System.out.println("--------------------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many at bats did your batter have?: ");
		Double atBats = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter total number of singles (1B): ");
		Double singles = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter total number of doubles (2B): ");
		Double doubles = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter total number of triples (3B): ");
		Double triples = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter number of Homeruns (HR): ");
		Double homeruns = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter number of walks (BB): ");
		Double walks = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter number of sacrifice flys (SAC): ");
		Double sacfly = Double.parseDouble(scanner.nextLine());
		
		System.out.println("How many times hit by pitch (HBP)?: ");
		Double hbp = Double.parseDouble(scanner.nextLine());
		
		double pa = atBats + walks + sacfly + hbp;
		double hits = singles + doubles + triples + homeruns;
		double avg = hits / atBats;
		double obp = (hits+ walks + hbp)/(pa);
		double slg = (singles + (2*doubles) + (3*triples) + (4*homeruns))/atBats;
		double ops = obp + slg;
		
		System.out.printf("AVG: " + String.format("%.3f", avg));
		System.out.printf("\nOBP: " + String.format("%.3f", obp));
		System.out.printf("\nSLG: " + String.format("%.3f", slg));
		System.out.printf("\nOPS: " + String.format("%.3f", ops));
		
				
			
		
	}

	}


