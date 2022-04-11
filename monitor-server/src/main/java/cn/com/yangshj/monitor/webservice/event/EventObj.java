
package cn.com.yangshj.monitor.webservice.event;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EventObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EventObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarmRuleId" type="{http://impl.event.dev.bsm.mocha.com/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="dependencySystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="suppid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "alarmRuleId",
    "dependencySystem",
    "eventType",
    "firstTime",
    "ipAddress",
    "message",
    "objectName",
    "objectType",
    "serverity",
    "suppid"
})
public class EventObj {

    @XmlElementRef(name = "alarmRuleId", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> alarmRuleId;
    @XmlElementRef(name = "dependencySystem", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dependencySystem;
    @XmlElementRef(name = "eventType", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eventType;
    protected Long firstTime;
    @XmlElementRef(name = "ipAddress", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipAddress;
    @XmlElementRef(name = "message", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "objectName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectName;
    @XmlElementRef(name = "objectType", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectType;
    protected Integer serverity;
    @XmlElementRef(name = "suppid", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suppid;

    /**
     * 获取alarmRuleId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getAlarmRuleId() {
        return alarmRuleId;
    }

    /**
     * 设置alarmRuleId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setAlarmRuleId(JAXBElement<ArrayOfString> value) {
        this.alarmRuleId = value;
    }

    /**
     * 获取dependencySystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDependencySystem() {
        return dependencySystem;
    }

    /**
     * 设置dependencySystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDependencySystem(JAXBElement<String> value) {
        this.dependencySystem = value;
    }

    /**
     * 获取eventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventType() {
        return eventType;
    }

    /**
     * 设置eventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventType(JAXBElement<String> value) {
        this.eventType = value;
    }

    /**
     * 获取firstTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstTime() {
        return firstTime;
    }

    /**
     * 设置firstTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstTime(Long value) {
        this.firstTime = value;
    }

    /**
     * 获取ipAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置ipAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpAddress(JAXBElement<String> value) {
        this.ipAddress = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * 获取objectName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectName() {
        return objectName;
    }

    /**
     * 设置objectName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectName(JAXBElement<String> value) {
        this.objectName = value;
    }

    /**
     * 获取objectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectType(JAXBElement<String> value) {
        this.objectType = value;
    }

    /**
     * 获取serverity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServerity() {
        return serverity;
    }

    /**
     * 设置serverity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServerity(Integer value) {
        this.serverity = value;
    }

    /**
     * 获取suppid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuppid() {
        return suppid;
    }

    /**
     * 设置suppid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuppid(JAXBElement<String> value) {
        this.suppid = value;
    }

}
