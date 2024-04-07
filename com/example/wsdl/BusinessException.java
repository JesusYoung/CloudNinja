
package com.example.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessException complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusinessException">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.uap.nc/lang}Exception">
 *       &lt;sequence>
 *         &lt;element name="errorCodeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessException", namespace = "http://pub.vo.nc/BusinessException", propOrder = {
    "errorCodeString",
    "hint"
})
public class BusinessException
    extends Exception
{

    @XmlElementRef(name = "errorCodeString", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCodeString;
    @XmlElementRef(name = "hint", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hint;

    /**
     * 获取errorCodeString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCodeString() {
        return errorCodeString;
    }

    /**
     * 设置errorCodeString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCodeString(JAXBElement<String> value) {
        this.errorCodeString = value;
    }

    /**
     * 获取hint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHint() {
        return hint;
    }

    /**
     * 设置hint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHint(JAXBElement<String> value) {
        this.hint = value;
    }

}
