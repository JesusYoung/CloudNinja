
package cn.com.yangshj.monitor.webservice.system;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.com.yangshj.monitor.webservice.system package. 
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

    private final static QName _SendEmailResponse_QNAME = new QName("http://impl.system.dev.bsm.mocha.com/", "sendEmailResponse");
    private final static QName _SendEmail_QNAME = new QName("http://impl.system.dev.bsm.mocha.com/", "sendEmail");
    private final static QName _SendEmailTitle_QNAME = new QName("http://impl.system.dev.bsm.mocha.com/", "title");
    private final static QName _SendEmailToken_QNAME = new QName("http://impl.system.dev.bsm.mocha.com/", "token");
    private final static QName _SendEmailContent_QNAME = new QName("http://impl.system.dev.bsm.mocha.com/", "content");
    private final static QName _SystemSendEmailObjLoginResult_QNAME = new QName("http://obj.dev.bsm.mocha.com", "loginResult");
    private final static QName _SystemSendEmailObjSendFlag_QNAME = new QName("http://obj.dev.bsm.mocha.com", "sendFlag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.com.yangshj.monitor.webservice.system
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SystemSendEmailObj }
     * 
     */
    public SystemSendEmailObj createSystemSendEmailObj() {
        return new SystemSendEmailObj();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.system.dev.bsm.mocha.com/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.system.dev.bsm.mocha.com/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.system.dev.bsm.mocha.com/", name = "title", scope = SendEmail.class)
    public JAXBElement<String> createSendEmailTitle(String value) {
        return new JAXBElement<String>(_SendEmailTitle_QNAME, String.class, SendEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.system.dev.bsm.mocha.com/", name = "token", scope = SendEmail.class)
    public JAXBElement<String> createSendEmailToken(String value) {
        return new JAXBElement<String>(_SendEmailToken_QNAME, String.class, SendEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.system.dev.bsm.mocha.com/", name = "content", scope = SendEmail.class)
    public JAXBElement<String> createSendEmailContent(String value) {
        return new JAXBElement<String>(_SendEmailContent_QNAME, String.class, SendEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "loginResult", scope = SystemSendEmailObj.class)
    public JAXBElement<String> createSystemSendEmailObjLoginResult(String value) {
        return new JAXBElement<String>(_SystemSendEmailObjLoginResult_QNAME, String.class, SystemSendEmailObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "sendFlag", scope = SystemSendEmailObj.class)
    public JAXBElement<ArrayOfString> createSystemSendEmailObjSendFlag(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_SystemSendEmailObjSendFlag_QNAME, ArrayOfString.class, SystemSendEmailObj.class, value);
    }

}
