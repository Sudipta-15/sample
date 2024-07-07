package xml_poc.xml_poc;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import xml_poc.xml_poc.to.ChildObjectTO;
import xml_poc.xml_poc.to.ChildObjects;
import xml_poc.xml_poc.to.ParentObjectTO;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws JAXBException {
    	ChildObjectTO childObject = new ChildObjectTO();
    	childObject.setAttribute("attribute");
    	
    	ChildObjectTO childObject2 = new ChildObjectTO();
    	childObject2.setAttribute("attribute2");
    	
    	ChildObjectTO childObject3 = new ChildObjectTO();
    	
    	List<ChildObjectTO> childObjects = new ArrayList<ChildObjectTO>();
    	childObjects.add(childObject);
    	childObjects.add(childObject2);
    	childObjects.add(childObject3);
    	
    	ParentObjectTO parentObject = new ParentObjectTO();
    	parentObject.setObjectId("1234");
    	parentObject.setSomething("something");
    	parentObject.setChildObjects(childObjects);
    	
    	
    	
    	JAXBContext context = JAXBContext.newInstance("xml_poc.xml_poc.to");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        
        
        StringWriter writer = new StringWriter();
        marshaller.marshal(parentObject, writer);
        System.out.println(writer.toString());
        

    }
}
