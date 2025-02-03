package com.student.app;

import java.util.Scanner;

public class WelcomeApp {
public static void main(String[]args) {
	int choice=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
	
	do {
		System.out.println("1. Login");
		System.out.println("2. Signup");
		System.out.println("3. Exit");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:Login.login();
			break;
			
		case 2:Signup.signup();
			break;
			
		case 3:System.out.println("Application closed");
			break;
			
		default:System.out.println("Invalid input");
		}
	}while(choice!=3);
	
}
}
