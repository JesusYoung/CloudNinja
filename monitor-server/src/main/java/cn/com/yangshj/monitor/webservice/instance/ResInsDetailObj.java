
package cn.com.yangshj.monitor.webservice.instance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResInsDetailObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResInsDetailObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availMetric" type="{http://obj.dev.bsm.mocha.com}ArrayOfInfo" minOccurs="0"/>
 *         &lt;element name="baseInfo" type="{http://obj.dev.bsm.mocha.com}ArrayOfInfo" minOccurs="0"/>
 *         &lt;element name="componentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configMetric" type="{http://obj.dev.bsm.mocha.com}ArrayOfInfo" minOccurs="0"/>
 *         &lt;element name="infoMetric" type="{http://obj.dev.bsm.mocha.com}ArrayOfInfo" minOccurs="0"/>
 *         &lt;element name="instanceCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isChildInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monitorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentInstanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performMetric" type="{http://obj.dev.bsm.mocha.com}ArrayOfInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResInsDetailObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "availMetric",
    "baseInfo",
    "componentType",
    "configMetric",
    "infoMetric",
    "instanceCategoryId",
    "instanceCategoryName",
    "instanceId",
    "instanceName",
    "instanceState",
    "ipAddress",
    "isChildInstance",
    "loginResult",
    "monitorState",
    "parentInstanceName",
    "performMetric"
})
public class ResInsDetailObj {

    @XmlElementRef(name = "availMetric", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInfo> availMetric;
    @XmlElementRef(name = "baseInfo", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInfo> baseInfo;
    @XmlElementRef(name = "componentType", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentType;
    @XmlElementRef(name = "configMetric", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInfo> configMetric;
    @XmlElementRef(name = "infoMetric", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInfo> infoMetric;
    @XmlElementRef(name = "instanceCategoryId", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceCategoryId;
    @XmlElementRef(name = "instanceCategoryName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceCategoryName;
    @XmlElementRef(name = "instanceId", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceId;
    @XmlElementRef(name = "instanceName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceName;
    @XmlElementRef(name = "instanceState", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceState;
    @XmlElementRef(name = "ipAddress", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipAddress;
    @XmlElementRef(name = "isChildInstance", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isChildInstance;
    @XmlElementRef(name = "loginResult", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginResult;
    @XmlElementRef(name = "monitorState", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitorState;
    @XmlElementRef(name = "parentInstanceName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentInstanceName;
    @XmlElementRef(name = "performMetric", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInfo> performMetric;

    /**
     * 获取availMetric属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInfo> getAvailMetric() {
        return availMetric;
    }

    /**
     * 设置availMetric属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public void setAvailMetric(JAXBElement<ArrayOfInfo> value) {
        this.availMetric = value;
    }

    /**
     * 获取baseInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInfo> getBaseInfo() {
        return baseInfo;
    }

    /**
     * 设置baseInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public void setBaseInfo(JAXBElement<ArrayOfInfo> value) {
        this.baseInfo = value;
    }

    /**
     * 获取componentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentType() {
        return componentType;
    }

    /**
     * 设置componentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentType(JAXBElement<String> value) {
        this.componentType = value;
    }

    /**
     * 获取configMetric属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInfo> getConfigMetric() {
        return configMetric;
    }

    /**
     * 设置configMetric属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public void setConfigMetric(JAXBElement<ArrayOfInfo> value) {
        this.configMetric = value;
    }

    /**
     * 获取infoMetric属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInfo> getInfoMetric() {
        return infoMetric;
    }

    /**
     * 设置infoMetric属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public void setInfoMetric(JAXBElement<ArrayOfInfo> value) {
        this.infoMetric = value;
    }

    /**
     * 获取instanceCategoryId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceCategoryId() {
        return instanceCategoryId;
    }

    /**
     * 设置instanceCategoryId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceCategoryId(JAXBElement<String> value) {
        this.instanceCategoryId = value;
    }

    /**
     * 获取instanceCategoryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceCategoryName() {
        return instanceCategoryName;
    }

    /**
     * 设置instanceCategoryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceCategoryName(JAXBElement<String> value) {
        this.instanceCategoryName = value;
    }

    /**
     * 获取instanceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceId() {
        return instanceId;
    }

    /**
     * 设置instanceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceId(JAXBElement<String> value) {
        this.instanceId = value;
    }

    /**
     * 获取instanceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceName() {
        return instanceName;
    }

    /**
     * 设置instanceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceName(JAXBElement<String> value) {
        this.instanceName = value;
    }

    /**
     * 获取instanceState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceState() {
        return instanceState;
    }

    /**
     * 设置instanceState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceState(JAXBElement<String> value) {
        this.instanceState = value;
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
     * 获取isChildInstance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsChildInstance() {
        return isChildInstance;
    }

    /**
     * 设置isChildInstance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsChildInstance(JAXBElement<String> value) {
        this.isChildInstance = value;
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
     * 获取monitorState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitorState() {
        return monitorState;
    }

    /**
     * 设置monitorState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitorState(JAXBElement<String> value) {
        this.monitorState = value;
    }

    /**
     * 获取parentInstanceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentInstanceName() {
        return parentInstanceName;
    }

    /**
     * 设置parentInstanceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentInstanceName(JAXBElement<String> value) {
        this.parentInstanceName = value;
    }

    /**
     * 获取performMetric属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInfo> getPerformMetric() {
        return performMetric;
    }

    /**
     * 设置performMetric属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfo }{@code >}
     *     
     */
    public void setPerformMetric(JAXBElement<ArrayOfInfo> value) {
        this.performMetric = value;
    }

}
