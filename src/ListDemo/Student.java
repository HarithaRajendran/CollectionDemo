package ListDemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Student /*implements Iterable*/{
	
//	private static int count=0;
//	private static Student stu=null;
	
	private int id;
	private String name;
	private String gender;
	
	 public Student(int id,String name,String gender) {
		this.id=id;
		this.name=name;
		this.gender=gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
//
//	@Override
//	public Iterator iterator() {
//		return new ArrayList().iterator();
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
//	public int hashCode(Student s) {
//		return s.id;
//	}
//	
//	public boolean equals(Object o) {
//		Student other = (Student) o;
//		if (id != other.id)
//			return false;
//		return true;
//	}
	
}
