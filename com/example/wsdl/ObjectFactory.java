
package com.example.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://ws.uap.nc/lang", "Exception");
    private final static QName _IllegalArgumentException_QNAME = new QName("http://ws.uap.nc/lang", "IllegalArgumentException");
    private final static QName _Throwable_QNAME = new QName("http://ws.uap.nc/lang", "Throwable");
    private final static QName _StackTraceElement_QNAME = new QName("http://ws.uap.nc/lang", "StackTraceElement");
    private final static QName _BusinessException_QNAME = new QName("http://pub.vo.nc/BusinessException", "BusinessException");
    private final static QName _NullPointerException_QNAME = new QName("http://ws.uap.nc/lang", "NullPointerException");
    private final static QName _RuntimeException_QNAME = new QName("http://ws.uap.nc/lang", "RuntimeException");
    private final static QName _BusinessExceptionErrorCodeString_QNAME = new QName("", "errorCodeString");
    private final static QName _BusinessExceptionHint_QNAME = new QName("", "hint");
    private final static QName _TsCostCenterString_QNAME = new QName("", "string");
    private final static QName _TsCostCenterString1_QNAME = new QName("", "string1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TsCostCenter }
     * 
     */
    public TsCostCenter createTsCostCenter() {
        return new TsCostCenter();
    }

    /**
     * Create an instance of {@link TsCostCenterResponse }
     * 
     */
    public TsCostCenterResponse createTsCostCenterResponse() {
        return new TsCostCenterResponse();
    }

    /**
     * Create an instance of {@link BusinessException }
     * 
     */
    public BusinessException createBusinessException() {
        return new BusinessException();
    }

    /**
     * Create an instance of {@link RuntimeException }
     * 
     */
    public RuntimeException createRuntimeException() {
        return new RuntimeException();
    }

    /**
     * Create an instance of {@link NullPointerException }
     * 
     */
    public NullPointerException createNullPointerException() {
        return new NullPointerException();
    }

    /**
     * Create an instance of {@link Urc }
     * 
     */
    public Urc createUrc() {
        return new Urc();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link IllegalArgumentException }
     * 
     */
    public IllegalArgumentException createIllegalArgumentException() {
        return new IllegalArgumentException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uap.nc/lang", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalArgumentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uap.nc/lang", name = "IllegalArgumentException")
    public JAXBElement<IllegalArgumentException> createIllegalArgumentException(IllegalArgumentException value) {
        return new JAXBElement<IllegalArgumentException>(_IllegalArgumentException_QNAME, IllegalArgumentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Throwable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uap.nc/lang", name = "Throwable")
    public JAXBElement<Throwable> createThrowable(Throwable value) {
        return new JAXBElement<Throwable>(_Throwable_QNAME, Throwable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StackTraceElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uap.nc/lang", name = "StackTraceElement")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<StackTraceElement> createStackTraceElement(StackTraceElement value) {
        return new JAXBElement<StackTraceElement>(_StackTraceElement_QNAME, StackTraceElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pub.vo.nc/BusinessException", name = "BusinessException")
    public JAXBElement<BusinessException> createBusinessException(BusinessException value) {
        return new JAXBElement<BusinessException>(_BusinessException_QNAME, BusinessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NullPointerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uap.nc/lang", name = "NullPointerException")
    public JAXBElement<NullPointerException> createNullPointerException(NullPointerException value) {
        return new JAXBElement<NullPointerException>(_NullPointerException_QNAME, NullPointerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuntimeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uap.nc/lang", name = "RuntimeException")
    public JAXBElement<RuntimeException> createRuntimeException(RuntimeException value) {
        return new JAXBElement<RuntimeException>(_RuntimeException_QNAME, RuntimeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "errorCodeString", scope = BusinessException.class)
    public JAXBElement<String> createBusinessExceptionErrorCodeString(String value) {
        return new JAXBElement<String>(_BusinessExceptionErrorCodeString_QNAME, String.class, BusinessException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hint", scope = BusinessException.class)
    public JAXBElement<String> createBusinessExceptionHint(String value) {
        return new JAXBElement<String>(_BusinessExceptionHint_QNAME, String.class, BusinessException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = TsCostCenter.class)
    public JAXBElement<String> createTsCostCenterString(String value) {
        return new JAXBElement<String>(_TsCostCenterString_QNAME, String.class, TsCostCenter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = TsCostCenter.class)
    public JAXBElement<String> createTsCostCenterString1(String value) {
        return new JAXBElement<String>(_TsCostCenterString1_QNAME, String.class, TsCostCenter.class, value);
    }

}
