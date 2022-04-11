
package cn.com.yangshj.monitor.webservice.instance;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfResourceCategoryObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResourceCategoryObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceCategoryObj" type="{http://obj.dev.bsm.mocha.com}ResourceCategoryObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResourceCategoryObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "resourceCategoryObj"
})
public class ArrayOfResourceCategoryObj {

    @XmlElement(name = "ResourceCategoryObj", nillable = true)
    protected List<ResourceCategoryObj> resourceCategoryObj;

    /**
     * Gets the value of the resourceCategoryObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceCategoryObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceCategoryObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceCategoryObj }
     * 
     * 
     */
    public List<ResourceCategoryObj> getResourceCategoryObj() {
        if (resourceCategoryObj == null) {
            resourceCategoryObj = new ArrayList<ResourceCategoryObj>();
        }
        return this.resourceCategoryObj;
    }

}
