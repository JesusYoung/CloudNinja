
package cn.com.yangshj.monitor.webservice.alert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getNotificationListByServerTimeForAppResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getNotificationListByServerTimeForAppResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://obj.dev.bsm.mocha.com}ArrayOfNotificationListExtendObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNotificationListByServerTimeForAppResponse", propOrder = {
    "_return"
})
public class GetNotificationListByServerTimeForAppResponse {

    @XmlElement(name = "return")
    protected ArrayOfNotificationListExtendObj _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationListExtendObj }
     *     
     */
    public ArrayOfNotificationListExtendObj getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationListExtendObj }
     *     
     */
    public void setReturn(ArrayOfNotificationListExtendObj value) {
        this._return = value;
    }

}
