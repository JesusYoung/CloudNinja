
package cn.com.yangshj.monitor.webservice.busi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfBizsmListObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBizsmListObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BizsmListObj" type="{http://obj.dev.bsm.mocha.com}BizsmListObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBizsmListObj", propOrder = {
    "bizsmListObj"
})
public class ArrayOfBizsmListObj {

    @XmlElement(name = "BizsmListObj", nillable = true)
    protected List<BizsmListObj> bizsmListObj;

    /**
     * Gets the value of the bizsmListObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizsmListObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizsmListObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BizsmListObj }
     * 
     * 
     */
    public List<BizsmListObj> getBizsmListObj() {
        if (bizsmListObj == null) {
            bizsmListObj = new ArrayList<BizsmListObj>();
        }
        return this.bizsmListObj;
    }

}
