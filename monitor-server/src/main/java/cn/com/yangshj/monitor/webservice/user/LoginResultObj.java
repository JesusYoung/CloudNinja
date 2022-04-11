
package cn.com.yangshj.monitor.webservice.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LoginResultObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LoginResultObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResultObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "loginDate",
    "loginResult",
    "token"
})
public class LoginResultObj {

    @XmlElementRef(name = "loginDate", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginDate;
    @XmlElementRef(name = "loginResult", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginResult;
    @XmlElementRef(name = "token", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;

    /**
     * 获取loginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginDate() {
        return loginDate;
    }

    /**
     * 设置loginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginDate(JAXBElement<String> value) {
        this.loginDate = value;
    }

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

}
