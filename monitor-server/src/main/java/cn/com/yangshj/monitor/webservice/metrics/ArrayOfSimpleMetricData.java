
package cn.com.yangshj.monitor.webservice.metrics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSimpleMetricData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSimpleMetricData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SimpleMetricData" type="{http://obj.dev.bsm.mocha.com}SimpleMetricData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSimpleMetricData", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "simpleMetricData"
})
public class ArrayOfSimpleMetricData {

    @XmlElement(name = "SimpleMetricData", nillable = true)
    protected List<SimpleMetricData> simpleMetricData;

    /**
     * Gets the value of the simpleMetricData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleMetricData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleMetricData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleMetricData }
     * 
     * 
     */
    public List<SimpleMetricData> getSimpleMetricData() {
        if (simpleMetricData == null) {
            simpleMetricData = new ArrayList<SimpleMetricData>();
        }
        return this.simpleMetricData;
    }

}
