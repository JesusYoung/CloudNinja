
package cn.com.yangshj.monitor.webservice.metrics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryRealTimeMetricDataBatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryRealTimeMetricDataBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceInsIds" type="{http://impl.metricdata.dev.bsm.mocha.com/}ArrayOfString"/>
 *         &lt;element name="metricIds" type="{http://impl.metricdata.dev.bsm.mocha.com/}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryRealTimeMetricDataBatch", propOrder = {
    "resourceInsIds",
    "metricIds"
})
public class QueryRealTimeMetricDataBatch {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfString resourceInsIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString metricIds;

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

}
