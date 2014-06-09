package com.tkd.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/*Test to update git repo*/

@XmlRootElement(name = "family")
public class Family {	
	private List<Person> member;
	private String name;
	private int size;
	
	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	
	@XmlAttribute
	public void setSize(int size) {
		this.size = size;
	}
	
	public List<Person> getMember() {
		return member;
	}

	@XmlElementWrapper(name = "members")
	//@XmlElement(name = "member")
	public void setMember(List<Person> member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Family [name=" + name + ", size=" + size + ", members=" + member + "]";
	}	
}
