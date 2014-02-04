package com.tkd.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.tkd.jaxb.item.*;
//import com.tkd.jaxb.person.*;

import java.io.File;
import java.math.BigDecimal;

public class XSD2XML {
    public static void main(String[] args) throws JAXBException{
        ObjectFactory factory = new ObjectFactory();
        UserT user = factory.createUserT();
        user.setUserName("Sanaulla");
        ItemT item = factory.createItemT();
        item.setItemName("Seagate External HDD");
        item.setPurchasedOn("August 24, 2010");
        item.setAmount(new BigDecimal("6776.5"));

        ItemT item1 = factory.createItemT();
        item1.setItemName("Seagate External HKK");
        item1.setPurchasedOn("August 24, 2011");
        item1.setAmount(new BigDecimal("6790.5"));

        ItemT item2 = factory.createItemT();
        item2.setItemName("Seagate External HMM");
        item2.setPurchasedOn("August 24, 2012");
        item2.setAmount(new BigDecimal("6120.5"));

        ItemListT itemList = factory.createItemListT();
        itemList.getItem().add(item);
        itemList.getItem().add(item1);
        itemList.getItem().add(item2);
 
        ExpenseT expense = factory.createExpenseT();
        expense.setUser(user);
        expense.setItems(itemList);
        File file = new File("file2.xml");
        JAXBContext context = JAXBContext.newInstance("com.tkd.jaxb.item");
        JAXBElement<ExpenseT> element = factory.createExpenseReport(expense);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        marshaller.marshal(element, file);
        marshaller.marshal(element,System.out);
    }
/*    
	public static void main(String[] args) throws JAXBException{
        ObjectFactory factory = new ObjectFactory();
        PersonInfoType user = factory.createPersonInfoType();
        user.setFirstname("Runu");
        user.setLastname("Pradhan");
        
        File file = new File("file3.xml");
        JAXBContext context = JAXBContext.newInstance("com.tkd.jaxb.person");
        JAXBElement<PersonInfoType> item = factory.createEmployee(user);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        marshaller.marshal(item, file);
        marshaller.marshal(item,System.out);
    }
*/    
}
