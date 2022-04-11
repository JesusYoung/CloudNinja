
package cn.com.yangshj.monitor.webservice.metrics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SummarizedMetricData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SummarizedMetricData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avgValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metricId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummarizedMetricData", namespace = "http://obj.basedata.bsm.mocha.com", propOrder = {
    "avgValue",
    "dateTime",
    "instanceId",
    "maxValue",
    "metricId",
    "minValue"
})
public class SummarizedMetricData {

    @XmlElementRef(name = "avgValue", namespace = "http://obj.basedata.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> avgValue;
    protected Long dateTime;
    @XmlElementRef(name = "instanceId", namespace = "http://obj.basedata.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceId;
    @XmlElementRef(name = "maxValue", namespace = "http://obj.basedata.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maxValue;
    @XmlElementRef(name = "metricId", namespace = "http://obj.basedata.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> metricId;
    @XmlElementRef(name = "minValue", namespace = "http://obj.basedata.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minValue;

    /**
     * 获取avgValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvgValue() {
        return avgValue;
    }

    /**
     * 设置avgValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvgValue(JAXBElement<String> value) {
        this.avgValue = value;
    }

    /**
     * 获取dateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDateTime() {
        return dateTime;
    }

    /**
     * 设置dateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDateTime(Long value) {
        this.dateTime = value;
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
     * 获取maxValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxValue() {
        return maxValue;
    }

    /**
     * 设置maxValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxValue(JAXBElement<String> value) {
        this.maxValue = value;
    }

    /**
     * 获取metricId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMetricId() {
        return metricId;
    }

    /**
     * 设置metricId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMetricId(JAXBElement<String> value) {
        this.metricId = value;
    }

    /**
     * 获取minValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinValue() {
        return minValue;
    }

    /**
     * 设置minValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinValue(JAXBElement<String> value) {
        this.minValue = value;
    }

}
