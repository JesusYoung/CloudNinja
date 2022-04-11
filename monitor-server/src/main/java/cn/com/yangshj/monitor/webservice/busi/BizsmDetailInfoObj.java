
package cn.com.yangshj.monitor.webservice.busi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BizsmDetailInfoObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BizsmDetailInfoObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bizsmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizsmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizsmNotificationObj" type="{http://obj.dev.bsm.mocha.com}ArrayOfNotificationListExtendObj" minOccurs="0"/>
 *         &lt;element name="bizsmReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizsmRelaBizObj" type="{http://obj.dev.bsm.mocha.com}ArrayOfBizsmRelaBiz" minOccurs="0"/>
 *         &lt;element name="bizsmRelaDeptObj" type="{http://obj.dev.bsm.mocha.com}ArrayOfBizsmRelaDept" minOccurs="0"/>
 *         &lt;element name="bizsmRelaResInsObj" type="{http://obj.dev.bsm.mocha.com}ArrayOfBizsmRelaResIns" minOccurs="0"/>
 *         &lt;element name="bizsmRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizsmState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMonitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsiblePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BizsmDetailInfoObj", propOrder = {
    "bizsmId",
    "bizsmName",
    "bizsmNotificationObj",
    "bizsmReason",
    "bizsmRelaBizObj",
    "bizsmRelaDeptObj",
    "bizsmRelaResInsObj",
    "bizsmRemark",
    "bizsmState",
    "isMonitor",
    "loginResult",
    "responsiblePerson"
})
public class BizsmDetailInfoObj {

    @XmlElementRef(name = "bizsmId", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bizsmId;
    @XmlElementRef(name = "bizsmName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bizsmName;
    @XmlElementRef(name = "bizsmNotificationObj", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotificationListExtendObj> bizsmNotificationObj;
    @XmlElementRef(name = "bizsmReason", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bizsmReason;
    @XmlElementRef(name = "bizsmRelaBizObj", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBizsmRelaBiz> bizsmRelaBizObj;
    @XmlElementRef(name = "bizsmRelaDeptObj", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBizsmRelaDept> bizsmRelaDeptObj;
    @XmlElementRef(name = "bizsmRelaResInsObj", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBizsmRelaResIns> bizsmRelaResInsObj;
    @XmlElementRef(name = "bizsmRemark", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bizsmRemark;
    @XmlElementRef(name = "bizsmState", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bizsmState;
    @XmlElementRef(name = "isMonitor", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isMonitor;
    @XmlElementRef(name = "loginResult", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginResult;
    @XmlElementRef(name = "responsiblePerson", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsiblePerson;

    /**
     * 获取bizsmId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBizsmId() {
        return bizsmId;
    }

    /**
     * 设置bizsmId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBizsmId(JAXBElement<String> value) {
        this.bizsmId = value;
    }

    /**
     * 获取bizsmName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBizsmName() {
        return bizsmName;
    }

    /**
     * 设置bizsmName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBizsmName(JAXBElement<String> value) {
        this.bizsmName = value;
    }

    /**
     * 获取bizsmNotificationObj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotificationListExtendObj }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotificationListExtendObj> getBizsmNotificationObj() {
        return bizsmNotificationObj;
    }

    /**
     * 设置bizsmNotificationObj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotificationListExtendObj }{@code >}
     *     
     */
    public void setBizsmNotificationObj(JAXBElement<ArrayOfNotificationListExtendObj> value) {
        this.bizsmNotificationObj = value;
    }

    /**
     * 获取bizsmReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBizsmReason() {
        return bizsmReason;
    }

    /**
     * 设置bizsmReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBizsmReason(JAXBElement<String> value) {
        this.bizsmReason = value;
    }

    /**
     * 获取bizsmRelaBizObj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBizsmRelaBiz }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBizsmRelaBiz> getBizsmRelaBizObj() {
        return bizsmRelaBizObj;
    }

    /**
     * 设置bizsmRelaBizObj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBizsmRelaBiz }{@code >}
     *     
     */
    public void setBizsmRelaBizObj(JAXBElement<ArrayOfBizsmRelaBiz> value) {
        this.bizsmRelaBizObj = value;
    }

    /**
     * 获取bizsmRelaDeptObj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBizsmRelaDept }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBizsmRelaDept> getBizsmRelaDeptObj() {
        return bizsmRelaDeptObj;
    }

    /**
     * 设置bizsmRelaDeptObj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBizsmRelaDept }{@code >}
     *     
     */
    public void setBizsmRelaDeptObj(JAXBElement<ArrayOfBizsmRelaDept> value) {
        this.bizsmRelaDeptObj = value;
    }

    /**
     * 获取bizsmRelaResInsObj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBizsmRelaResIns }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBizsmRelaResIns> getBizsmRelaResInsObj() {
        return bizsmRelaResInsObj;
    }

    /**
     * 设置bizsmRelaResInsObj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBizsmRelaResIns }{@code >}
     *     
     */
    public void setBizsmRelaResInsObj(JAXBElement<ArrayOfBizsmRelaResIns> value) {
        this.bizsmRelaResInsObj = value;
    }

    /**
     * 获取bizsmRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBizsmRemark() {
        return bizsmRemark;
    }

    /**
     * 设置bizsmRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBizsmRemark(JAXBElement<String> value) {
        this.bizsmRemark = value;
    }

    /**
     * 获取bizsmState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBizsmState() {
        return bizsmState;
    }

    /**
     * 设置bizsmState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBizsmState(JAXBElement<String> value) {
        this.bizsmState = value;
    }

    /**
     * 获取isMonitor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsMonitor() {
        return isMonitor;
    }

    /**
     * 设置isMonitor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsMonitor(JAXBElement<String> value) {
        this.isMonitor = value;
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
     * 获取responsiblePerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsiblePerson() {
        return responsiblePerson;
    }

    /**
     * 设置responsiblePerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsiblePerson(JAXBElement<String> value) {
        this.responsiblePerson = value;
    }

}
