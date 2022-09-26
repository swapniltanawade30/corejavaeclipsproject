/**
 * 
 */
package com.example;

/**
 * @author Swapnil
 *
 */
public class Student1 {
	private int id;
	private String name;
	private int age;
	private double Score;
	private String course;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name, int age, double score, String course) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Score = score;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return Score;
	}

	public void setScore(double score) {
		Score = score;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
