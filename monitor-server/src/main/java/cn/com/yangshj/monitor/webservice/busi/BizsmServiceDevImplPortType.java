
package cn.com.yangshj.monitor.webservice.busi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BizsmServiceDevImplPortType", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BizsmServiceDevImplPortType {


    /**
     * 
     * @param bizId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "deleteBizService", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.DeleteBizService")
    @ResponseWrapper(localName = "deleteBizServiceResponse", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.DeleteBizServiceResponse")
    public String deleteBizService(
        @WebParam(name = "bizId", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String bizId);

    /**
     * 
     * @param searchRelaName
     * @param bizsmId
     * @param pageSize
     * @param currentPage
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.busi.BizsmDetailInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getBizsmByIdAndPageIns", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.GetBizsmByIdAndPageIns")
    @ResponseWrapper(localName = "getBizsmByIdAndPageInsResponse", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.GetBizsmByIdAndPageInsResponse")
    public BizsmDetailInfoObj getBizsmByIdAndPageIns(
        @WebParam(name = "token", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "bizsmId", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String bizsmId,
        @WebParam(name = "searchRelaName", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String searchRelaName,
        @WebParam(name = "pageSize", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String pageSize,
        @WebParam(name = "currentPage", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String currentPage);

    /**
     * 
     * @param bizName
     * @param userId
     * @param domainId
     * @param desc
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "createBizService", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.CreateBizService")
    @ResponseWrapper(localName = "createBizServiceResponse", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.CreateBizServiceResponse")
    public String createBizService(
        @WebParam(name = "bizName", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String bizName,
        @WebParam(name = "userId", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String userId,
        @WebParam(name = "domainId", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String domainId,
        @WebParam(name = "desc", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String desc);

    /**
     * 
     * @param searchRelaName
     * @param bizsmId
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.busi.BizsmDetailInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getBizsmById", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.GetBizsmById")
    @ResponseWrapper(localName = "getBizsmByIdResponse", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.GetBizsmByIdResponse")
    public BizsmDetailInfoObj getBizsmById(
        @WebParam(name = "token", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "bizsmId", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String bizsmId,
        @WebParam(name = "searchRelaName", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String searchRelaName);

    /**
     * 
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.busi.ArrayOfBizsmListObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getBizsmList", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.GetBizsmList")
    @ResponseWrapper(localName = "getBizsmListResponse", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.busi.GetBizsmListResponse")
    public ArrayOfBizsmListObj getBizsmList(
        @WebParam(name = "token", targetNamespace = "http://impl.bizsm.dev.bsm.mocha.com/")
        String token);

}
