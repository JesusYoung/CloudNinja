
package cn.com.yangshj.monitor.webservice.busi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BizsmRelaDept complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BizsmRelaDept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessDeptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessDeptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BizsmRelaDept", propOrder = {
    "businessDeptId",
    "businessDeptName"
})
public class BizsmRelaDept {

    @XmlElementRef(name = "businessDeptId", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessDeptId;
    @XmlElementRef(name = "businessDeptName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessDeptName;

    /**
     * 获取businessDeptId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessDeptId() {
        return businessDeptId;
    }

    /**
     * 设置businessDeptId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessDeptId(JAXBElement<String> value) {
        this.businessDeptId = value;
    }

    /**
     * 获取businessDeptName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessDeptName() {
        return businessDeptName;
    }

    /**
     * 设置businessDeptName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessDeptName(JAXBElement<String> value) {
        this.businessDeptName = value;
    }

}
