package com.tkd.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "member")
public class Person {
	String name;
	int age;
	int id;
 
	public String getName() {
		return name;
	}
 
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	@XmlAttribute
	public void setAge(int age) {
		this.age = age;
	}
 
	public int getId() {
		return id;
	}
 
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
 
	public String toString(){
		return "\n{ID:" + id + " Name:"+ name + " Age:"+age + "}";
	}
}