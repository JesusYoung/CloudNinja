
package cn.com.yangshj.monitor.webservice.busi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getBizsmListResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getBizsmListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://obj.dev.bsm.mocha.com}ArrayOfBizsmListObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBizsmListResponse", namespace = "http://impl.bizsm.dev.bsm.mocha.com/", propOrder = {
    "_return"
})
public class GetBizsmListResponse {

    @XmlElement(name = "return")
    protected ArrayOfBizsmListObj _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBizsmListObj }
     *     
     */
    public ArrayOfBizsmListObj getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBizsmListObj }
     *     
     */
    public void setReturn(ArrayOfBizsmListObj value) {
        this._return = value;
    }

}
