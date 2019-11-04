package ci.xu.crawlerbase.biz.domain.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lz
 * @Date : 2019/7/23
 */
@Component("httpsTools")
@Slf4j
public class HttpsTools {
    @Resource(name = "httpClientFactoryBean")
    CloseableHttpClient httpClient;
    /**
     * https请求(http4)
     *
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public String sendPostMapDomain(String url, Map<String, Object> params) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Host","domain.ourui.com");
        httpPost.setHeader("Origin","http://domain.ourui.com");
        httpPost.setHeader("Referer","http://domain.ourui.com/reg/domainBatchApp2.asp");
        httpPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 SE 2.X MetaSr 1.0");
        httpPost.setHeader("Cookie","ASPSESSIONIDAQCTTBRT=BANPFAPDGFJCEKALDGKIHFED; __jsluid_h=4a95a250ab4110649cd1619027dd724b; IESESSION=alive; pgv_pvi=2425987072; pgv_si=s2684173312; ASPSESSIONIDCQARRCQS=CLGDGACDNPFDCGMGEONJILHH");
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        httpPost.addHeader("Accept-Language", "zh-cn");
        httpPost.addHeader("Accept-Encoding", "gzip, deflate");
        if (params != null) {
            List<NameValuePair> nvps = getNameValuePairArr(params);
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
        }
        String result = httpClient.execute(httpPost, new BasicResponseHandler());
        return result;
    }

    public String sendPostMap(String url, Map<String, Object> params) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        //httpPost.addHeader("Host","dy.mkxiu.cn");
        //httpPost.addHeader("Upgrade-Insecure-Requests","1");
        httpPost.addHeader("Connection","keep-alive");
        //httpPost.addHeader("Referer","http://sp.6080jx.com/?url=https://v.youku.com/v_show/id_XNDI3OTc1MzQyNA==.html");
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        httpPost.addHeader("Accept-Language", "zh-cn");
        httpPost.addHeader("Accept-Encoding", "gzip, deflate");
        if (params != null) {
            List<NameValuePair> nvps = getNameValuePairArr(params);
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
        }
        String result = httpClient.execute(httpPost, new BasicResponseHandler());
        return result;
    }

    public String sendGet(String url)throws IOException{

        HttpGet httpGet=new HttpGet(url);

        httpGet.addHeader("Host","dy.mkxiu.cn");
        httpGet.addHeader("Upgrade-Insecure-Requests","1");
        httpGet.addHeader("Connection","keep-alive");
        httpGet.addHeader("Referer","http://sp.6080jx.com/?url=https://v.youku.com/v_show/id_XNDI3OTc1MzQyNA==.html");
        //httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 SE 2.X MetaSr 1.0");
        //httpGet.addHeader("EagleId","7250bb1815641179179988864e");
        //httpGet.addHeader("x-forwarded-for","103.80.24.96:80");
        String result = httpClient.execute(httpGet, new BasicResponseHandler());
        return result;
    }




    private List<NameValuePair> getNameValuePairArr(Map<String, Object> parasMap) {
        List<NameValuePair> nvps = new ArrayList<>();
        for (Map.Entry<String, Object> parasEntry : parasMap.entrySet()) {
            String parasName = parasEntry.getKey();
            Object value = parasEntry.getValue();
            if (value instanceof List) {
                List dataList = (List) value;
                for (Object listEle : dataList) {
                    nvps.add(new BasicNameValuePair(parasName, listEle.toString()));
                }
            } else {
                nvps.add(new BasicNameValuePair(parasName, parasEntry.getValue() != null ? parasEntry.getValue().toString() : null));
                if (parasEntry.getValue() == null) {
//                    log.warn("发送http请求 参数:{} value为空", parasName);
                }
            }
        }
        return nvps;
    }

    public List<String> getNameList(String qian, String hou, int length, String yuming) {
        String qian1 = qian == null ? "" : qian;
        String hou1 = hou == null ? "" : hou;
        int forTimes = length-qian1.length()-hou1.length();
        if (forTimes < 0) {
            return new ArrayList<>();
        }
        Set<String> bodySet = new HashSet<>();
        String body = "";
        bodySet.add(body);
        for (int i = 0; i < forTimes; i++) {
            Set<String> itemSet = new HashSet<>();
            bodySet.forEach(item->itemSet.addAll(appendNameList(item)));
            bodySet.addAll(itemSet);
        }
        return bodySet.stream().map(i->qian1+i+hou1+"."+yuming).collect(Collectors.toList());
    }

    private List<String> appendNameList(String body) {
        List<String> list = new ArrayList<>();
        for (int i = 97; i <= 122; i++) {
            list.add(body+(char)i);
        }
        return list;
    }
}
