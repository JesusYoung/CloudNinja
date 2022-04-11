
package cn.com.yangshj.monitor.webservice.metrics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.com.yangshj.monitor.webservice.metrics package. 
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

    private final static QName _GetSummaryFrequencyResponse_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "getSummaryFrequencyResponse");
    private final static QName _QueryRealTimeMetricDataResponse_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "queryRealTimeMetricDataResponse");
    private final static QName _QuerySummaryMetricDataBatch_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "querySummaryMetricDataBatch");
    private final static QName _QuerySummaryMetricDataBatchResponse_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "querySummaryMetricDataBatchResponse");
    private final static QName _QuerySummaryMetricData_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "querySummaryMetricData");
    private final static QName _QueryRealTimeMetricDataBatchResponse_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "queryRealTimeMetricDataBatchResponse");
    private final static QName _QuerySummaryMetricDataResponse_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "querySummaryMetricDataResponse");
    private final static QName _QueryRealTimeMetricData_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "queryRealTimeMetricData");
    private final static QName _QueryRealTimeMetricDataBatch_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "queryRealTimeMetricDataBatch");
    private final static QName _GetSummaryFrequency_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "getSummaryFrequency");
    private final static QName _QueryRealTimeMetricDataResourceInsId_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "resourceInsId");
    private final static QName _QueryRealTimeMetricDataMetricId_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "metricId");
    private final static QName _SummarizedMetricDataAvgValue_QNAME = new QName("http://obj.basedata.bsm.mocha.com", "avgValue");
    private final static QName _SummarizedMetricDataInstanceId_QNAME = new QName("http://obj.basedata.bsm.mocha.com", "instanceId");
    private final static QName _SummarizedMetricDataMinValue_QNAME = new QName("http://obj.basedata.bsm.mocha.com", "minValue");
    private final static QName _SummarizedMetricDataMetricId_QNAME = new QName("http://obj.basedata.bsm.mocha.com", "metricId");
    private final static QName _SummarizedMetricDataMaxValue_QNAME = new QName("http://obj.basedata.bsm.mocha.com", "maxValue");
    private final static QName _SimpleMetricDataMetricId_QNAME = new QName("http://obj.dev.bsm.mocha.com", "metricId");
    private final static QName _SimpleMetricDataInstanceId_QNAME = new QName("http://obj.dev.bsm.mocha.com", "instanceId");
    private final static QName _SimpleMetricDataMetricName_QNAME = new QName("http://obj.dev.bsm.mocha.com", "metricName");
    private final static QName _SimpleMetricDataMetricUnit_QNAME = new QName("http://obj.dev.bsm.mocha.com", "metricUnit");
    private final static QName _SimpleMetricDataMetricValue_QNAME = new QName("http://obj.dev.bsm.mocha.com", "metricValue");
    private final static QName _QuerySummaryMetricDataBatchFrequencyId_QNAME = new QName("http://impl.metricdata.dev.bsm.mocha.com/", "frequencyId");
    private final static QName _SummaryFrequencyOneDay_QNAME = new QName("http://metricdata.dev.bsm.mocha.com", "oneDay");
    private final static QName _SummaryFrequencyOneHour_QNAME = new QName("http://metricdata.dev.bsm.mocha.com", "oneHour");
    private final static QName _SummaryFrequencyTenMins_QNAME = new QName("http://metricdata.dev.bsm.mocha.com", "tenMins");
    private final static QName _SummaryFrequencyThirtyMins_QNAME = new QName("http://metricdata.dev.bsm.mocha.com", "thirtyMins");
    private final static QName _SummaryFrequencyMonitor_QNAME = new QName("http://metricdata.dev.bsm.mocha.com", "monitor");
    private final static QName _SummaryFrequencySixHours_QNAME = new QName("http://metricdata.dev.bsm.mocha.com", "sixHours");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.com.yangshj.monitor.webservice.metrics
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SimpleMetricData }
     * 
     */
    public SimpleMetricData createSimpleMetricData() {
        return new SimpleMetricData();
    }

    /**
     * Create an instance of {@link ArrayOfSimpleMetricData }
     * 
     */
    public ArrayOfSimpleMetricData createArrayOfSimpleMetricData() {
        return new ArrayOfSimpleMetricData();
    }

    /**
     * Create an instance of {@link SummarizedMetricData }
     * 
     */
    public SummarizedMetricData createSummarizedMetricData() {
        return new SummarizedMetricData();
    }

    /**
     * Create an instance of {@link ArrayOfSummarizedMetricData }
     * 
     */
    public ArrayOfSummarizedMetricData createArrayOfSummarizedMetricData() {
        return new ArrayOfSummarizedMetricData();
    }

    /**
     * Create an instance of {@link GetSummaryFrequencyResponse }
     * 
     */
    public GetSummaryFrequencyResponse createGetSummaryFrequencyResponse() {
        return new GetSummaryFrequencyResponse();
    }

    /**
     * Create an instance of {@link QueryRealTimeMetricDataResponse }
     * 
     */
    public QueryRealTimeMetricDataResponse createQueryRealTimeMetricDataResponse() {
        return new QueryRealTimeMetricDataResponse();
    }

    /**
     * Create an instance of {@link QuerySummaryMetricDataBatch }
     * 
     */
    public QuerySummaryMetricDataBatch createQuerySummaryMetricDataBatch() {
        return new QuerySummaryMetricDataBatch();
    }

    /**
     * Create an instance of {@link QuerySummaryMetricData }
     * 
     */
    public QuerySummaryMetricData createQuerySummaryMetricData() {
        return new QuerySummaryMetricData();
    }

    /**
     * Create an instance of {@link QuerySummaryMetricDataBatchResponse }
     * 
     */
    public QuerySummaryMetricDataBatchResponse createQuerySummaryMetricDataBatchResponse() {
        return new QuerySummaryMetricDataBatchResponse();
    }

    /**
     * Create an instance of {@link QueryRealTimeMetricDataBatch }
     * 
     */
    public QueryRealTimeMetricDataBatch createQueryRealTimeMetricDataBatch() {
        return new QueryRealTimeMetricDataBatch();
    }

    /**
     * Create an instance of {@link GetSummaryFrequency }
     * 
     */
    public GetSummaryFrequency createGetSummaryFrequency() {
        return new GetSummaryFrequency();
    }

    /**
     * Create an instance of {@link QueryRealTimeMetricDataBatchResponse }
     * 
     */
    public QueryRealTimeMetricDataBatchResponse createQueryRealTimeMetricDataBatchResponse() {
        return new QueryRealTimeMetricDataBatchResponse();
    }

    /**
     * Create an instance of {@link QuerySummaryMetricDataResponse }
     * 
     */
    public QuerySummaryMetricDataResponse createQuerySummaryMetricDataResponse() {
        return new QuerySummaryMetricDataResponse();
    }

    /**
     * Create an instance of {@link QueryRealTimeMetricData }
     * 
     */
    public QueryRealTimeMetricData createQueryRealTimeMetricData() {
        return new QueryRealTimeMetricData();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link SummaryFrequency }
     * 
     */
    public SummaryFrequency createSummaryFrequency() {
        return new SummaryFrequency();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSummaryFrequencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "getSummaryFrequencyResponse")
    public JAXBElement<GetSummaryFrequencyResponse> createGetSummaryFrequencyResponse(GetSummaryFrequencyResponse value) {
        return new JAXBElement<GetSummaryFrequencyResponse>(_GetSummaryFrequencyResponse_QNAME, GetSummaryFrequencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRealTimeMetricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "queryRealTimeMetricDataResponse")
    public JAXBElement<QueryRealTimeMetricDataResponse> createQueryRealTimeMetricDataResponse(QueryRealTimeMetricDataResponse value) {
        return new JAXBElement<QueryRealTimeMetricDataResponse>(_QueryRealTimeMetricDataResponse_QNAME, QueryRealTimeMetricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySummaryMetricDataBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "querySummaryMetricDataBatch")
    public JAXBElement<QuerySummaryMetricDataBatch> createQuerySummaryMetricDataBatch(QuerySummaryMetricDataBatch value) {
        return new JAXBElement<QuerySummaryMetricDataBatch>(_QuerySummaryMetricDataBatch_QNAME, QuerySummaryMetricDataBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySummaryMetricDataBatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "querySummaryMetricDataBatchResponse")
    public JAXBElement<QuerySummaryMetricDataBatchResponse> createQuerySummaryMetricDataBatchResponse(QuerySummaryMetricDataBatchResponse value) {
        return new JAXBElement<QuerySummaryMetricDataBatchResponse>(_QuerySummaryMetricDataBatchResponse_QNAME, QuerySummaryMetricDataBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySummaryMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "querySummaryMetricData")
    public JAXBElement<QuerySummaryMetricData> createQuerySummaryMetricData(QuerySummaryMetricData value) {
        return new JAXBElement<QuerySummaryMetricData>(_QuerySummaryMetricData_QNAME, QuerySummaryMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRealTimeMetricDataBatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "queryRealTimeMetricDataBatchResponse")
    public JAXBElement<QueryRealTimeMetricDataBatchResponse> createQueryRealTimeMetricDataBatchResponse(QueryRealTimeMetricDataBatchResponse value) {
        return new JAXBElement<QueryRealTimeMetricDataBatchResponse>(_QueryRealTimeMetricDataBatchResponse_QNAME, QueryRealTimeMetricDataBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySummaryMetricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "querySummaryMetricDataResponse")
    public JAXBElement<QuerySummaryMetricDataResponse> createQuerySummaryMetricDataResponse(QuerySummaryMetricDataResponse value) {
        return new JAXBElement<QuerySummaryMetricDataResponse>(_QuerySummaryMetricDataResponse_QNAME, QuerySummaryMetricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRealTimeMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "queryRealTimeMetricData")
    public JAXBElement<QueryRealTimeMetricData> createQueryRealTimeMetricData(QueryRealTimeMetricData value) {
        return new JAXBElement<QueryRealTimeMetricData>(_QueryRealTimeMetricData_QNAME, QueryRealTimeMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRealTimeMetricDataBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "queryRealTimeMetricDataBatch")
    public JAXBElement<QueryRealTimeMetricDataBatch> createQueryRealTimeMetricDataBatch(QueryRealTimeMetricDataBatch value) {
        return new JAXBElement<QueryRealTimeMetricDataBatch>(_QueryRealTimeMetricDataBatch_QNAME, QueryRealTimeMetricDataBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSummaryFrequency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "getSummaryFrequency")
    public JAXBElement<GetSummaryFrequency> createGetSummaryFrequency(GetSummaryFrequency value) {
        return new JAXBElement<GetSummaryFrequency>(_GetSummaryFrequency_QNAME, GetSummaryFrequency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "resourceInsId", scope = QueryRealTimeMetricData.class)
    public JAXBElement<String> createQueryRealTimeMetricDataResourceInsId(String value) {
        return new JAXBElement<String>(_QueryRealTimeMetricDataResourceInsId_QNAME, String.class, QueryRealTimeMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "metricId", scope = QueryRealTimeMetricData.class)
    public JAXBElement<String> createQueryRealTimeMetricDataMetricId(String value) {
        return new JAXBElement<String>(_QueryRealTimeMetricDataMetricId_QNAME, String.class, QueryRealTimeMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.basedata.bsm.mocha.com", name = "avgValue", scope = SummarizedMetricData.class)
    public JAXBElement<String> createSummarizedMetricDataAvgValue(String value) {
        return new JAXBElement<String>(_SummarizedMetricDataAvgValue_QNAME, String.class, SummarizedMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.basedata.bsm.mocha.com", name = "instanceId", scope = SummarizedMetricData.class)
    public JAXBElement<String> createSummarizedMetricDataInstanceId(String value) {
        return new JAXBElement<String>(_SummarizedMetricDataInstanceId_QNAME, String.class, SummarizedMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.basedata.bsm.mocha.com", name = "minValue", scope = SummarizedMetricData.class)
    public JAXBElement<String> createSummarizedMetricDataMinValue(String value) {
        return new JAXBElement<String>(_SummarizedMetricDataMinValue_QNAME, String.class, SummarizedMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.basedata.bsm.mocha.com", name = "metricId", scope = SummarizedMetricData.class)
    public JAXBElement<String> createSummarizedMetricDataMetricId(String value) {
        return new JAXBElement<String>(_SummarizedMetricDataMetricId_QNAME, String.class, SummarizedMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.basedata.bsm.mocha.com", name = "maxValue", scope = SummarizedMetricData.class)
    public JAXBElement<String> createSummarizedMetricDataMaxValue(String value) {
        return new JAXBElement<String>(_SummarizedMetricDataMaxValue_QNAME, String.class, SummarizedMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "metricId", scope = SimpleMetricData.class)
    public JAXBElement<String> createSimpleMetricDataMetricId(String value) {
        return new JAXBElement<String>(_SimpleMetricDataMetricId_QNAME, String.class, SimpleMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "instanceId", scope = SimpleMetricData.class)
    public JAXBElement<String> createSimpleMetricDataInstanceId(String value) {
        return new JAXBElement<String>(_SimpleMetricDataInstanceId_QNAME, String.class, SimpleMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "metricName", scope = SimpleMetricData.class)
    public JAXBElement<String> createSimpleMetricDataMetricName(String value) {
        return new JAXBElement<String>(_SimpleMetricDataMetricName_QNAME, String.class, SimpleMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "metricUnit", scope = SimpleMetricData.class)
    public JAXBElement<String> createSimpleMetricDataMetricUnit(String value) {
        return new JAXBElement<String>(_SimpleMetricDataMetricUnit_QNAME, String.class, SimpleMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://obj.dev.bsm.mocha.com", name = "metricValue", scope = SimpleMetricData.class)
    public JAXBElement<String> createSimpleMetricDataMetricValue(String value) {
        return new JAXBElement<String>(_SimpleMetricDataMetricValue_QNAME, String.class, SimpleMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "frequencyId", scope = QuerySummaryMetricDataBatch.class)
    public JAXBElement<String> createQuerySummaryMetricDataBatchFrequencyId(String value) {
        return new JAXBElement<String>(_QuerySummaryMetricDataBatchFrequencyId_QNAME, String.class, QuerySummaryMetricDataBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metricdata.dev.bsm.mocha.com", name = "oneDay", scope = SummaryFrequency.class)
    public JAXBElement<String> createSummaryFrequencyOneDay(String value) {
        return new JAXBElement<String>(_SummaryFrequencyOneDay_QNAME, String.class, SummaryFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metricdata.dev.bsm.mocha.com", name = "oneHour", scope = SummaryFrequency.class)
    public JAXBElement<String> createSummaryFrequencyOneHour(String value) {
        return new JAXBElement<String>(_SummaryFrequencyOneHour_QNAME, String.class, SummaryFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metricdata.dev.bsm.mocha.com", name = "tenMins", scope = SummaryFrequency.class)
    public JAXBElement<String> createSummaryFrequencyTenMins(String value) {
        return new JAXBElement<String>(_SummaryFrequencyTenMins_QNAME, String.class, SummaryFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metricdata.dev.bsm.mocha.com", name = "thirtyMins", scope = SummaryFrequency.class)
    public JAXBElement<String> createSummaryFrequencyThirtyMins(String value) {
        return new JAXBElement<String>(_SummaryFrequencyThirtyMins_QNAME, String.class, SummaryFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metricdata.dev.bsm.mocha.com", name = "monitor", scope = SummaryFrequency.class)
    public JAXBElement<String> createSummaryFrequencyMonitor(String value) {
        return new JAXBElement<String>(_SummaryFrequencyMonitor_QNAME, String.class, SummaryFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metricdata.dev.bsm.mocha.com", name = "sixHours", scope = SummaryFrequency.class)
    public JAXBElement<String> createSummaryFrequencySixHours(String value) {
        return new JAXBElement<String>(_SummaryFrequencySixHours_QNAME, String.class, SummaryFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "resourceInsId", scope = QuerySummaryMetricData.class)
    public JAXBElement<String> createQuerySummaryMetricDataResourceInsId(String value) {
        return new JAXBElement<String>(_QueryRealTimeMetricDataResourceInsId_QNAME, String.class, QuerySummaryMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "frequencyId", scope = QuerySummaryMetricData.class)
    public JAXBElement<String> createQuerySummaryMetricDataFrequencyId(String value) {
        return new JAXBElement<String>(_QuerySummaryMetricDataBatchFrequencyId_QNAME, String.class, QuerySummaryMetricData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.metricdata.dev.bsm.mocha.com/", name = "metricId", scope = QuerySummaryMetricData.class)
    public JAXBElement<String> createQuerySummaryMetricDataMetricId(String value) {
        return new JAXBElement<String>(_QueryRealTimeMetricDataMetricId_QNAME, String.class, QuerySummaryMetricData.class, value);
    }

}
