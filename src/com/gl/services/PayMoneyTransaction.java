package com.gl.services;

import java.util.Scanner;

public class PayMoneyTransaction {
	
	public void showTargetInfo(int transactionAmounts[]) {
		//get number of targets
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the total no of targets that needs to be achieved");
		int noOfTargets = scan.nextInt();
		
		//store list of targets
		int targetAmount[] = new int[noOfTargets];
		
		for(int index=0; index < targetAmount.length; index++) {
			System.out.println("enter the value of target");
			int amount = scan.nextInt();
			
			int total = 0;
			boolean targetAchieved = false;
			for(int travel=0; travel < transactionAmounts.length; travel++) {
				total += transactionAmounts[travel];
				
				if(total >= amount) {
					System.out.println("Target achieved after " + (travel +1) +  " transaction(s) ");
					targetAchieved = true;
					break;
				}
			}
			if(! targetAchieved)
				System.out.println("Given target is not achieved");			
		}
		scan.close();
	}
}
