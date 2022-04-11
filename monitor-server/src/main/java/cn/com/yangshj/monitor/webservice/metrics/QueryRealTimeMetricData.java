
package cn.com.yangshj.monitor.webservice.metrics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryRealTimeMetricData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryRealTimeMetricData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceInsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metricId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryRealTimeMetricData", propOrder = {
    "resourceInsId",
    "metricId"
})
public class QueryRealTimeMetricData {

    @XmlElementRef(name = "resourceInsId", namespace = "http://impl.metricdata.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceInsId;
    @XmlElementRef(name = "metricId", namespace = "http://impl.metricdata.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> metricId;

    /**
     * 获取resourceInsId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceInsId() {
        return resourceInsId;
    }

    /**
     * 设置resourceInsId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceInsId(JAXBElement<String> value) {
        this.resourceInsId = value;
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

}
