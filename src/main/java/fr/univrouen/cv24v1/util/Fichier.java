package fr.univrouen.cv24v1.util;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import java.io.IOException;
import java.io.InputStream;



public class Fichier {
	
	private Resource resource;
	
	public Fichier() {
		this.resource = new DefaultResourceLoader().getResource("xml/smallCV.xml");
	}
	
	public String getStringFromXMLFile() {
		String result ="";
		try {
			InputStream inputStream = resource.getInputStream();
			byte data[] = new byte[inputStream.available()];
			inputStream.read(data);
			inputStream.close();
			result = new String(data);
			return result;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println(ioe.getMessage());
		}
		return result;
	}
	
}
