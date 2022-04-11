package cn.com.yangshj.monitor.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * Create by yangshijie on 3/31/22
 */
@Slf4j
public class HttpClientUtil {

    public static String get(String url, Map<String, Object> params) {
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Content-Type", "application/json; charset=utf-8");
        return get(url, headerMap, params);
    }

    /**
     * 发送GET请求
     *
     * @param url     url
     * @param headers header
     * @param params  params
     * @return string
     * @throws ApiException ex
     */
    public static String get(String url, Map<String, String> headers, Map<String, Object> params)
            throws ApiException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            URIBuilder builder = new URIBuilder(url);
            if (params != null) {
                for (String key : params.keySet()) {
                    builder.addParameter(key, String.valueOf(params.get(key)));
                }
            }
            URI uri = builder.build();

            HttpGet httpGet = new HttpGet(uri);

            if (headers != null && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpGet.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
                }
            }

            response = httpclient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            log.error("HttpClientUtil get request error", e);
            throw new ApiException(e.getMessage());
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

    /**
     * 发送GET请求 下载文件
     *
     * @param url     url
     * @param headers header
     * @param params  params
     * @return InputStream
     * @throws ApiException ex
     */
    public static InputStream downloadFile(String url, Map<String, String> headers, Map<String, Object> params)
            throws ApiException {
        HttpClient httpclient = HttpClientBuilder.create().build();
        try {
            URIBuilder builder = new URIBuilder(url);
            if (params != null) {
                for (String key : params.keySet()) {
                    builder.addParameter(key, String.valueOf(params.get(key)));
                }
            }
            URI uri = builder.build();

            HttpGet httpGet = new HttpGet(uri);

            if (headers != null && headers.size() > 0) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpGet.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
                }
            }

            HttpResponse response = httpclient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity entity = response.getEntity();
                return entity.getContent();
            }
        } catch (Exception e) {
            log.error("HttpClientUtil get request error", e);
            throw new ApiException(e.getMessage());
        }
        return null;
    }

    public static String post(String url, Map<String, Object> params) {
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Content-Type", "application/json; charset=utf-8");
        return post(url, headerMap, params);
    }

    /**
     * 发送POST请求
     *
     * @param url     url
     * @param headers headers
     * @param params  params
     * @return string
     * @throws ApiException ex
     */
    public static String post(String url, Map<String, String> headers, Map<String, Object> params)
            throws ApiException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            HttpPost httpPost = new HttpPost(url);
            if (params != null) {
                List<NameValuePair> paramList = new ArrayList<>();
                for (String key : params.keySet()) {
                    paramList.add(new BasicNameValuePair(key, String.valueOf(params.get(key))));
                }
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList, "UTF-8");
                httpPost.setEntity(entity);
            }

            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpPost.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
                }
            }
            response = httpClient.execute(httpPost);

            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            } else {
                log.error(String.format("post error url:%s,entity:%s", url, response));
            }
        } catch (Exception e) {
            log.error("HttpClientUtil post request error", e);
            throw new ApiException(e.getMessage());
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

    public static String postJson(String url, Map<String, String> headers, String json)
            throws ApiException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new StringEntity(json, StandardCharsets.UTF_8));

            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpPost.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
                }
            }
            response = httpClient.execute(httpPost);

            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            } else {
                log.error("HttpClientUtil post request error,response" + JSON.toJSONString(response));
            }
        } catch (Exception e) {
            log.error("HttpClientUtil post request error", e);
            throw new ApiException(e.getMessage());
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

    /**
     * 发送DELETE请求
     *
     * @param url     url
     * @param headers headers
     * @param params  params
     * @return string
     * @throws ApiException ex
     */
    public static String delete(String url, Map<String, String> headers, Map<String, Object> params)
            throws ApiException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            URIBuilder builder = new URIBuilder(url);
            if (params != null) {
                for (String key : params.keySet()) {
                    builder.addParameter(key, String.valueOf(params.get(key)));
                }
            }
            URI uri = builder.build();

            HttpDelete httpDelete = new HttpDelete(uri);

            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpDelete.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
                }
            }

            response = httpClient.execute(httpDelete);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            log.error("HttpClientUtil delete request error", e);
            throw new ApiException(e.getMessage());
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

    /**
     * 发送post请求
     *
     * @param url url
     * @param xml xml
     * @return string
     * @throws ApiException ex
     */
    public static String post(String url, Map<String, String> headers, String xml) throws ApiException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new StringEntity(xml, "utf-8"));

            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    httpPost.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
                }
            }

            response = httpClient.execute(httpPost);

            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            log.error("HttpClientUtil post request error", e);
            throw new ApiException(e.getMessage());
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }
}
