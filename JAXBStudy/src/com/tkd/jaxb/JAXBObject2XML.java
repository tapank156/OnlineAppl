package com.tkd.jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
 
public class JAXBObject2XML {
	public static void main(String[] args) { 
		List<Person> members = new ArrayList<Person>();
		Person member1 = new Person();
		member1.setId(100);
		member1.setName("Tapan Dinda");
		member1.setAge(45);

		Person member2 = new Person();
		member2.setId(101);
		member2.setName("Rushdeep Dinda");
		member2.setAge(10);

		Person member3 = new Person();
		member3.setId(102);
		member3.setName("Sovon Dinda");
		member3.setAge(15);

		Person member4 = new Person();
		member4.setId(103);
		member4.setName("Sumit Dinda");
		member4.setAge(7);

		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		Family family = new Family();
		family.setName("Dinda");
		family.setSize(members.size());
		family.setMember(members);
	  	try { 
		  	File file = new File("file4.xml");
		  	JAXBContext context = JAXBContext.newInstance(Family.class);
		  	Marshaller marshaller = context.createMarshaller(); 
		  	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		  	marshaller.marshal(family, file);
		  	marshaller.marshal(family, System.out); 
	  	} catch (JAXBException e) {
	  		e.printStackTrace();
	  	}
	}
}
