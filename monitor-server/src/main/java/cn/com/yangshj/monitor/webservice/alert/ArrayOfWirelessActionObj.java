
package cn.com.yangshj.monitor.webservice.alert;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfWirelessActionObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWirelessActionObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WirelessActionObj" type="{http://obj.dev.bsm.mocha.com}WirelessActionObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWirelessActionObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "wirelessActionObj"
})
public class ArrayOfWirelessActionObj {

    @XmlElement(name = "WirelessActionObj", nillable = true)
    protected List<WirelessActionObj> wirelessActionObj;

    /**
     * Gets the value of the wirelessActionObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessActionObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessActionObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WirelessActionObj }
     * 
     * 
     */
    public List<WirelessActionObj> getWirelessActionObj() {
        if (wirelessActionObj == null) {
            wirelessActionObj = new ArrayList<WirelessActionObj>();
        }
        return this.wirelessActionObj;
    }

}
