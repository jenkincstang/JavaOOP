package test;

import model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(1);
		student.setName("jenkin");
		student.setAge(24);
		student.setGender("Male");
		
		System.out.println(student);
	}

}
