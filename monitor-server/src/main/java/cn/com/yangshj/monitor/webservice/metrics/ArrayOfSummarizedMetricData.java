
package cn.com.yangshj.monitor.webservice.metrics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSummarizedMetricData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSummarizedMetricData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummarizedMetricData" type="{http://obj.basedata.bsm.mocha.com}SummarizedMetricData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSummarizedMetricData", namespace = "http://obj.basedata.bsm.mocha.com", propOrder = {
    "summarizedMetricData"
})
public class ArrayOfSummarizedMetricData {

    @XmlElement(name = "SummarizedMetricData", nillable = true)
    protected List<SummarizedMetricData> summarizedMetricData;

    /**
     * Gets the value of the summarizedMetricData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarizedMetricData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarizedMetricData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummarizedMetricData }
     * 
     * 
     */
    public List<SummarizedMetricData> getSummarizedMetricData() {
        if (summarizedMetricData == null) {
            summarizedMetricData = new ArrayList<SummarizedMetricData>();
        }
        return this.summarizedMetricData;
    }

}
