package com.student.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImpl;
import com.student.dto.Student;

public class Login {
public static void login() {
	StudentDAO stdo=new StudentDAOImpl();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your mail");
	String mail=sc.next();
	System.out.println("Enter the password");
	String password=sc.next();
	Student s1=stdo.getStudent(mail, password);
	if(s1!=null) {
		System.out.println("Login sucessful..!!");
		System.out.println("Welcome "+s1.getName());
		int choice=0;
		do {
			System.out.println("1.View credentials");
			System.out.println("2.Update Credentials");
			System.out.println("3.Back to menu");
			
		
		if(s1.getId()==1) {
			System.out.println("Welcom Admin");
			System.out.println("4.View all users");
			System.out.println("5.Delete user");
		}
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println(s1);
			break;
			
		case 2:Update.update(s1);
			break;
		
		case 3:System.out.println("Back to menu");
			break;
		
		case 4:ArrayList<Student> arr=stdo.getStudent();
		       Student s=new Student();
		       Iterator itr=arr.iterator();
		       while(itr.hasNext()) {
			   s=(Student)itr.next();
			    System.out.println(s);
		        }
			break;
		
		case 5:System.out.println("Enter the id to be deleted");
		       Student d=new Student();
		       d.setId(sc.nextInt());
		       boolean res=stdo.deleteStudent(d);
		       if(res) {
		    	   System.out.println("Deleted sucessfully");
		       }
		       else {
		    	   System.out.println("Failed to delete");
		       }
			break;
		
		default:System.out.println("Invalid input");
		}
	}while(choice!=3);
	}
	else {
		System.out.println("Login failed");
	}
}
}
