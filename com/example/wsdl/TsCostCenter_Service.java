
package com.example.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TsCostCenter", targetNamespace = "http://ts.itf.nc/TsCostCenter", wsdlLocation = "http://172.18.1.91:8088/uapws/service/TsCostCenter?wsdl")
public class TsCostCenter_Service
    extends Service
{

    private final static URL TSCOSTCENTER_WSDL_LOCATION;
    private final static WebServiceException TSCOSTCENTER_EXCEPTION;
    private final static QName TSCOSTCENTER_QNAME = new QName("http://ts.itf.nc/TsCostCenter", "TsCostCenter");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.18.1.91:8088/uapws/service/TsCostCenter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TSCOSTCENTER_WSDL_LOCATION = url;
        TSCOSTCENTER_EXCEPTION = e;
    }

    public TsCostCenter_Service() {
        super(__getWsdlLocation(), TSCOSTCENTER_QNAME);
    }

    public TsCostCenter_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TSCOSTCENTER_QNAME, features);
    }

    public TsCostCenter_Service(URL wsdlLocation) {
        super(wsdlLocation, TSCOSTCENTER_QNAME);
    }

    public TsCostCenter_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TSCOSTCENTER_QNAME, features);
    }

    public TsCostCenter_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TsCostCenter_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TsCostCenterPortType
     */
    @WebEndpoint(name = "TsCostCenterSOAP11port_http")
    public TsCostCenterPortType getTsCostCenterSOAP11PortHttp() {
        return super.getPort(new QName("http://ts.itf.nc/TsCostCenter", "TsCostCenterSOAP11port_http"), TsCostCenterPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TsCostCenterPortType
     */
    @WebEndpoint(name = "TsCostCenterSOAP11port_http")
    public TsCostCenterPortType getTsCostCenterSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://ts.itf.nc/TsCostCenter", "TsCostCenterSOAP11port_http"), TsCostCenterPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TSCOSTCENTER_EXCEPTION!= null) {
            throw TSCOSTCENTER_EXCEPTION;
        }
        return TSCOSTCENTER_WSDL_LOCATION;
    }

}