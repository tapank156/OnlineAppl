package com.tkd.jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
//any comments
public class JAXBXML2Object {
	public static void main(String[] args) {
		try {
			File file = new File("file1.xml");
			JAXBContext context = JAXBContext.newInstance(Family.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Family family = (Family) unmarshaller.unmarshal(file);
			System.out.println(family);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
