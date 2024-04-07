
package com.example.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SuperVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SuperVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dirty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="primaryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuperVO", propOrder = {
    "status",
    "dirty",
    "primaryKey"
})
public abstract class SuperVO {

    protected int status;
    protected boolean dirty;
    @XmlElement(required = true)
    protected String primaryKey;

    /**
     * 获取status属性的值。
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * 获取dirty属性的值。
     * 
     */
    public boolean isDirty() {
        return dirty;
    }

    /**
     * 设置dirty属性的值。
     * 
     */
    public void setDirty(boolean value) {
        this.dirty = value;
    }

    /**
     * 获取primaryKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryKey() {
        return primaryKey;
    }

    /**
     * 设置primaryKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryKey(String value) {
        this.primaryKey = value;
    }

}
