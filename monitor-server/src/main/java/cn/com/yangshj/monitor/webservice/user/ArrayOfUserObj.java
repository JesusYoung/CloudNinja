
package cn.com.yangshj.monitor.webservice.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfUserObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserObj" type="{http://obj.dev.bsm.mocha.com}UserObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "userObj"
})
public class ArrayOfUserObj {

    @XmlElement(name = "UserObj", nillable = true)
    protected List<UserObj> userObj;

    /**
     * Gets the value of the userObj property.
     * 
     * <p>
     * This accessor method returns user reference to the live list,
     * not user snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not user <CODE>set</CODE> method for the userObj property.
     * 
     * <p>
     * For example, to add user new item, do as follows:
     * <pre>
     *    getUserObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserObj }
     * 
     * 
     */
    public List<UserObj> getUserObj() {
        if (userObj == null) {
            userObj = new ArrayList<UserObj>();
        }
        return this.userObj;
    }

}
