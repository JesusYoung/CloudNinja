
package cn.com.yangshj.monitor.webservice.instance;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFocusResInsInfoObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFocusResInsInfoObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FocusResInsInfoObj" type="{http://obj.dev.bsm.mocha.com}FocusResInsInfoObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFocusResInsInfoObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "focusResInsInfoObj"
})
public class ArrayOfFocusResInsInfoObj {

    @XmlElement(name = "FocusResInsInfoObj", nillable = true)
    protected List<FocusResInsInfoObj> focusResInsInfoObj;

    /**
     * Gets the value of the focusResInsInfoObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the focusResInsInfoObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFocusResInsInfoObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FocusResInsInfoObj }
     * 
     * 
     */
    public List<FocusResInsInfoObj> getFocusResInsInfoObj() {
        if (focusResInsInfoObj == null) {
            focusResInsInfoObj = new ArrayList<FocusResInsInfoObj>();
        }
        return this.focusResInsInfoObj;
    }

}
