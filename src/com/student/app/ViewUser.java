package com.student.app;

import java.util.ArrayList;
import java.util.Iterator;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOImpl;
import com.student.dto.Student;

public class ViewUser {
public static void viewuser() {
	StudentDAO stdo=new StudentDAOImpl();
	ArrayList<Student> arr=stdo.getStudent();
	Student s=new Student();
	Iterator itr=arr.iterator();
	while(itr.hasNext()) {
		s=(Student)itr.next();
		System.out.println(s);
	}
}
}
