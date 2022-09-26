/**
 * 
 */
package com.example;

import java.util.scanner;

/**
 * @author Swapnil
 *
 */
public class StudentTest {
	void displayStudents(Student1[] s1) {
		for (Student1 obj : s1) {
			System.out.println("Name:" + obj.getName() + "Score:" + obj.getScore() + "Course :" + obj.getCourse());

		}
	}
	// method overloading
	Static

	void displayDetails(Student[] s1, double marks) {
		for (student obj : s1) {
			if (obj.getCourse() >= marks)
				System.out
						.println("Name :" + obj.getName() + "score ;" + obj.getScore() + "course :" + obj.getCourse());
		}

	}

	public static void main(String[] args) {
    	 Student1 s[]=new Student1[5];
    	 s[0]=new Student1(1,"Abhi",24,82.3);
    	 s[1]=new Student1(2,"Amish",24,82.3);
    	 s[2]=new Student1(3,"Raj",24,82.3);
    	 s[3]=new Student1(4,"Swapnil",24,82.3);
    	 s[4]=new Student1(5,"Sairaj",24,82.3);
    	 int ch


     }
}
