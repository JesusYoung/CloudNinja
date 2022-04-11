
package cn.com.yangshj.monitor.webservice.event;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getHistoryEventListByServerTime complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getHistoryEventListByServerTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleId" type="{http://impl.event.dev.bsm.mocha.com/}ArrayOfString"/>
 *         &lt;element name="eventGroupId" type="{http://impl.event.dev.bsm.mocha.com/}ArrayOfString"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getHistoryEventListByServerTime", propOrder = {
    "token",
    "moduleId",
    "eventGroupId",
    "objectName",
    "pageSize",
    "currentPage",
    "timeMills"
})
public class GetHistoryEventListByServerTime {

    @XmlElementRef(name = "token", namespace = "http://impl.event.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString moduleId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString eventGroupId;
    @XmlElementRef(name = "objectName", namespace = "http://impl.event.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectName;
    @XmlElementRef(name = "pageSize", namespace = "http://impl.event.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageSize;
    @XmlElementRef(name = "currentPage", namespace = "http://impl.event.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentPage;
    @XmlElementRef(name = "timeMills", namespace = "http://impl.event.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
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
     * 获取moduleId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getModuleId() {
        return moduleId;
    }

    /**
     * 设置moduleId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setModuleId(ArrayOfString value) {
        this.moduleId = value;
    }

    /**
     * 获取eventGroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getEventGroupId() {
        return eventGroupId;
    }

    /**
     * 设置eventGroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setEventGroupId(ArrayOfString value) {
        this.eventGroupId = value;
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
     * 获取pageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageSize(JAXBElement<String> value) {
        this.pageSize = value;
    }

    /**
     * 获取currentPage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置currentPage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentPage(JAXBElement<String> value) {
        this.currentPage = value;
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
