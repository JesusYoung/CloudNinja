
package cn.com.yangshj.monitor.webservice.busi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BizsmRelaBiz complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BizsmRelaBiz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessRelaBizAlarmNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessRelaBizId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessRelaBizName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessRelaBizResNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessRelaBizState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BizsmRelaBiz", propOrder = {
    "businessRelaBizAlarmNum",
    "businessRelaBizId",
    "businessRelaBizName",
    "businessRelaBizResNum",
    "businessRelaBizState"
})
public class BizsmRelaBiz {

    @XmlElementRef(name = "businessRelaBizAlarmNum", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessRelaBizAlarmNum;
    @XmlElementRef(name = "businessRelaBizId", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessRelaBizId;
    @XmlElementRef(name = "businessRelaBizName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessRelaBizName;
    @XmlElementRef(name = "businessRelaBizResNum", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessRelaBizResNum;
    @XmlElementRef(name = "businessRelaBizState", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessRelaBizState;

    /**
     * 获取businessRelaBizAlarmNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessRelaBizAlarmNum() {
        return businessRelaBizAlarmNum;
    }

    /**
     * 设置businessRelaBizAlarmNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessRelaBizAlarmNum(JAXBElement<String> value) {
        this.businessRelaBizAlarmNum = value;
    }

    /**
     * 获取businessRelaBizId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessRelaBizId() {
        return businessRelaBizId;
    }

    /**
     * 设置businessRelaBizId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessRelaBizId(JAXBElement<String> value) {
        this.businessRelaBizId = value;
    }

    /**
     * 获取businessRelaBizName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessRelaBizName() {
        return businessRelaBizName;
    }

    /**
     * 设置businessRelaBizName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessRelaBizName(JAXBElement<String> value) {
        this.businessRelaBizName = value;
    }

    /**
     * 获取businessRelaBizResNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessRelaBizResNum() {
        return businessRelaBizResNum;
    }

    /**
     * 设置businessRelaBizResNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessRelaBizResNum(JAXBElement<String> value) {
        this.businessRelaBizResNum = value;
    }

    /**
     * 获取businessRelaBizState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessRelaBizState() {
        return businessRelaBizState;
    }

    /**
     * 设置businessRelaBizState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessRelaBizState(JAXBElement<String> value) {
        this.businessRelaBizState = value;
    }

}
