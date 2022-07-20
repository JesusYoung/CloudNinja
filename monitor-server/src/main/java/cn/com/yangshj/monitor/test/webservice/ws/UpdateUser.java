//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.07.19 时间 05:57:45 PM CST 
//


package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateUser complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="updateUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userObj" type="{http://obj.dev.bsm.mocha.com}ArrayOfUserObj" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUser", propOrder = {
    "userObj"
})
public class UpdateUser {

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
