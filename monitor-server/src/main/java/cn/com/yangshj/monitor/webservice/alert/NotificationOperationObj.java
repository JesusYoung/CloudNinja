
package cn.com.yangshj.monitor.webservice.alert;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotificationOperationObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NotificationOperationObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationOperationObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "loginResult",
    "operationflag"
})
public class NotificationOperationObj {

    @XmlElementRef(name = "loginResult", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginResult;
    @XmlElementRef(name = "operationflag", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationflag;

    /**
     * 获取loginResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginResult() {
        return loginResult;
    }

    /**
     * 设置loginResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginResult(JAXBElement<String> value) {
        this.loginResult = value;
    }

    /**
     * 获取operationflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationflag() {
        return operationflag;
    }

    /**
     * 设置operationflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationflag(JAXBElement<String> value) {
        this.operationflag = value;
    }

}
