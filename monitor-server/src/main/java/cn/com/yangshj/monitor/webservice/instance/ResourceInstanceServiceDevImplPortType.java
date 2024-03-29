
package cn.com.yangshj.monitor.webservice.instance;

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
@WebService(name = "ResourceInstanceServiceDevImplPortType", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ResourceInstanceServiceDevImplPortType {


    /**
     * 
     * @param ipAddress
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceInstanceInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResourceInstancesByIP", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesByIP")
    @ResponseWrapper(localName = "getResourceInstancesByIPResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesByIPResponse")
    public ArrayOfResourceInstanceInfoObj getResourceInstancesByIP(
        @WebParam(name = "ipAddress", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String ipAddress);

    /**
     * 
     * @param instanceId
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ResourceInstanceInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResourceInstancesById", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesById")
    @ResponseWrapper(localName = "getResourceInstancesByIdResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesByIdResponse")
    public ResourceInstanceInfoObj getResourceInstancesById(
        @WebParam(name = "instanceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String instanceId);

    /**
     * 
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceCategoryObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getAllResourceCategory", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetAllResourceCategory")
    @ResponseWrapper(localName = "getAllResourceCategoryResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetAllResourceCategoryResponse")
    public ArrayOfResourceCategoryObj getAllResourceCategory();

    /**
     * 
     * @param token
     * @param info
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "modifyDiscoveryRes", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.ModifyDiscoveryRes")
    @ResponseWrapper(localName = "modifyDiscoveryResResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.ModifyDiscoveryResResponse")
    public String modifyDiscoveryRes(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "info", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String info);

    /**
     * 
     * @param resourceId
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceInstanceInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResourceInstancesByResourceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesByResourceId")
    @ResponseWrapper(localName = "getResourceInstancesByResourceIdResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesByResourceIdResponse")
    public ArrayOfResourceInstanceInfoObj getResourceInstancesByResourceId(
        @WebParam(name = "resourceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String resourceId);

    /**
     * 
     * @param instanceIds
     * @param timeMills
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfFocusResInsInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getFocusResInsInfoInIds", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetFocusResInsInfoInIds")
    @ResponseWrapper(localName = "getFocusResInsInfoInIdsResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetFocusResInsInfoInIdsResponse")
    public ArrayOfFocusResInsInfoObj getFocusResInsInfoInIds(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "instanceIds", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        ArrayOfString instanceIds,
        @WebParam(name = "timeMills", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String timeMills);

    /**
     * 
     * @param resourceId
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfMetricInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getMetricInfoByResourceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetMetricInfoByResourceId")
    @ResponseWrapper(localName = "getMetricInfoByResourceIdResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetMetricInfoByResourceIdResponse")
    public ArrayOfMetricInfoObj getMetricInfoByResourceId(
        @WebParam(name = "resourceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        ArrayOfString resourceId);

    /**
     * 
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.String2StringMap
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResInsNumByState", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsNumByState")
    @ResponseWrapper(localName = "getResInsNumByStateResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsNumByStateResponse")
    public String2StringMap getResInsNumByState(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token);

    /**
     * 
     * @param metricId
     * @param categoryId
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfInstanceTopNData
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getTopNDatas", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetTopNDatas")
    @ResponseWrapper(localName = "getTopNDatasResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetTopNDatasResponse")
    public ArrayOfInstanceTopNData getTopNDatas(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "categoryId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String categoryId,
        @WebParam(name = "metricId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String metricId);

    /**
     * 
     * @param stateType
     * @param pageSize
     * @param currentPage
     * @param searchValue
     * @param categoryId
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.InstanceResultObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResInsByCateAndStateWithStatistic", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsByCateAndStateWithStatistic")
    @ResponseWrapper(localName = "getResInsByCateAndStateWithStatisticResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsByCateAndStateWithStatisticResponse")
    public InstanceResultObj getResInsByCateAndStateWithStatistic(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "categoryId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String categoryId,
        @WebParam(name = "stateType", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        ArrayOfString stateType,
        @WebParam(name = "searchValue", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String searchValue,
        @WebParam(name = "pageSize", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String pageSize,
        @WebParam(name = "currentPage", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String currentPage);

    /**
     * 
     * @param stateType
     * @param pageSize
     * @param currentPage
     * @param searchValue
     * @param categoryId
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfCategoryInstanceObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResInsByCateAndState", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsByCateAndState")
    @ResponseWrapper(localName = "getResInsByCateAndStateResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsByCateAndStateResponse")
    public ArrayOfCategoryInstanceObj getResInsByCateAndState(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "categoryId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String categoryId,
        @WebParam(name = "stateType", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        ArrayOfString stateType,
        @WebParam(name = "searchValue", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String searchValue,
        @WebParam(name = "pageSize", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String pageSize,
        @WebParam(name = "currentPage", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String currentPage);

    /**
     * 
     * @param instanceId
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "deleteRes", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.DeleteRes")
    @ResponseWrapper(localName = "deleteResResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.DeleteResResponse")
    public String deleteRes(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "instanceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String instanceId);

    /**
     * 
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceInstanceInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getAttentionAlarmInstances", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetAttentionAlarmInstances")
    @ResponseWrapper(localName = "getAttentionAlarmInstancesResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetAttentionAlarmInstancesResponse")
    public ArrayOfResourceInstanceInfoObj getAttentionAlarmInstances(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token);

    /**
     * 
     * @param stateType
     * @param searchValue
     * @param categoryId
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfCategoryInstanceObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getCateNumByCateAndState", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetCateNumByCateAndState")
    @ResponseWrapper(localName = "getCateNumByCateAndStateResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetCateNumByCateAndStateResponse")
    public ArrayOfCategoryInstanceObj getCateNumByCateAndState(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "categoryId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String categoryId,
        @WebParam(name = "stateType", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        ArrayOfString stateType,
        @WebParam(name = "searchValue", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String searchValue);

    /**
     * 
     * @param instanceId
     * @param stateType
     * @param pageSize
     * @param currentPage
     * @param searchValue
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResInsDetailObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getChildInsByParentId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetChildInsByParentId")
    @ResponseWrapper(localName = "getChildInsByParentIdResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetChildInsByParentIdResponse")
    public ArrayOfResInsDetailObj getChildInsByParentId(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "instanceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String instanceId,
        @WebParam(name = "stateType", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        ArrayOfString stateType,
        @WebParam(name = "searchValue", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String searchValue,
        @WebParam(name = "pageSize", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String pageSize,
        @WebParam(name = "currentPage", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String currentPage);

    /**
     * 
     * @param ids
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceInstanceInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResourceInstancesInIds", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesInIds")
    @ResponseWrapper(localName = "getResourceInstancesInIdsResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesInIdsResponse")
    public ArrayOfResourceInstanceInfoObj getResourceInstancesInIds(
        @WebParam(name = "ids", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        ArrayOfString ids);

    /**
     * 
     * @param instanceId
     * @param timeMills
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfConfigChangeObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getConfigChangeInfoByServer", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetConfigChangeInfoByServer")
    @ResponseWrapper(localName = "getConfigChangeInfoByServerResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetConfigChangeInfoByServerResponse")
    public ArrayOfConfigChangeObj getConfigChangeInfoByServer(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "instanceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String instanceId,
        @WebParam(name = "timeMills", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String timeMills);

    /**
     * 
     * @param instanceId
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ResInsDetailObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResInsDetailById", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsDetailById")
    @ResponseWrapper(localName = "getResInsDetailByIdResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsDetailByIdResponse")
    public ResInsDetailObj getResInsDetailById(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "instanceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String instanceId);

    /**
     * 
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceCategoryObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getAllParentResourceCategory", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetAllParentResourceCategory")
    @ResponseWrapper(localName = "getAllParentResourceCategoryResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetAllParentResourceCategoryResponse")
    public ArrayOfResourceCategoryObj getAllParentResourceCategory();

    /**
     * 
     * @param categoryGroupId
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResourceByCategoryGroup", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceByCategoryGroup")
    @ResponseWrapper(localName = "getResourceByCategoryGroupResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceByCategoryGroupResponse")
    public ArrayOfResourceInfoObj getResourceByCategoryGroup(
        @WebParam(name = "categoryGroupId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String categoryGroupId);

    /**
     * 
     * @param instanceId
     * @param startTime
     * @param endTime
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfConfigChangeObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getConfigChangeInfoByClient", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetConfigChangeInfoByClient")
    @ResponseWrapper(localName = "getConfigChangeInfoByClientResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetConfigChangeInfoByClientResponse")
    public ArrayOfConfigChangeObj getConfigChangeInfoByClient(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "instanceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String instanceId,
        @WebParam(name = "startTime", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String startTime,
        @WebParam(name = "endTime", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String endTime);

    /**
     * 
     * @param instanceId
     * @param token
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ResInsDetailExtendObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResInsDetailByIdForApp", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsDetailByIdForApp")
    @ResponseWrapper(localName = "getResInsDetailByIdForAppResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResInsDetailByIdForAppResponse")
    public ResInsDetailExtendObj getResInsDetailByIdForApp(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "instanceId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String instanceId);

    /**
     * 
     * @param token
     * @param info
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "discoveryRes", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.DiscoveryRes")
    @ResponseWrapper(localName = "discoveryResResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.DiscoveryResResponse")
    public String discoveryRes(
        @WebParam(name = "token", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String token,
        @WebParam(name = "info", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String info);

    /**
     * 
     * @param resourceCategoryGroupId
     * @return
     *     returns cn.com.yangshj.monitor.webservice.instance.ArrayOfResourceInstanceInfoObj
     */
    @WebMethod
    @WebResult(targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
    @RequestWrapper(localName = "getResourceInstancesByCategoryGroup", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesByCategoryGroup")
    @ResponseWrapper(localName = "getResourceInstancesByCategoryGroupResponse", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/", className = "cn.com.yangshj.monitor.webservice.instance.GetResourceInstancesByCategoryGroupResponse")
    public ArrayOfResourceInstanceInfoObj getResourceInstancesByCategoryGroup(
        @WebParam(name = "resourceCategoryGroupId", targetNamespace = "http://impl.instance.dev.bsm.mocha.com/")
        String resourceCategoryGroupId);

}
