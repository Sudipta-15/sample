package xml_poc.xml_poc.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ParentObject", namespace="example")
@XmlType(propOrder = {"objectId", "something", "childObjects"})
public class ParentObjectTO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String objectId;
	
	private String something;
	
	private List<ChildObjectTO> childObjects;

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}

	@XmlElementWrapper(name= "ChildObjects")
	@XmlElement(name = "ChildObject")
	public List<ChildObjectTO> getChildObjects() {
		return childObjects;
	}

	public void setChildObjects(List<ChildObjectTO> childObjects) {
		this.childObjects = childObjects;
	}

	
}
