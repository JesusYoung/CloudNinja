
package cn.com.yangshj.monitor.webservice.instance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InstanceResultObj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InstanceResultObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instCountByState" type="{http://impl.instance.dev.bsm.mocha.com/}string2stringMap" minOccurs="0"/>
 *         &lt;element name="loginResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resInsDetailObj" type="{http://obj.dev.bsm.mocha.com}ArrayOfResInsDetailObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceResultObj", namespace = "http://obj.dev.bsm.mocha.com", propOrder = {
    "instCountByState",
    "loginResult",
    "resInsDetailObj"
})
public class InstanceResultObj {

    @XmlElementRef(name = "instCountByState", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String2StringMap> instCountByState;
    @XmlElementRef(name = "loginResult", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginResult;
    @XmlElementRef(name = "resInsDetailObj", namespace = "http://obj.dev.bsm.mocha.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResInsDetailObj> resInsDetailObj;

    /**
     * 获取instCountByState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String2StringMap }{@code >}
     *     
     */
    public JAXBElement<String2StringMap> getInstCountByState() {
        return instCountByState;
    }

    /**
     * 设置instCountByState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String2StringMap }{@code >}
     *     
     */
    public void setInstCountByState(JAXBElement<String2StringMap> value) {
        this.instCountByState = value;
    }

    /**
     * 获取loginResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginResult() {
        return loginResult;
    }

    /**
     * 设置loginResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginResult(JAXBElement<String> value) {
        this.loginResult = value;
    }

    /**
     * 获取resInsDetailObj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResInsDetailObj }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResInsDetailObj> getResInsDetailObj() {
        return resInsDetailObj;
    }

    /**
     * 设置resInsDetailObj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResInsDetailObj }{@code >}
     *     
     */
    public void setResInsDetailObj(JAXBElement<ArrayOfResInsDetailObj> value) {
        this.resInsDetailObj = value;
    }

}
