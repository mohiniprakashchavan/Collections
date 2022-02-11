package com.edu;

import java.util.Scanner;

public class CheckIntRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter value");
		if(scan.hasNextInt()) {
		int x=scan.nextInt();
		System.out.println("your entered value"+x);
		}
		else {
			System.out.println("please inter integer value");
		}
		scan.close();

	}

}
