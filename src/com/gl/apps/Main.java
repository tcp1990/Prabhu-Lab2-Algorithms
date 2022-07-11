package com.gl.apps;

import java.util.Scanner;

import com.gl.services.PayMoneyTransaction;

public class Main {

	public static void main(String[] args) {
		int noOfTranasactions = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		noOfTranasactions = scan.nextInt();
		
		int transactionAmounts[] = new int[noOfTranasactions];
		//store list of transactions
		System.out.println("enter the values of array");
		for(int index=0; index< transactionAmounts.length; index++) {
			transactionAmounts[index] = scan.nextInt();
		}
		
		PayMoneyTransaction pmp = new PayMoneyTransaction();
		pmp.showTargetInfo(transactionAmounts);
		scan.close();
	}

}
