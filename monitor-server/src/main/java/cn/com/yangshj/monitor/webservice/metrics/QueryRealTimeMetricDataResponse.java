
package cn.com.yangshj.monitor.webservice.metrics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryRealTimeMetricDataResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryRealTimeMetricDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://obj.dev.bsm.mocha.com}SimpleMetricData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryRealTimeMetricDataResponse", propOrder = {
    "_return"
})
public class QueryRealTimeMetricDataResponse {

    @XmlElement(name = "return")
    protected SimpleMetricData _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SimpleMetricData }
     *     
     */
    public SimpleMetricData getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMetricData }
     *     
     */
    public void setReturn(SimpleMetricData value) {
        this._return = value;
    }

}
