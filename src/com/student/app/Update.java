package com.student.app;

import java.util.Scanner;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImpl;
import com.student.dto.Student;

public class Update {
public static void update(Student s) {
	Scanner sc=new Scanner(System.in);
	int choice=0;
	StudentDAO stdo=new StudentDAOImpl();
	System.out.println("Enter your choice");
	do {
		System.out.println("1.Name");
		System.out.println("2.Phone");
		System.out.println("3.Mail");
		System.out.println("4.Branch");
		System.out.println("5.Location");
		System.out.println("6.Password");
		System.out.println("7.Back to dashboard");
		choice=sc.nextInt();
		boolean res=false;
		switch(choice) {
		case 1:System.out.println("Enter the New Name");
		       s.setName(sc.next());
		       res= stdo.updateStudent(s);
			break;
			
		case 2:System.out.println("Enter the New Phonenumber");
	           s.setPhone(sc.nextLong());
	           res= stdo.updateStudent(s);
			break;
			
		case 3:System.out.println("Enter the New Mail-id");
	       s.setMail(sc.next());
	           res= stdo.updateStudent(s);
			break;
			
		case 4:System.out.println("Enter the New Branch");
	       s.setBranch(sc.next());
	           res= stdo.updateStudent(s);
			break;
			
		case 5:System.out.println("Enter the New Location");
	       s.setLoc(sc.next());
	           res= stdo.updateStudent(s);
			break;
			
		case 6:System.out.println("Enter the New Password");
	       s.setPassword(sc.next());
	           res= stdo.updateStudent(s);
			break;
			
		case 7:System.out.println("Loading....");
			break;
			
		default:System.out.println("Invalid input");
		}
		
	}while(choice!=7); 
		
	
}
}
