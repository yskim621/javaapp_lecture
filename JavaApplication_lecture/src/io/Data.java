package io;

import java.io.*;
public class Data implements Serializable {
	private static final long serialVersionUID = 1L;

	public static int bunho;

	private transient int number;
	private String name;
	private int age;

	static {
		bunho = 0;
	}

	public Data() {
		number = ++bunho;
		name = "noname";
		age = 0;
	}

	public Data(String name, int n) {
		number = ++bunho;
		this.name = name;
		age = n;
	}
	
	public int getNumber() {
		return number;
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
	@Override
	public String toString() {
		return "Data [number=" + number + ", name=" + name + ", age=" + age + "]";
	}	
}
