
package cn.com.yangshj.monitor.webservice.instance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getFocusResInsInfoInIds complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getFocusResInsInfoInIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceIds" type="{http://impl.instance.dev.bsm.mocha.com/}ArrayOfString"/>
 *         &lt;element name="timeMills" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFocusResInsInfoInIds", propOrder = {
    "token",
    "instanceIds",
    "timeMills"
})
public class GetFocusResInsInfoInIds {

    @XmlElementRef(name = "token", namespace = "http://impl.instance.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString instanceIds;
    @XmlElementRef(name = "timeMills", namespace = "http://impl.instance.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeMills;

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
    }

    /**
     * 获取instanceIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getInstanceIds() {
        return instanceIds;
    }

    /**
     * 设置instanceIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setInstanceIds(ArrayOfString value) {
        this.instanceIds = value;
    }

    /**
     * 获取timeMills属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeMills() {
        return timeMills;
    }

    /**
     * 设置timeMills属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeMills(JAXBElement<String> value) {
        this.timeMills = value;
    }

}
