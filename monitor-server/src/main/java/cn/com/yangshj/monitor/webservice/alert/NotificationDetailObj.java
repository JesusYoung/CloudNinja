
package cn.com.yangshj.monitor.webservice.alert;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotificationDetailObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NotificationDetailObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionList" type="{http://obj.dev.bsm.mocha.com}ArrayOfWirelessActionObj" minOccurs="0"/>
 *         &lt;element name="loginResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maintenancePeople" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceList" type="{http://obj.dev.bsm.mocha.com}ArrayOfNotificationServiceListObj" minOccurs="0"/>
 *         &lt;element name="telPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDetailObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "actionList",
    "loginResult",
    "maintenancePeople",
    "serviceList",
    "telPhone"
})
public class NotificationDetailObj {

    @XmlElementRef(name = "actionList", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWirelessActionObj> actionList;
    @XmlElementRef(name = "loginResult", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginResult;
    @XmlElementRef(name = "maintenancePeople", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maintenancePeople;
    @XmlElementRef(name = "serviceList", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotificationServiceListObj> serviceList;
    @XmlElementRef(name = "telPhone", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telPhone;

    /**
     * 获取actionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWirelessActionObj }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWirelessActionObj> getActionList() {
        return actionList;
    }

    /**
     * 设置actionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWirelessActionObj }{@code >}
     *     
     */
    public void setActionList(JAXBElement<ArrayOfWirelessActionObj> value) {
        this.actionList = value;
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
     * 获取maintenancePeople属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaintenancePeople() {
        return maintenancePeople;
    }

    /**
     * 设置maintenancePeople属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaintenancePeople(JAXBElement<String> value) {
        this.maintenancePeople = value;
    }

    /**
     * 获取serviceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotificationServiceListObj }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotificationServiceListObj> getServiceList() {
        return serviceList;
    }

    /**
     * 设置serviceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotificationServiceListObj }{@code >}
     *     
     */
    public void setServiceList(JAXBElement<ArrayOfNotificationServiceListObj> value) {
        this.serviceList = value;
    }

    /**
     * 获取telPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelPhone() {
        return telPhone;
    }

    /**
     * 设置telPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelPhone(JAXBElement<String> value) {
        this.telPhone = value;
    }

}
