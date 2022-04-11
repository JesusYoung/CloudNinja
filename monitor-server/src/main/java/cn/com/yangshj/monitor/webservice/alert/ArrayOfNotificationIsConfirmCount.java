
package cn.com.yangshj.monitor.webservice.alert;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfNotificationIsConfirmCount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotificationIsConfirmCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationIsConfirmCount" type="{http://obj.dev.bsm.mocha.com}NotificationIsConfirmCount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotificationIsConfirmCount", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "notificationIsConfirmCount"
})
public class ArrayOfNotificationIsConfirmCount {

    @XmlElement(name = "NotificationIsConfirmCount", nillable = true)
    protected List<NotificationIsConfirmCount> notificationIsConfirmCount;

    /**
     * Gets the value of the notificationIsConfirmCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationIsConfirmCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationIsConfirmCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationIsConfirmCount }
     * 
     * 
     */
    public List<NotificationIsConfirmCount> getNotificationIsConfirmCount() {
        if (notificationIsConfirmCount == null) {
            notificationIsConfirmCount = new ArrayList<NotificationIsConfirmCount>();
        }
        return this.notificationIsConfirmCount;
    }

}
