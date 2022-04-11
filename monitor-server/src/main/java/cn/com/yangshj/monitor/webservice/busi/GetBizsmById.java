
package cn.com.yangshj.monitor.webservice.busi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getBizsmById complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getBizsmById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizsmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchRelaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBizsmById", namespace = "http://impl.bizsm.dev.bsm.mocha.com/", propOrder = {
    "token",
    "bizsmId",
    "searchRelaName"
})
public class GetBizsmById {

    @XmlElementRef(name = "token", namespace = "http://impl.bizsm.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;
    @XmlElementRef(name = "bizsmId", namespace = "http://impl.bizsm.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bizsmId;
    @XmlElementRef(name = "searchRelaName", namespace = "http://impl.bizsm.dev.bsm.mocha.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> searchRelaName;

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = value;
    }

    /**
     * 获取bizsmId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBizsmId() {
        return bizsmId;
    }

    /**
     * 设置bizsmId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBizsmId(JAXBElement<String> value) {
        this.bizsmId = value;
    }

    /**
     * 获取searchRelaName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSearchRelaName() {
        return searchRelaName;
    }

    /**
     * 设置searchRelaName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSearchRelaName(JAXBElement<String> value) {
        this.searchRelaName = value;
    }

}
