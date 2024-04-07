
package com.example.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "BusinessException", targetNamespace = "http://pub.vo.nc/BusinessException")
public class BusinessException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BusinessException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public BusinessException_Exception(String message, BusinessException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public BusinessException_Exception(String message, BusinessException faultInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.example.wsdl.BusinessException
     */
    public BusinessException getFaultInfo() {
        return faultInfo;
    }

}
