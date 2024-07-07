package xml_poc.xml_poc.to;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class ChildObjects {
	
	List<ChildObjectTO> childObjects;

	@XmlElement(name="ChildObject")
	public List<ChildObjectTO> getChildObjects() {
		return childObjects;
	}

	public void setChildObjects(List<ChildObjectTO> childObjects) {
		this.childObjects = childObjects;
	}
	
	
	
}
