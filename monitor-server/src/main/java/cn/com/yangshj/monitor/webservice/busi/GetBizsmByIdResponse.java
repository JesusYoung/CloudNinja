
package cn.com.yangshj.monitor.webservice.busi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getBizsmByIdResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getBizsmByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://obj.dev.bsm.mocha.com}BizsmDetailInfoObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBizsmByIdResponse", namespace = "http://impl.bizsm.dev.bsm.mocha.com/", propOrder = {
    "_return"
})
public class GetBizsmByIdResponse {

    @XmlElement(name = "return")
    protected BizsmDetailInfoObj _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BizsmDetailInfoObj }
     *     
     */
    public BizsmDetailInfoObj getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BizsmDetailInfoObj }
     *     
     */
    public void setReturn(BizsmDetailInfoObj value) {
        this._return = value;
    }

}
