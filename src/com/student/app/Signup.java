package com.student.app;

import java.util.Scanner;
import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImpl;
import com.student.dto.Student;

public class Signup {
public static void signup() {
	Student s=new Student();
	StudentDAO sdao=new StudentDAOImpl();
	Scanner sc=new Scanner(System.in);
	System.out.println("<-----Sign up----->");
	System.out.println("Enter your name");
	s.setName(sc.next());
	System.out.println("Enter your phone");
	s.setPhone(sc.nextLong());
	System.out.println("Enter your mail id");
	s.setMail(sc.next());
	System.out.println("Enter your branch");
	s.setBranch(sc.next());
	System.out.println("Enter your location");
	s.setLoc(sc.next());
	System.out.println("Set password");
	String password=sc.next();
	System.out.println("Confirm password");
	String confirm=sc.next();
	if(password.equals(confirm)) {
		s.setPassword(confirm);
		boolean result= sdao.insertStudent(s);
		
		if(result) {
			System.out.println("Data saved sucessfully");
		}
		else {
			System.out.println("Data not saved");
		}
	}
	else {
		System.out.println("Incorect password");
	}
}
}
