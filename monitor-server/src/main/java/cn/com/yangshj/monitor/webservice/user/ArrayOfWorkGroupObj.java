
package cn.com.yangshj.monitor.webservice.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfWorkGroupObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkGroupObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkGroupObj" type="{http://obj.dev.bsm.mocha.com}WorkGroupObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkGroupObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "workGroupObj"
})
public class ArrayOfWorkGroupObj {

    @XmlElement(name = "WorkGroupObj", nillable = true)
    protected List<WorkGroupObj> workGroupObj;

    /**
     * Gets the value of the workGroupObj property.
     * 
     * <p>
     * This accessor method returns user reference to the live list,
     * not user snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not user <CODE>set</CODE> method for the workGroupObj property.
     * 
     * <p>
     * For example, to add user new item, do as follows:
     * <pre>
     *    getWorkGroupObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkGroupObj }
     * 
     * 
     */
    public List<WorkGroupObj> getWorkGroupObj() {
        if (workGroupObj == null) {
            workGroupObj = new ArrayList<WorkGroupObj>();
        }
        return this.workGroupObj;
    }

}
