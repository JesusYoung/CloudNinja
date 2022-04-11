
package cn.com.yangshj.monitor.webservice.alert;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfNotificationListObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotificationListObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationListObj" type="{http://obj.dev.bsm.mocha.com}NotificationListObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotificationListObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "notificationListObj"
})
public class ArrayOfNotificationListObj {

    @XmlElement(name = "NotificationListObj", nillable = true)
    protected List<NotificationListObj> notificationListObj;

    /**
     * Gets the value of the notificationListObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationListObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationListObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationListObj }
     * 
     * 
     */
    public List<NotificationListObj> getNotificationListObj() {
        if (notificationListObj == null) {
            notificationListObj = new ArrayList<NotificationListObj>();
        }
        return this.notificationListObj;
    }

}
