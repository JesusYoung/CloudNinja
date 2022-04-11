
package cn.com.yangshj.monitor.webservice.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addUser complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userObj" type="{http://obj.dev.bsm.mocha.com}ArrayOfUserObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addUser", propOrder = {
    "userObj"
})
public class AddUser {

    protected ArrayOfUserObj userObj;

    /**
     * 获取userObj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserObj }
     *     
     */
    public ArrayOfUserObj getUserObj() {
        return userObj;
    }

    /**
     * 设置userObj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserObj }
     *     
     */
    public void setUserObj(ArrayOfUserObj value) {
        this.userObj = value;
    }

}
