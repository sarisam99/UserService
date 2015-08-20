/**
 * 
 */
package com.mindtree.msdp.userservice.dto;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import com.mindtree.msdp.userservice.entity.DepartmentData;
import com.mindtree.msdp.userservice.entity.Group;
import com.mindtree.msdp.userservice.entity.UserData;



/**
 * @author M1018483
 * 
 */

public class JAXBMarshall {

	public static String marshalling(UserData data) {

		JAXBContext jaxbContext;
		String xml = null;
		try {
			jaxbContext = JAXBContext.newInstance(UserData.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(500);

			jaxbMarshaller.marshal(data, outputStream);

			xml = new String(outputStream.toByteArray());

			System.out.println(xml);

		} catch (JAXBException e) {
			System.out.println("Could not marshall the object");
			e.printStackTrace();
		}
		return xml;

	}
	
	public static String marshallingGroup(Group data) {

		JAXBContext jaxbContext;
		String xml = null;
		try {
			jaxbContext = JAXBContext.newInstance(Group.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(500);

			jaxbMarshaller.marshal(data, outputStream);

			xml = new String(outputStream.toByteArray());

			System.out.println(xml);

		} catch (JAXBException e) {
			System.out.println("Could not marshall the object");
			e.printStackTrace();
		}
		return xml;

	}

	public static String marshallingDepartmentData(DepartmentData data) {

		JAXBContext jaxbContext;
		String xml = null;
		try {
			jaxbContext = JAXBContext.newInstance(DepartmentData.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(500);

			jaxbMarshaller.marshal(data, outputStream);

			xml = new String(outputStream.toByteArray());

			System.out.println(xml);

		} catch (JAXBException e) {
			System.out.println("Could not marshall the object");
			e.printStackTrace();
		}
		return xml;

	}
	
	
	

}
