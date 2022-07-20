//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.07.19 时间 05:57:45 PM CST 
//


package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _AddUser_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "addUser");
    private final static QName _AddUserResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "addUserResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "deleteUser");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "deleteUserResponse");
    private final static QName _VerifyToken_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyToken");
    private final static QName _VerifyTokenResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyTokenResponse");
    private final static QName _LoginOut_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "loginOut");
    private final static QName _LoginOutResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "loginOutResponse");
    private final static QName _VerifyUserByMobile_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyUserByMobile");
    private final static QName _VerifyUserByMobileResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyUserByMobileResponse");
    private final static QName _GetUserPage_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "getUserPage");
    private final static QName _GetUserPageResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "getUserPageResponse");
    private final static QName _GetItomConfig_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "getItomConfig");
    private final static QName _GetItomConfigResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "getItomConfigResponse");
    private final static QName _VerifyUser_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyUser");
    private final static QName _VerifyUserResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyUserResponse");
    private final static QName _GetWorkGroupByLoginName_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "getWorkGroupByLoginName");
    private final static QName _GetWorkGroupByLoginNameResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "getWorkGroupByLoginNameResponse");
    private final static QName _VerifyUserByRSA_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyUserByRSA");
    private final static QName _VerifyUserByRSAResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "verifyUserByRSAResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "updateUser");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "updateUserResponse");
    private final static QName _UserObjID_QNAME = new QName("http://obj.dev.bsm.mocha.com", "ID");
    private final static QName _UserObjAccessTime_QNAME = new QName("http://obj.dev.bsm.mocha.com", "accessTime");
    private final static QName _UserObjAddress_QNAME = new QName("http://obj.dev.bsm.mocha.com", "address");
    private final static QName _UserObjEmail_QNAME = new QName("http://obj.dev.bsm.mocha.com", "email");
    private final static QName _UserObjEndTime_QNAME = new QName("http://obj.dev.bsm.mocha.com", "endTime");
    private final static QName _UserObjLanguage_QNAME = new QName("http://obj.dev.bsm.mocha.com", "language");
    private final static QName _UserObjLoginName_QNAME = new QName("http://obj.dev.bsm.mocha.com", "loginName");
    private final static QName _UserObjMobile_QNAME = new QName("http://obj.dev.bsm.mocha.com", "mobile");
    private final static QName _UserObjName_QNAME = new QName("http://obj.dev.bsm.mocha.com", "name");
    private final static QName _UserObjNumber_QNAME = new QName("http://obj.dev.bsm.mocha.com", "number");
    private final static QName _UserObjOrgId_QNAME = new QName("http://obj.dev.bsm.mocha.com", "orgId");
    private final static QName _UserObjPassword_QNAME = new QName("http://obj.dev.bsm.mocha.com", "password");
    private final static QName _UserObjSex_QNAME = new QName("http://obj.dev.bsm.mocha.com", "sex");
    private final static QName _UserObjStartTime_QNAME = new QName("http://obj.dev.bsm.mocha.com", "startTime");
    private final static QName _UserObjTelphone_QNAME = new QName("http://obj.dev.bsm.mocha.com", "telphone");
    private final static QName _WorkGroupObjWorkGroupDesc_QNAME = new QName("http://obj.dev.bsm.mocha.com", "workGroupDesc");
    private final static QName _WorkGroupObjWorkGroupDomainId_QNAME = new QName("http://obj.dev.bsm.mocha.com", "workGroupDomainId");
    private final static QName _WorkGroupObjWorkGroupId_QNAME = new QName("http://obj.dev.bsm.mocha.com", "workGroupId");
    private final static QName _WorkGroupObjWorkGroupName_QNAME = new QName("http://obj.dev.bsm.mocha.com", "workGroupName");
    private final static QName _LoginResultObjLoginDate_QNAME = new QName("http://obj.dev.bsm.mocha.com", "loginDate");
    private final static QName _LoginResultObjLoginResult_QNAME = new QName("http://obj.dev.bsm.mocha.com", "loginResult");
    private final static QName _LoginResultObjToken_QNAME = new QName("http://obj.dev.bsm.mocha.com", "token");
    private final static QName _VerifyUserByRSAAppType_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "appType");
    private final static QName _VerifyUserByRSALoginStr_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "loginStr");
    private final static QName _VerifyUserByRSAPassword_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "password");
    private final static QName _GetWorkGroupByLoginNameArg0_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "arg0");
    private final static QName _GetItomConfigResponseReturn_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "return");
    private final static QName _GetItomConfigToken_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "token");
    private final static QName _VerifyUserByMobileImei_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "imei");
    private final static QName _VerifyUserByMobilePhoneNumber_QNAME = new QName("http://impl.user.dev.bsm.mocha.com/", "phoneNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link String2AnyTypeMap }
     * 
     */
    public String2AnyTypeMap createString2AnyTypeMap() {
        return new String2AnyTypeMap();
    }

    /**
     * Create an instance of {@link String2StringMap }
     * 
     */
    public String2StringMap createString2StringMap() {
        return new String2StringMap();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link VerifyToken }
     * 
     */
    public VerifyToken createVerifyToken() {
        return new VerifyToken();
    }

    /**
     * Create an instance of {@link VerifyTokenResponse }
     * 
     */
    public VerifyTokenResponse createVerifyTokenResponse() {
        return new VerifyTokenResponse();
    }

    /**
     * Create an instance of {@link LoginOut }
     * 
     */
    public LoginOut createLoginOut() {
        return new LoginOut();
    }

    /**
     * Create an instance of {@link LoginOutResponse }
     * 
     */
    public LoginOutResponse createLoginOutResponse() {
        return new LoginOutResponse();
    }

    /**
     * Create an instance of {@link VerifyUserByMobile }
     * 
     */
    public VerifyUserByMobile createVerifyUserByMobile() {
        return new VerifyUserByMobile();
    }

    /**
     * Create an instance of {@link VerifyUserByMobileResponse }
     * 
     */
    public VerifyUserByMobileResponse createVerifyUserByMobileResponse() {
        return new VerifyUserByMobileResponse();
    }

    /**
     * Create an instance of {@link GetUserPage }
     * 
     */
    public GetUserPage createGetUserPage() {
        return new GetUserPage();
    }

    /**
     * Create an instance of {@link GetUserPageResponse }
     * 
     */
    public GetUserPageResponse createGetUserPageResponse() {
        return new GetUserPageResponse();
    }

    /**
     * Create an instance of {@link GetItomConfig }
     * 
     */
    public GetItomConfig createGetItomConfig() {
        return new GetItomConfig();
    }

    /**
     * Create an instance of {@link GetItomConfigResponse }
     * 
     */
    public GetItomConfigResponse createGetItomConfigResponse() {
        return new GetItomConfigResponse();
    }

    /**
     * Create an instance of {@link VerifyUser }
     * 
     */
    public VerifyUser createVerifyUser() {
        return new VerifyUser();
    }

    /**
     * Create an instance of {@link VerifyUserResponse }
     * 
     */
    public VerifyUserResponse createVerifyUserResponse() {
        return new VerifyUserResponse();
    }

    /**
     * Create an instance of {@link GetWorkGroupByLoginName }
     * 
     */
    public GetWorkGroupByLoginName createGetWorkGroupByLoginName() {
        return new GetWorkGroupByLoginName();
    }

    /**
     * Create an instance of {@link GetWorkGroupByLoginNameResponse }
     * 
     */
    public GetWorkGroupByLoginNameResponse createGetWorkGroupByLoginNameResponse() {
        return new GetWorkGroupByLoginNameResponse();
    }

    /**
     * Create an instance of {@link VerifyUserByRSA }
     * 
     */
    public VerifyUserByRSA createVerifyUserByRSA() {
        return new VerifyUserByRSA();
    }

    /**
     * Create an instance of {@link VerifyUserByRSAResponse }
     * 
     */
    public VerifyUserByRSAResponse createVerifyUserByRSAResponse() {
        return new VerifyUserByRSAResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link LoginResultObj }
     * 
     */
    public LoginResultObj createLoginResultObj() {
        return new LoginResultObj();
    }

    /**
     * Create an instance of {@link ArrayOfUserObj }
     * 
     */
    public ArrayOfUserObj createArrayOfUserObj() {
        return new ArrayOfUserObj();
    }

    /**
     * Create an instance of {@link WorkGroupObj }
     * 
     */
    public WorkGroupObj createWorkGroupObj() {
        return new WorkGroupObj();
    }

    /**
     * Create an instance of {@link UserObj }
     * 
     */
    public UserObj createUserObj() {
        return new UserObj();
    }

    /**
     * Create an instance of {@link ArrayOfWorkGroupObj }
     * 
     */
    public ArrayOfWorkGroupObj createArrayOfWorkGroupObj() {
        return new ArrayOfWorkGroupObj();
    }

    /**
     * Create an instance of {@link String2AnyTypeMap.Entry }
     * 
     */
    public String2AnyTypeMap.Entry createString2AnyTypeMapEntry() {
        return new String2AnyTypeMap.Entry();
    }

    /**
     * Create an instance of {@link String2StringMap.Entry }
     * 
     */
    public String2StringMap.Entry createString2StringMapEntry() {
        return new String2StringMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyToken")
    public JAXBElement<VerifyToken> createVerifyToken(VerifyToken value) {
        return new JAXBElement<VerifyToken>(_VerifyToken_QNAME, VerifyToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyTokenResponse")
    public JAXBElement<VerifyTokenResponse> createVerifyTokenResponse(VerifyTokenResponse value) {
        return new JAXBElement<VerifyTokenResponse>(_VerifyTokenResponse_QNAME, VerifyTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "loginOut")
    public JAXBElement<LoginOut> createLoginOut(LoginOut value) {
        return new JAXBElement<LoginOut>(_LoginOut_QNAME, LoginOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "loginOutResponse")
    public JAXBElement<LoginOutResponse> createLoginOutResponse(LoginOutResponse value) {
        return new JAXBElement<LoginOutResponse>(_LoginOutResponse_QNAME, LoginOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyUserByMobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyUserByMobile")
    public JAXBElement<VerifyUserByMobile> createVerifyUserByMobile(VerifyUserByMobile value) {
        return new JAXBElement<VerifyUserByMobile>(_VerifyUserByMobile_QNAME, VerifyUserByMobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyUserByMobileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyUserByMobileResponse")
    public JAXBElement<VerifyUserByMobileResponse> createVerifyUserByMobileResponse(VerifyUserByMobileResponse value) {
        return new JAXBElement<VerifyUserByMobileResponse>(_VerifyUserByMobileResponse_QNAME, VerifyUserByMobileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "getUserPage")
    public JAXBElement<GetUserPage> createGetUserPage(GetUserPage value) {
        return new JAXBElement<GetUserPage>(_GetUserPage_QNAME, GetUserPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "getUserPageResponse")
    public JAXBElement<GetUserPageResponse> createGetUserPageResponse(GetUserPageResponse value) {
        return new JAXBElement<GetUserPageResponse>(_GetUserPageResponse_QNAME, GetUserPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItomConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "getItomConfig")
    public JAXBElement<GetItomConfig> createGetItomConfig(GetItomConfig value) {
        return new JAXBElement<GetItomConfig>(_GetItomConfig_QNAME, GetItomConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItomConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "getItomConfigResponse")
    public JAXBElement<GetItomConfigResponse> createGetItomConfigResponse(GetItomConfigResponse value) {
        return new JAXBElement<GetItomConfigResponse>(_GetItomConfigResponse_QNAME, GetItomConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyUser")
    public JAXBElement<VerifyUser> createVerifyUser(VerifyUser value) {
        return new JAXBElement<VerifyUser>(_VerifyUser_QNAME, VerifyUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyUserResponse")
    public JAXBElement<VerifyUserResponse> createVerifyUserResponse(VerifyUserResponse value) {
        return new JAXBElement<VerifyUserResponse>(_VerifyUserResponse_QNAME, VerifyUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkGroupByLoginName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "getWorkGroupByLoginName")
    public JAXBElement<GetWorkGroupByLoginName> createGetWorkGroupByLoginName(GetWorkGroupByLoginName value) {
        return new JAXBElement<GetWorkGroupByLoginName>(_GetWorkGroupByLoginName_QNAME, GetWorkGroupByLoginName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkGroupByLoginNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "getWorkGroupByLoginNameResponse")
    public JAXBElement<GetWorkGroupByLoginNameResponse> createGetWorkGroupByLoginNameResponse(GetWorkGroupByLoginNameResponse value) {
        return new JAXBElement<GetWorkGroupByLoginNameResponse>(_GetWorkGroupByLoginNameResponse_QNAME, GetWorkGroupByLoginNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyUserByRSA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyUserByRSA")
    public JAXBElement<VerifyUserByRSA> createVerifyUserByRSA(VerifyUserByRSA value) {
        return new JAXBElement<VerifyUserByRSA>(_VerifyUserByRSA_QNAME, VerifyUserByRSA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyUserByRSAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "verifyUserByRSAResponse")
    public JAXBElement<VerifyUserByRSAResponse> createVerifyUserByRSAResponse(VerifyUserByRSAResponse value) {
        return new JAXBElement<VerifyUserByRSAResponse>(_VerifyUserByRSAResponse_QNAME, VerifyUserByRSAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "ID", scope = UserObj.class)
    public JAXBElement<String> createUserObjID(String value) {
        return new JAXBElement<String>(_UserObjID_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "accessTime", scope = UserObj.class)
    public JAXBElement<String> createUserObjAccessTime(String value) {
        return new JAXBElement<String>(_UserObjAccessTime_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "address", scope = UserObj.class)
    public JAXBElement<String> createUserObjAddress(String value) {
        return new JAXBElement<String>(_UserObjAddress_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "email", scope = UserObj.class)
    public JAXBElement<String> createUserObjEmail(String value) {
        return new JAXBElement<String>(_UserObjEmail_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "endTime", scope = UserObj.class)
    public JAXBElement<String> createUserObjEndTime(String value) {
        return new JAXBElement<String>(_UserObjEndTime_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "language", scope = UserObj.class)
    public JAXBElement<String> createUserObjLanguage(String value) {
        return new JAXBElement<String>(_UserObjLanguage_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "loginName", scope = UserObj.class)
    public JAXBElement<String> createUserObjLoginName(String value) {
        return new JAXBElement<String>(_UserObjLoginName_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "mobile", scope = UserObj.class)
    public JAXBElement<String> createUserObjMobile(String value) {
        return new JAXBElement<String>(_UserObjMobile_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "name", scope = UserObj.class)
    public JAXBElement<String> createUserObjName(String value) {
        return new JAXBElement<String>(_UserObjName_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "number", scope = UserObj.class)
    public JAXBElement<String> createUserObjNumber(String value) {
        return new JAXBElement<String>(_UserObjNumber_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "orgId", scope = UserObj.class)
    public JAXBElement<String> createUserObjOrgId(String value) {
        return new JAXBElement<String>(_UserObjOrgId_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "password", scope = UserObj.class)
    public JAXBElement<String> createUserObjPassword(String value) {
        return new JAXBElement<String>(_UserObjPassword_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "sex", scope = UserObj.class)
    public JAXBElement<String> createUserObjSex(String value) {
        return new JAXBElement<String>(_UserObjSex_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "startTime", scope = UserObj.class)
    public JAXBElement<String> createUserObjStartTime(String value) {
        return new JAXBElement<String>(_UserObjStartTime_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "telphone", scope = UserObj.class)
    public JAXBElement<String> createUserObjTelphone(String value) {
        return new JAXBElement<String>(_UserObjTelphone_QNAME, String.class, UserObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "workGroupDesc", scope = WorkGroupObj.class)
    public JAXBElement<String> createWorkGroupObjWorkGroupDesc(String value) {
        return new JAXBElement<String>(_WorkGroupObjWorkGroupDesc_QNAME, String.class, WorkGroupObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "workGroupDomainId", scope = WorkGroupObj.class)
    public JAXBElement<String> createWorkGroupObjWorkGroupDomainId(String value) {
        return new JAXBElement<String>(_WorkGroupObjWorkGroupDomainId_QNAME, String.class, WorkGroupObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "workGroupId", scope = WorkGroupObj.class)
    public JAXBElement<String> createWorkGroupObjWorkGroupId(String value) {
        return new JAXBElement<String>(_WorkGroupObjWorkGroupId_QNAME, String.class, WorkGroupObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "workGroupName", scope = WorkGroupObj.class)
    public JAXBElement<String> createWorkGroupObjWorkGroupName(String value) {
        return new JAXBElement<String>(_WorkGroupObjWorkGroupName_QNAME, String.class, WorkGroupObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "loginDate", scope = LoginResultObj.class)
    public JAXBElement<String> createLoginResultObjLoginDate(String value) {
        return new JAXBElement<String>(_LoginResultObjLoginDate_QNAME, String.class, LoginResultObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "loginResult", scope = LoginResultObj.class)
    public JAXBElement<String> createLoginResultObjLoginResult(String value) {
        return new JAXBElement<String>(_LoginResultObjLoginResult_QNAME, String.class, LoginResultObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "token", scope = LoginResultObj.class)
    public JAXBElement<String> createLoginResultObjToken(String value) {
        return new JAXBElement<String>(_LoginResultObjToken_QNAME, String.class, LoginResultObj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "appType", scope = VerifyUserByRSA.class)
    public JAXBElement<String> createVerifyUserByRSAAppType(String value) {
        return new JAXBElement<String>(_VerifyUserByRSAAppType_QNAME, String.class, VerifyUserByRSA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "loginStr", scope = VerifyUserByRSA.class)
    public JAXBElement<String> createVerifyUserByRSALoginStr(String value) {
        return new JAXBElement<String>(_VerifyUserByRSALoginStr_QNAME, String.class, VerifyUserByRSA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "password", scope = VerifyUserByRSA.class)
    public JAXBElement<String> createVerifyUserByRSAPassword(String value) {
        return new JAXBElement<String>(_VerifyUserByRSAPassword_QNAME, String.class, VerifyUserByRSA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "arg0", scope = GetWorkGroupByLoginName.class)
    public JAXBElement<String> createGetWorkGroupByLoginNameArg0(String value) {
        return new JAXBElement<String>(_GetWorkGroupByLoginNameArg0_QNAME, String.class, GetWorkGroupByLoginName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "appType", scope = VerifyUser.class)
    public JAXBElement<String> createVerifyUserAppType(String value) {
        return new JAXBElement<String>(_VerifyUserByRSAAppType_QNAME, String.class, VerifyUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "loginStr", scope = VerifyUser.class)
    public JAXBElement<String> createVerifyUserLoginStr(String value) {
        return new JAXBElement<String>(_VerifyUserByRSALoginStr_QNAME, String.class, VerifyUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "password", scope = VerifyUser.class)
    public JAXBElement<String> createVerifyUserPassword(String value) {
        return new JAXBElement<String>(_VerifyUserByRSAPassword_QNAME, String.class, VerifyUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String2StringMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "return", scope = GetItomConfigResponse.class)
    public JAXBElement<String2StringMap> createGetItomConfigResponseReturn(String2StringMap value) {
        return new JAXBElement<String2StringMap>(_GetItomConfigResponseReturn_QNAME, String2StringMap.class, GetItomConfigResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "token", scope = GetItomConfig.class)
    public JAXBElement<String> createGetItomConfigToken(String value) {
        return new JAXBElement<String>(_GetItomConfigToken_QNAME, String.class, GetItomConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String2AnyTypeMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "return", scope = GetUserPageResponse.class)
    public JAXBElement<String2AnyTypeMap> createGetUserPageResponseReturn(String2AnyTypeMap value) {
        return new JAXBElement<String2AnyTypeMap>(_GetItomConfigResponseReturn_QNAME, String2AnyTypeMap.class, GetUserPageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "token", scope = GetUserPage.class)
    public JAXBElement<String> createGetUserPageToken(String value) {
        return new JAXBElement<String>(_GetItomConfigToken_QNAME, String.class, GetUserPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "appType", scope = VerifyUserByMobile.class)
    public JAXBElement<String> createVerifyUserByMobileAppType(String value) {
        return new JAXBElement<String>(_VerifyUserByRSAAppType_QNAME, String.class, VerifyUserByMobile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "loginStr", scope = VerifyUserByMobile.class)
    public JAXBElement<String> createVerifyUserByMobileLoginStr(String value) {
        return new JAXBElement<String>(_VerifyUserByRSALoginStr_QNAME, String.class, VerifyUserByMobile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "password", scope = VerifyUserByMobile.class)
    public JAXBElement<String> createVerifyUserByMobilePassword(String value) {
        return new JAXBElement<String>(_VerifyUserByRSAPassword_QNAME, String.class, VerifyUserByMobile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "imei", scope = VerifyUserByMobile.class)
    public JAXBElement<String> createVerifyUserByMobileImei(String value) {
        return new JAXBElement<String>(_VerifyUserByMobileImei_QNAME, String.class, VerifyUserByMobile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "phoneNumber", scope = VerifyUserByMobile.class)
    public JAXBElement<String> createVerifyUserByMobilePhoneNumber(String value) {
        return new JAXBElement<String>(_VerifyUserByMobilePhoneNumber_QNAME, String.class, VerifyUserByMobile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "return", scope = LoginOutResponse.class)
    public JAXBElement<String> createLoginOutResponseReturn(String value) {
        return new JAXBElement<String>(_GetItomConfigResponseReturn_QNAME, String.class, LoginOutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "token", scope = LoginOut.class)
    public JAXBElement<String> createLoginOutToken(String value) {
        return new JAXBElement<String>(_GetItomConfigToken_QNAME, String.class, LoginOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.user.dev.bsm.mocha.com/", name = "token", scope = VerifyToken.class)
    public JAXBElement<String> createVerifyTokenToken(String value) {
        return new JAXBElement<String>(_GetItomConfigToken_QNAME, String.class, VerifyToken.class, value);
    }

}
