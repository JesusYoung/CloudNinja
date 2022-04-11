
package cn.com.yangshj.monitor.webservice.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getItomConfigResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getItomConfigResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://impl.user.dev.bsm.mocha.com/}string2stringMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItomConfigResponse", propOrder = {
    "_return"
})
public class GetItomConfigResponse {

    @XmlElementRef(name = "return", namespace = "http://impl.user.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String2StringMap> _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String2StringMap }{@code >}
     *     
     */
    public JAXBElement<String2StringMap> getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String2StringMap }{@code >}
     *     
     */
    public void setReturn(JAXBElement<String2StringMap> value) {
        this._return = value;
    }

}
