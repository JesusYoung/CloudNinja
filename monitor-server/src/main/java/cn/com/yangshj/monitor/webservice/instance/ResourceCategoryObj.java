
package cn.com.yangshj.monitor.webservice.instance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResourceCategoryObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResourceCategoryObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childResourceCategory" type="{http://obj.dev.bsm.mocha.com}ArrayOfResourceCategoryObj" minOccurs="0"/>
 *         &lt;element name="resourceCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceCategoryObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "childResourceCategory",
    "resourceCategoryId",
    "resourceCategoryName"
})
public class ResourceCategoryObj {

    @XmlElementRef(name = "childResourceCategory", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceCategoryObj> childResourceCategory;
    @XmlElementRef(name = "resourceCategoryId", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceCategoryId;
    @XmlElementRef(name = "resourceCategoryName", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceCategoryName;

    /**
     * 获取childResourceCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceCategoryObj }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResourceCategoryObj> getChildResourceCategory() {
        return childResourceCategory;
    }

    /**
     * 设置childResourceCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceCategoryObj }{@code >}
     *     
     */
    public void setChildResourceCategory(JAXBElement<ArrayOfResourceCategoryObj> value) {
        this.childResourceCategory = value;
    }

    /**
     * 获取resourceCategoryId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceCategoryId() {
        return resourceCategoryId;
    }

    /**
     * 设置resourceCategoryId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceCategoryId(JAXBElement<String> value) {
        this.resourceCategoryId = value;
    }

    /**
     * 获取resourceCategoryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceCategoryName() {
        return resourceCategoryName;
    }

    /**
     * 设置resourceCategoryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceCategoryName(JAXBElement<String> value) {
        this.resourceCategoryName = value;
    }

}
