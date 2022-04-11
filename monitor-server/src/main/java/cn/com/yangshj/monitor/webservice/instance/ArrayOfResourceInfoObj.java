
package cn.com.yangshj.monitor.webservice.instance;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfResourceInfoObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResourceInfoObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceInfoObj" type="{http://obj.dev.bsm.mocha.com}ResourceInfoObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResourceInfoObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "resourceInfoObj"
})
public class ArrayOfResourceInfoObj {

    @XmlElement(name = "ResourceInfoObj", nillable = true)
    protected List<ResourceInfoObj> resourceInfoObj;

    /**
     * Gets the value of the resourceInfoObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceInfoObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceInfoObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceInfoObj }
     * 
     * 
     */
    public List<ResourceInfoObj> getResourceInfoObj() {
        if (resourceInfoObj == null) {
            resourceInfoObj = new ArrayList<ResourceInfoObj>();
        }
        return this.resourceInfoObj;
    }

}
