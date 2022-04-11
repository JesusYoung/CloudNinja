
package cn.com.yangshj.monitor.webservice.metrics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SummaryFrequency complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SummaryFrequency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oneDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oneHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sixHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenMins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirtyMins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryFrequency", namespace = "http://metricdata.dev.bsm.mocha.com", propOrder = {
    "monitor",
    "oneDay",
    "oneHour",
    "sixHours",
    "tenMins",
    "thirtyMins"
})
public class SummaryFrequency {

    @XmlElementRef(name = "monitor", namespace = "http://metricdata.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monitor;
    @XmlElementRef(name = "oneDay", namespace = "http://metricdata.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oneDay;
    @XmlElementRef(name = "oneHour", namespace = "http://metricdata.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oneHour;
    @XmlElementRef(name = "sixHours", namespace = "http://metricdata.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sixHours;
    @XmlElementRef(name = "tenMins", namespace = "http://metricdata.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenMins;
    @XmlElementRef(name = "thirtyMins", namespace = "http://metricdata.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thirtyMins;

    /**
     * 获取monitor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonitor() {
        return monitor;
    }

    /**
     * 设置monitor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonitor(JAXBElement<String> value) {
        this.monitor = value;
    }

    /**
     * 获取oneDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOneDay() {
        return oneDay;
    }

    /**
     * 设置oneDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOneDay(JAXBElement<String> value) {
        this.oneDay = value;
    }

    /**
     * 获取oneHour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOneHour() {
        return oneHour;
    }

    /**
     * 设置oneHour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOneHour(JAXBElement<String> value) {
        this.oneHour = value;
    }

    /**
     * 获取sixHours属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSixHours() {
        return sixHours;
    }

    /**
     * 设置sixHours属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSixHours(JAXBElement<String> value) {
        this.sixHours = value;
    }

    /**
     * 获取tenMins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTenMins() {
        return tenMins;
    }

    /**
     * 设置tenMins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTenMins(JAXBElement<String> value) {
        this.tenMins = value;
    }

    /**
     * 获取thirtyMins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThirtyMins() {
        return thirtyMins;
    }

    /**
     * 设置thirtyMins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThirtyMins(JAXBElement<String> value) {
        this.thirtyMins = value;
    }

}
