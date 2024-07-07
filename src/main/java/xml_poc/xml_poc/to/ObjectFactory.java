package xml_poc.xml_poc.to;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
	
	public ObjectFactory() {
		
	}
	
	public ParentObjectTO createParentObjectTO() {
		return new ParentObjectTO();
	}
	
	public ChildObjectTO createChildObjectTO() {
		return new ChildObjectTO();
	}
	

}