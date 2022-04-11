
package cn.com.yangshj.monitor.webservice.metrics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>querySummaryMetricDataBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="querySummaryMetricDataBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceInsIds" type="{http://impl.metricdata.dev.bsm.mocha.com/}ArrayOfString"/>
 *         &lt;element name="metricIds" type="{http://impl.metricdata.dev.bsm.mocha.com/}ArrayOfString"/>
 *         &lt;element name="frequencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "querySummaryMetricDataBatch", propOrder = {
    "resourceInsIds",
    "metricIds",
    "frequencyId",
    "startDate",
    "endDate"
})
public class QuerySummaryMetricDataBatch {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfString resourceInsIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString metricIds;
    @XmlElementRef(name = "frequencyId", namespace = "http://impl.metricdata.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequencyId;
    protected long startDate;
    protected long endDate;

    /**
     * 获取resourceInsIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getResourceInsIds() {
        return resourceInsIds;
    }

    /**
     * 设置resourceInsIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setResourceInsIds(ArrayOfString value) {
        this.resourceInsIds = value;
    }

    /**
     * 获取metricIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMetricIds() {
        return metricIds;
    }

    /**
     * 设置metricIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMetricIds(ArrayOfString value) {
        this.metricIds = value;
    }

    /**
     * 获取frequencyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequencyId() {
        return frequencyId;
    }

    /**
     * 设置frequencyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequencyId(JAXBElement<String> value) {
        this.frequencyId = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     */
    public long getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     */
    public void setStartDate(long value) {
        this.startDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     */
    public long getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     */
    public void setEndDate(long value) {
        this.endDate = value;
    }

}
